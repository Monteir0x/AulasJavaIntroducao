package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>(16);
        List<String> nomes2 = new ArrayList<>(16);
        nomes.add("Matheus");
        nomes2.add("Monteir0x");
        nomes2.add("Dev");
        nomes.add("Monteiro");

        nomes.addAll(nomes2);

        for(String nome: nomes){
            System.out.println(nome);
        }

        nomes.add("Brazil");
        System.out.println("-------------------------");

        for (int i=0;i < nomes.size(); i++){
            System.out.println(nomes.get(i));
        }

        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
    }
}
