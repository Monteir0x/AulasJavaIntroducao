package academy.devdojo.maratonajava.javacore.Minterfaces.dominio;

public class DatabaseLoader implements DataLoader, DataRemover{
    @Override
    public void load() {
        System.out.println("Carregando dados do banco de dados");
    }

    @Override
    public void remove() {
        System.out.println("Removendo dados do bando de dados");
    }

    /** <b>Implementação do método <u>Default</u></b> "checkPermission" sem quebra do código
     * onde não fora implementado
     * */
    @Override
    public void checkPermission() {
        System.out.println("Checando permissões no banco de dados");
    }
    public static void retrieveMaxDataSize(){
        System.out.println("Dentro do retrieveMaxDataSize dentro da classe concreta");
    }
}
