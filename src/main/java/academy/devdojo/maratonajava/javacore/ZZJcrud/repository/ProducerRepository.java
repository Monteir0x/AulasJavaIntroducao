package academy.devdojo.maratonajava.javacore.ZZJcrud.repository;


import academy.devdojo.maratonajava.javacore.ZZJcrud.conn.ConnectionFactory;
import academy.devdojo.maratonajava.javacore.ZZJcrud.dominio.Producer;
import lombok.extern.log4j.Log4j2;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Log4j2
public class ProducerRepository {
    public static List<Producer> findByName(String name) {
        log.info("Finding Producers by name '{}'", name);

        List<Producer> producers = new ArrayList<>();
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement ps = createPreparedStatementFindByName(conn, name);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                Producer producer = Producer.builder().id(rs.getInt("id")).name(rs.getString("name")).build();
                producers.add(producer);
            }
        } catch (SQLException e) {
            log.error("Error while trying to find all producers '{}'", e);
            e.printStackTrace();
        }
        return producers;
    }

    private static PreparedStatement createPreparedStatementFindByName(Connection conn, String name) throws SQLException {
        String sql = "SELECT * FROM anime_store.producer WHERE NAME LIKE ?;";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, String.format("%%%s%%", name));
        return ps;

    }

    public static void delete(int id) {
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement ps = createPreparedStatementDelete(conn, id)) {
            ps.execute();
            log.info("Deleted producer '{}' from the database", id);
        } catch (SQLException e) {
            log.error("Error while trying to delete producer '{}'", id, e);
            e.printStackTrace();
        }
    }

    private static PreparedStatement createPreparedStatementDelete(Connection conn, Integer id) throws SQLException {
        String sql = "DELETE FROM `anime_store`.`producer` WHERE  `id`=?;";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1, id);
        return ps;
    }

    public static void save(Producer producer) {
        log.info("Saving Producer '{}'", producer.getName());
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement ps = createPrepareStatementSave(conn, producer)) {
            ps.execute();
        } catch (SQLException e) {
            log.error("Error while trying to save producer '{}'", producer.getName(), e);
            e.printStackTrace();
        }
    }

    private static PreparedStatement createPrepareStatementSave(Connection conn, Producer producer) throws SQLException {
        String sql = "INSERT INTO `anime_store`.`producer` (`name`) VALUES (?);";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, producer.getName());
        return ps;
    }

    public static Producer findById(Integer id) {
        log.info("Finding Producers by id '{}'", id);
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement ps = createPreparedStatementFindById(conn, id);
             ResultSet rs = ps.executeQuery()) {
            return rs.next() ? Producer.builder()
                    .id(rs.getInt("id"))
                    .name(rs.getString("name"))
                    .build()
                    : null;
        } catch (SQLException e) {
            log.error("Error while trying to find producer with ID '{}': {}", id, e.getMessage());
            throw new RuntimeException("Failed to find producer by ID", e);
        }
    }



    private static PreparedStatement createPreparedStatementFindById(Connection conn, Integer id) throws SQLException {
        String sql = "SELECT * FROM anime_store.producer WHERE id = ?;";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1, id);
        return ps;
    }

    public static void update(Producer producer) {
        log.info("Updating producer'{}'", producer);
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement ps = createprepareStatementUpdate(conn, producer)) {
            ps.execute();
        } catch (SQLException e) {
            log.error("Error while trying to update producer '{}'", producer.getId(), e);
            e.printStackTrace();
        }
    }

    private static PreparedStatement createprepareStatementUpdate(Connection conn, Producer producer) throws SQLException {
        String sql = "UPDATE `anime_store`.`producer` SET `name`= ? WHERE  `id`= ?;";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, producer.getName());
        ps.setInt(2, producer.getId());
        return ps;
    }
}
