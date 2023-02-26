package academy.devdojo.maratonajava.javacore.Dconstrutores.test;

import academy.devdojo.maratonajava.javacore.Dconstrutores.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Vascão", "FUTEBOL E REGATAS", 124, "CAMPEÃO", "Production IG");
        anime.print();
    }
}
