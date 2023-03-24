package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao04 {

    public static void main(String[] args) {
        // Dado o valor de um carro, descubra em quantas vezes ele pode ser parcelado
        // Condição valor da parcela >= 1000

        double valorDoAuto = 30000;

        for (int parcela = 0; parcela <= valorDoAuto; parcela++) {

            double valorParcela = valorDoAuto / parcela;
            if (valorParcela < 1000) {
                break;
            }
            System.out.println("Parcela " + parcela + " R$" + valorParcela);

        }
    }
}
