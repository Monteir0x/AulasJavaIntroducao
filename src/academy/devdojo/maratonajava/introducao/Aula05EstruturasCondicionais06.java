package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais06 {
    public static void main(String[] args) {
        // Dados os valores de 1 a 7, imprima se é dia útil ou dia da semana
        // Considerando 1 como domingo

        int day = 5;

        if(day == 1 || day == 7){
            System.out.println("Final de Semana");
        }else if(day == 2 || day == 3 || day == 4 || day == 5 || day == 6){
            System.out.println("Dia Útil");
        } else {
            System.out.println("Dia Inválido");
        }
    }
}
