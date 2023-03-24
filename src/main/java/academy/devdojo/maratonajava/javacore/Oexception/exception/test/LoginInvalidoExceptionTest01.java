package academy.devdojo.maratonajava.javacore.Oexception.exception.test;

import academy.devdojo.maratonajava.javacore.Oexception.exception.dominio.LoginInvalidoException;

import java.util.Scanner;

public class LoginInvalidoExceptionTest01 {
    public static void main(String[] args) {
        try {
            logar();
        } catch (LoginInvalidoException e) {
            e.printStackTrace();
        }
    }
    private static void logar() throws LoginInvalidoException {
        String userNameDB = "Monteiro";
        String senhaDB = "HERO";
        Scanner teclado = new Scanner(System.in);
        System.out.println("Usuário");
        String userNameDigitado = teclado.nextLine();
        System.out.println("Senha");
        String senhaDigitada = teclado.nextLine();
        if(!userNameDB.equals(userNameDigitado)){
            throw new LoginInvalidoException("Usuário Inválido");
        }else if(!senhaDB.equals(senhaDigitada)){
            throw new LoginInvalidoException("Senha Inválida");
        }else {
            System.out.println("Você está Conectado!");
        }
    }
}
