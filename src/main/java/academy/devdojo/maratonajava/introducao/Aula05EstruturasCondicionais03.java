package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        // doar se salário > 5000
        double salario = 6000;
        // (condicao) ? verdadeiro: falso
        String resultado = salario > 5000? "Eu vou doar 500 pro Monteirinho" : "Ainda nao tenho condições, mas vou ter";
        boolean possoDoar = salario > 5000;
        System.out.println(resultado);

    }
}
