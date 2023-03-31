package academy.devdojo.maratonajava.javacore.ZZIjdbc.repository;

import academy.devdojo.maratonajava.javacore.ZZIjdbc.conn.ConnectionFactory;
import academy.devdojo.maratonajava.javacore.ZZIjdbc.dominio.Producer;
import lombok.extern.log4j.Log4j2;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Log4j2
public class ProducerRepository {
    public static void save(Producer producer) {
        String sql = "INSERT INTO `anime_store`.`producer` (`name`) VALUES ('%s');".formatted(producer.getName());
        try (Connection conn = ConnectionFactory.getConnection(); Statement stmt = conn.createStatement()) {
            int rowsAffected = stmt.executeUpdate(sql);
            log.info("Inserted producer '{}' in the database, rows affected '{}'", producer.getName(), rowsAffected);
        } catch (SQLException e) {
            log.error("Error while trying to insert producer '{}'", producer.getName(), e);
            e.printStackTrace();
        }
    }

    public static void saveTransaction(List<Producer> producers) {
        try (Connection conn = ConnectionFactory.getConnection()) {
            conn.setAutoCommit(false);
            preparedStatementSaveTransaction(conn, producers);
            conn.commit();
            conn.setAutoCommit(true);
        } catch (SQLException e) {
            log.error("Error while trying to save producers '{}'", producers, e);
            e.printStackTrace();
        }
    }

    private static void preparedStatementSaveTransaction(Connection conn, List<Producer> producers) throws SQLException {
        String sql = "INSERT INTO `anime_store`.`producer` (`name`) VALUES (?);";
        boolean shouldRollBack = false;
        for (Producer p : producers) {
            try (PreparedStatement ps = conn.prepareStatement(sql)) {
                log.info("Saving producer '{}'", p.getName());
                ps.setString(1, p.getName());
                ps.execute();
            } catch (SQLException e) {
                e.printStackTrace();
                shouldRollBack = true;
            }
        }
        if (shouldRollBack){
            log.warn("Transaction is going to be rollback");
            conn.rollback();
        }
    }

    public static void delete(int id) {
        String sql = "DELETE FROM `anime_store`.`producer` WHERE  `id`=%d;".formatted(id);
        try (Connection conn = ConnectionFactory.getConnection(); Statement stmt = conn.createStatement()) {
            int rowsAffected = stmt.executeUpdate(sql);
            log.info("Deleted producer '{}' from the database, rows affected '{}'", id, rowsAffected);
        } catch (SQLException e) {
            log.error("Error while trying to delete producer '{}'", id, e);
            e.printStackTrace();
        }
    }

    public static void update(Producer producer) {
        String sql = "UPDATE `anime_store`.`producer` SET `name`='%s' WHERE  `id`=%d;".formatted(producer.getName(), producer.getId());
        try (Connection conn = ConnectionFactory.getConnection(); Statement stmt = conn.createStatement()) {
            int rowsAffected = stmt.executeUpdate(sql);
            log.info("Updated producer '{}' , rows affected '{}'", producer.getId(), rowsAffected);
        } catch (SQLException e) {
            log.error("Error while trying to update producer '{}'", producer.getId(), e);
            e.printStackTrace();
        }
    }

    public static void updatePreparedStatement(Producer producer) {
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement ps = preparedStatementUpdated(conn, producer)) {
            int rowsAffected = ps.executeUpdate();
            log.info("Updated producer '{}' , rows affected '{}'", producer.getId(), rowsAffected);
        } catch (SQLException e) {
            log.error("Error while trying to update producer '{}'", producer.getId(), e);
            e.printStackTrace();
        }
    }

    private static PreparedStatement preparedStatementUpdated(Connection conn, Producer producer) throws SQLException {
        String sql = "UPDATE `anime_store`.`producer` SET `name`= ? WHERE  `id`= ?;".formatted(producer.getName(), producer.getId());
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, producer.getName());
        ps.setInt(1, producer.getId());
        return ps;

    }

    public static List<Producer> findAll() {
        log.info("Finding all Producers");
        return findByName("");

    }

    public static List<Producer> findByName(String name) {
        log.info("Finding Producers by name");
        String sql = "SELECT * FROM anime_store.producer WHERE NAME LIKE '%%%s%%';".formatted(name);
        List<Producer> producers = new ArrayList<>();
        try (Connection conn = ConnectionFactory.getConnection(); Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {
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

    public static List<Producer> findByNamePreparedStatement(String name) {
        log.info("Finding Producers by name");

        List<Producer> producers = new ArrayList<>();
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement ps = preparedStatementFindByName(conn, name);
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

    public static List<Producer> findByNameCallableStatement(String name) {
        log.info("Finding Producers by name");

        List<Producer> producers = new ArrayList<>();
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement ps = callableStatementFindByName(conn, name);
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

    private static CallableStatement callableStatementFindByName(Connection conn, String name) throws SQLException {
        String sql = "CALL `sp_get_procedure_by_name`(?);";
        CallableStatement cs = conn.prepareCall(sql);
        cs.setString(1, String.format("%%%s%%", name));
        return cs;

    }

    private static PreparedStatement preparedStatementFindByName(Connection conn, String name) throws SQLException {
        String sql = "SELECT * FROM anime_store.producer WHERE NAME LIKE ?;";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, String.format("%%%s%%", name));
        return ps;

    }

    public static void showProducerMetadata() {
        log.info("Showing Producer Metadata");
        String sql = "SELECT * FROM anime_store.producer ";
        try (Connection conn = ConnectionFactory.getConnection(); Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {
            ResultSetMetaData rsMetaData = rs.getMetaData();
            int columnCount = rsMetaData.getColumnCount();
            log.info("Columns count '{}'", columnCount);
            for (int i = 1; i <= columnCount; i++) {
                log.info("Table name'{}'", rsMetaData.getTableName(i));
                log.info("Column name'{}'", rsMetaData.getColumnName(i));
                log.info("Column size'{}'", rsMetaData.getColumnDisplaySize(i));
                log.info("Column type'{}'", rsMetaData.getColumnTypeName(i));

            }

        } catch (SQLException e) {
            log.error("Error while trying to find all producers '{}'", e);
            e.printStackTrace();
        }
    }

    public static void showDriverMetadata() {
        log.info("Showing Driver Metadata");
        try (Connection conn = ConnectionFactory.getConnection()) {
            DatabaseMetaData dbMetaData = conn.getMetaData();
            if (dbMetaData.supportsResultSetType(ResultSet.TYPE_FORWARD_ONLY)) {
                log.info("Supports TYPE_FORWARD_ONLY");
                if (dbMetaData.supportsResultSetConcurrency(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_UPDATABLE))
                    log.info("And Supports CONCUR_UPDATABLE");
            }
            if (dbMetaData.supportsResultSetType(ResultSet.TYPE_SCROLL_INSENSITIVE)) {
                log.info("Supports TYPE_SCROLL_INSENSITIVE");
                if (dbMetaData.supportsResultSetConcurrency(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE))
                    log.info("And Supports CONCUR_UPDATABLE");
            }

            // Poucos drivers implementam esse tipo: Ele permite ver as alterações sem ter que realizar uma nova busca
            // Pois elas acontecem em tempo real, diferente do tipo insensitivo
            if (dbMetaData.supportsResultSetType(ResultSet.TYPE_SCROLL_SENSITIVE)) {
                log.info("Supports TYPE_SCROLL_SENSITIVE");
                if (dbMetaData.supportsResultSetConcurrency(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE))
                    log.info("And Supports CONCUR_UPDATABLE");
            }
        } catch (SQLException e) {
            log.error("Error while trying to find all producers '{}'", e);
            e.printStackTrace();
        }

    }

    public static void showTypeScrollWorking() {
        log.info("Finding Producers by name");
        String sql = "SELECT * FROM anime_store.producer;";

        try (Connection conn = ConnectionFactory.getConnection(); Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE); ResultSet rs = stmt.executeQuery(sql)) {

            log.info("Last Row? '{}'", rs.last());
            log.info("Row Number '{}'", rs.getRow());
            log.info(Producer.builder().id(rs.getInt("id")).name(rs.getString("name")).build());


            log.info("First Row? '{}'", rs.first());
            log.info("Row Number '{}'", rs.getRow());
            log.info(Producer.builder().id(rs.getInt("id")).name(rs.getString("name")).build());

            log.info("Row Absolute? '{}'", rs.absolute(2));
            log.info("Row Number '{}'", rs.getRow());
            log.info(Producer.builder().id(rs.getInt("id")).name(rs.getString("name")).build());

            log.info("Row Relative? '{}'", rs.relative(-1));
            log.info("Row Number '{}'", rs.getRow());
            log.info(Producer.builder().id(rs.getInt("id")).name(rs.getString("name")).build());

            log.info("is last? '{}'", rs.isLast());
            log.info("Row Number '{}'", rs.getRow());

            log.info("is first? '{}'", rs.isFirst());
            log.info("Row Number '{}'", rs.getRow());

            rs.last();
            rs.next();
            log.info("is last? '{}'", rs.isAfterLast());

            while (rs.previous()) {
                log.info(Producer.builder().id(rs.getInt("id")).name(rs.getString("name")).build());

            }

        } catch (SQLException e) {
            log.error("Error while trying to find all producers '{}'", e);
            e.printStackTrace();
        }
    }

    public static List<Producer> findByNameAndUpdateToUpperCase(String name) {
        log.info("Finding Producers by name");
        String sql = "SELECT * FROM anime_store.producer WHERE NAME LIKE '%%%s%%';".formatted(name);
        List<Producer> producers = new ArrayList<>();
        try (Connection conn = ConnectionFactory.getConnection();
             Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                rs.updateString("name", rs.getString("name").toUpperCase());
                rs.updateRow();
                // para desfazer alteração podemos usar rs.cancelRowUpdates();
                // somente pode ser realizado antes do rs.updateRow, uma vez updated não pode se voltar atrás.
                Producer producer = Producer.builder().id(rs.getInt("id")).name(rs.getString("name")).build();
                producers.add(producer);
            }
        } catch (SQLException e) {
            log.error("Error while trying to find all producers '{}'", e);
            e.printStackTrace();
        }
        return producers;
    }

    public static List<Producer> findByNameAndInsertWhenNotFound(String name) {
        log.info("Finding Producers by name");
        String sql = "SELECT * FROM anime_store.producer WHERE NAME LIKE '%%%s%%';".formatted(name);
        List<Producer> producers = new ArrayList<>();
        try (Connection conn = ConnectionFactory.getConnection();
             Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
             ResultSet rs = stmt.executeQuery(sql)) {
            if (rs.next()) return producers;

            insertNewProducer(name, rs);

            producers.add(getProducer(rs));

        } catch (SQLException e) {
            log.error("Error while trying to find all producers '{}'", e);
            e.printStackTrace();
        }
        return producers;
    }

    public static void findByNameAndDelete(String name) {
        log.info("Finding Producers by name");
        String sql = "SELECT * FROM anime_store.producer WHERE NAME LIKE '%%%s%%';".formatted(name);
        List<Producer> producers = new ArrayList<>();
        try (Connection conn = ConnectionFactory.getConnection();
             Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                log.info("Deleting '{}'", rs.getString("name"));
                rs.deleteRow();
            }

        } catch (SQLException e) {
            log.error("Error while trying to find all producers '{}'", e);
            e.printStackTrace();
        }

    }

    private static void insertNewProducer(String name, ResultSet rs) throws SQLException {
        rs.moveToInsertRow();
        rs.updateString("name", name);
        rs.insertRow();
    }

    private static Producer getProducer(ResultSet rs) throws SQLException {
        rs.beforeFirst();
        rs.next();
        Producer build = Producer.builder()
                .id(rs.getInt("id"))
                .name(rs.getString("name"))
                .build();
        return build;
    }
}























