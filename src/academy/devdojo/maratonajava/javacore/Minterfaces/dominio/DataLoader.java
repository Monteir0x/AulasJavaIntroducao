package academy.devdojo.maratonajava.javacore.Minterfaces.dominio;

public interface DataLoader {
    public static final int MAX_DATA_SIZE = 10;
    public abstract void load();



    /** <b>O Método <u>Default</u></b> foi implementado no <b>Java 8</b> para
     * criar métodos padrão sem a necessidade de implementação nas classes
     * concretas, podendo assim realizar alterações <b>sem quebrar</b> o código
     * */
    public default void checkPermission(){
        System.out.println("Fazendo checagem de permissões");
    }

    public static void retrieveMaxDataSize(){
        System.out.println("Dentro do retrieveMaxDataSize dentro da Interface");
    }
}
