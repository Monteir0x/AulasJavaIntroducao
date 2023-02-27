package academy.devdojo.maratonajava.javacore.Oexception.exception.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest02 {
    public static void main(String[] args) throws IOException {
        criarNovoArquivo();
    }

    /**
     * em caso de métodos public, o ideal é throws, pois qualquer classe pode chamar<br>
     * em caso de private o ideal é trycatch, devido ao acesso ser mais restritivo
     */
    public static void criarNovoArquivo() throws IOException {
        File file = new File("arquivo\\test.txt");
        try {
            boolean isCriado = file.createNewFile();
            System.out.println("Arquivo criado " + isCriado);
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("Problema na hora de criar o arquivo.");
        }
    }
}
