package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        // + - / *
        int numero01 = 10;
        int numero02 = 20;
        double resultado = numero01 / (double) numero02; // utilizando casting (não recomendado)


        System.out.println(resultado);

        // %
        int resto = 20 % 2;
        System.out.println(resto);

        // < >  <= >= == !=

        boolean isDezMaiorQueVinte = 10 >= 20;
        boolean isDezMenorQueVinte = 10 <= 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezDiferenteVinte = 10 != 20;
        System.out.println("isDezMaiorQueVinte "+isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte "+isDezMenorQueVinte);
        System.out.println("isDezIgualVinte "+isDezIgualVinte);
        System.out.println("isDezDiferenteVinte "+isDezDiferenteVinte);

        // AND (&&) OR (||)

        int idade = 35;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = idade > 30 && salario >4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;
        System.out.println("isDentroDaLeiMaiorQueTrinta "+ isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta "+ isDentroDaLeiMenorQueTrinta);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlatStation = 5000F;
        boolean isPLayStation5Compravel = valorTotalContaCorrente > valorPlatStation || valorTotalContaPoupanca > valorPlatStation;
        System.out.println("isPLayStation5Compravel " +isPLayStation5Compravel);

        // = += -= *= /= %=

        double bonus = 2000;
        bonus += 1000;
        bonus -= 1000;
        bonus *= 2;
        bonus /= 2;
        bonus %= 2;
        System.out.println(bonus);

        //

        int contador = 0;
        contador += 1;
        contador++;
        contador--;
        System.out.println(contador);

        int contador2 = 0;
        System.out.println(++contador2);
        System.out.println(contador2--);
        System.out.println(contador2);

    }
}
