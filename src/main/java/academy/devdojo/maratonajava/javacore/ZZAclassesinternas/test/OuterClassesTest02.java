package academy.devdojo.maratonajava.javacore.ZZAclassesinternas.test;

import org.w3c.dom.ls.LSOutput;

public class OuterClassesTest02 {
    private String name = "Matheus";

    void print(final String param) {
       final String lastName = "Monteiro";
        class LocalClass {
            public void printLocal() {
                System.out.println(param + ",");


                System.out.println(name + " " + lastName);
            }
        }
        new LocalClass().printLocal();

    }

    public static void main(String[] args) {
        OuterClassesTest02 outer = new OuterClassesTest02();
        outer.print(outer.name);
    }
}
