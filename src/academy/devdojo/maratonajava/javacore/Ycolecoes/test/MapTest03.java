package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Clube;
import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Torcedor;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTest03 {
    public static void main(String[] args) {
        Torcedor torcedor1 = new Torcedor("Matheus");
        Torcedor torcedor2 = new Torcedor("Monteiro");

        Clube vascoDaGama = new Clube(128L, "Vasco da Gama", 600);
        Clube bangu = new Clube(12L, "Bangu", 7.3);
        Clube botafogo = new Clube(103L, "Botafogo", 423.6);
        Clube fluminense = new Clube(76L, "Fluminense", 123.4);
        Clube americaRj = new Clube(13L, "América RJ", 1.4);
        System.out.println(torcedor1);

        List<Clube> clubeTorcedor1List = List.of(vascoDaGama, bangu);
        List<Clube> clubeTorcedor2List = List.of(botafogo, americaRj);
        Map<Torcedor, List<Clube>> torcedorClubeMap = new HashMap<>();
        torcedorClubeMap.put(torcedor1, clubeTorcedor1List);
        torcedorClubeMap.put(torcedor2, clubeTorcedor2List);
        for(Map.Entry<Torcedor, List<Clube>> entry : torcedorClubeMap.entrySet()){
            System.out.println("---------" +entry.getKey().getNome());
            for (Clube clube : entry.getValue()) {
                System.out.println(clube.getNome());
            }

        }

    }

}
