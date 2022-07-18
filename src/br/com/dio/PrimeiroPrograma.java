package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {
    public static void main (String[] args){
        Gato gato = new Gato();
        System.out.println(gato);
        Livro Livro = new Livro("O problemas dos 3 corpos",300);
        System.out.println(Livro);
  }
}
class Livro {
    private String nome;
    private String npg;

    public Livro(String nome, int i) {
    }

    public Livro(String nome, String npg) {
        this.nome = nome;
        this.npg = npg;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNpg() {
        return npg;
    }

    public void setNpg(String npg) {
        this.npg = npg;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", npg='" + npg + '\'' +
                '}';
    }
}
