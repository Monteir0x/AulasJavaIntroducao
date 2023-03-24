package academy.devdojo.maratonajava.javacore.ZZDoptional.domain;

public class Club {
    private Integer ID;
    private String name;
    private int titles;

    public Club(Integer ID, String name, int titles) {
        this.ID = ID;
        this.name = name;
        this.titles = titles;
    }

    public Integer getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public int getTitles() {
        return titles;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTitles(int titles) {
        this.titles = titles;
    }

    @Override
    public String toString() {
        return "Club{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", titles=" + titles +
                '}';
    }
}
