package academy.devdojo.maratonajava.javacore.Minterfaces.dominio;

public class FileLoader implements DataLoader, DataRemover{
    @Override
    public void load() {
        System.out.println("Carregando dados de um arquivo");
    }

    @Override
    public void remove() {
        System.out.println("Removendo dados de um arquivo");
    }

    /** <b>Implementação do método <u>Default</u></b> "checkPermission" sem quebra do código
     * onde não fora implementado
     * */
    @Override
    public void checkPermission() {
        System.out.println("Checando permissões no arquivo");
    }
}
