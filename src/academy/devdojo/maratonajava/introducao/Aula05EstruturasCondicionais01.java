package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
        int idade = 15;
        boolean isAutorizadoComprarBebida = idade >= 18;
        // operador de negação !
        if (isAutorizadoComprarBebida) {
            System.out.println("autorizado a comprar bebida alcoolica");
        } else{
            System.out.println("não autorizado a comprar bebida alcoolica");
        }

        if (!isAutorizadoComprarBebida){
            System.out.println("não autorizado a comprar bebida alcoolica");
        }
        boolean c = false;
        if (c = true){
            System.out.println("dentro de algo que nunca deve ser feito");
        }

        System.out.println("fora do if");
    }
}
