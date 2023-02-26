package academy.devdojo.maratonajava.javacore.Dconstrutores.dominio;

public class Anime {
    private String tipo;
    private String name;
    private int episodios;
    private String gender;
    private String estudio;

    public Anime(String name, String tipo, int episodios, String gender) {
        this();
        this.name = name;
        this.tipo = tipo;
        this.episodios = episodios;
        this.gender = gender;
    }
    public Anime(String name, String tipo, int episodios, String gender, String estudio) {
        this(name, tipo, episodios, gender);
        this.estudio = estudio;
    }
    public Anime(){
        System.out.println("Dentro do construtor sem argumentos");
        

    }
    public void print() {
        System.out.println(this.name);
        System.out.println(this.tipo);
        System.out.println(this.episodios);
        System.out.println(this.gender);
        System.out.println(this.estudio);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }

    public int getEpisodios() {
        return this.episodios;
    }
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
