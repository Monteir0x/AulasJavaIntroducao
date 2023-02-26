package academy.devdojo.maratonajava.javacore.BintroducaoMetodos.dominio;

public class FuncionariosExercicio {
    private String name;
    private int age;
    private double[] salarys;
    private double media;


    public void print() {
        if (salarys == null) {
            return;
        }
        System.out.println(this.name);
        System.out.println(this.age);

        for (double salary : this.salarys) {
            System.out.println("salario :" + salary);
        }
    }

    public void media() {
        if (salarys == null) {
            return;
        }
        for (double salary : this.salarys) {
            media += salary;
        }
        media /= salarys.length;
        System.out.println("Média salarial " + media);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double[] getSalarys() {
        return salarys;
    }

    public void setSalarys(double[] salarys) {
        this.salarys = salarys;
    }

    public double getMedia() {
        return media;
    }
}
