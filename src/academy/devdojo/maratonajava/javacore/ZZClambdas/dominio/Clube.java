package academy.devdojo.maratonajava.javacore.ZZClambdas.dominio;

public class Clube {
    private String title;
    private int player;

    public Clube(String title, int player) {
        this.title = title;
        this.player = player;
    }

    public String getTitle() {
        return title;
    }

    public int getPlayer() {
        return player;
    }

    @Override
    public String toString() {
        return "Club{" +
                "title='" + title + '\'' +
                ", player=" + player +
                '}';
    }
}
