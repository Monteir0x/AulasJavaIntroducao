package academy.devdojo.maratonajava.javacore.Zgenerics.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Torcedor;

import java.util.ArrayList;
import java.util.List;

public class GenericsTest01 {
    public static void main(String[] args) {
        // type erasure
        List<String> lista = new ArrayList<>();
        lista.add("Matheus");
        lista.add("Monteiro");


        for (String o : lista){
            System.out.println(o);
        }
        add(lista, new Torcedor("Monteiro"));
        for (Object o : lista){
            System.out.println(o);
        }
    }
    private static void add(List lista, Torcedor torcedor){
        lista.add(torcedor);
    }

}
