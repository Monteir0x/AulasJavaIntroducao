package academy.devdojo.maratonajava.javacore.Oexception.runtime.test;

public class RuntimeExceptionTest02 {
    public static void main(String[] args) {
        try {
            divisao(1, 0);
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
        System.out.println("Codigo Finalizado");
    }/**
     * @param b  não pode ser zero
     * @throws IllegalArgumentException caso b seja zero
     */

        private static int divisao ( int a, int b){
            if (b == 0) {
                throw new IllegalArgumentException("Argumento Ilegal, não há divisibilidade por 0");
            }
            // try {
            return a / b;
            //} catch (RuntimeException e) {
            //     e.printStackTrace();
            // }
            // return 0;
        }

    }