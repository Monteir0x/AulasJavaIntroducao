package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Torcedor;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapTest01 {
    Torcedor torcedor1 = new Torcedor("Matheus");
    Torcedor torcedor2 = new Torcedor("Monteiro");
    public static void main(String[] args) {

        NavigableMap<String, String> map = new TreeMap<>();
        map.put("A", "Letra A");
        map.put("B", "Letra B");
        map.put("C", "Letra C");
        map.put("D", "Letra D");
        map.put("E", "Letra E");
        for(Map.Entry<String, String> entry : map.entrySet()){
            System.out.println(entry.getKey() +" " + entry.getValue());
        }
        System.out.println(map.headMap("C"));
    }
}
