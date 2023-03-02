package academy.devdojo.maratonajava.javacore.Ycolecoes.dominio;

import java.util.Objects;

public class Clube implements Comparable<Clube> {
    private Long id;
    private String nome;
    private double valor;
    private int jogadores;

    public Clube(Long id, String nome, double valor) {
        Objects.requireNonNull(id, "ID não pode ser null");
        Objects.requireNonNull(nome, "Nome não pode ser null");
        this.id = id;
        this.nome = nome;
        this.valor = valor;
    }

    public Clube(Long id, String nome, double valor, int jogadores) {
        this(id,nome,valor);
        this.jogadores = jogadores;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Clube clube = (Clube) o;
        return Objects.equals(id, clube.id) && Objects.equals(nome, clube.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome);
    }

    @Override
    public String toString() {
        return "Clube{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", valor=" + valor +
                ", jogadores=" + jogadores +
                '}';
    }

    public int getJogadores() {
        return jogadores;
    }

    public void setJogadores(int jogadores) {
        this.jogadores = jogadores;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public int compareTo(Clube outroClube) {
       // if(this.id < outroClube.getId()){
       //     return -1;
       // }
       // else if(this.id.equals(outroClube.getId())){
       //     return 0;
       // }else {
       //     return 1;
       // }


        return this.nome.compareTo(outroClube.getNome());
         // return this.id.compareTo(outroClube.getId());
        // return Double.compare(valor, outroClube.getValor());
    }
}
