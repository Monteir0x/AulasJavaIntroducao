package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Clube;
import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Torcedor;

import java.util.HashMap;
import java.util.Map;

public class MapTest02 {
    public static void main(String[] args) {
        Torcedor torcedor1 = new Torcedor("Matheus");
        Torcedor torcedor2 = new Torcedor("Monteiro");

        Clube vascoDaGama = new Clube(128L, "Vasco da Gama", 600);
        Clube bangu = new Clube(12L, "Bangu", 7.3);
        Clube botafogo = new Clube(103L, "Botafogo", 423.6);
        Clube fluminense = new Clube(76L, "Fluminense", 123.4);
        Clube americaRj = new Clube(13L, "América RJ", 1.4);
        System.out.println(torcedor1);

        Map<Torcedor, Clube> torcedorClubeMap = new HashMap<>();
        torcedorClubeMap.put(torcedor1, vascoDaGama);
        torcedorClubeMap.put(torcedor2, bangu);
        for(Map.Entry<Torcedor, Clube> entry : torcedorClubeMap.entrySet()){
            System.out.println(entry.getKey().getNome() +" - " + entry.getValue().getNome());
        }
    }

}
