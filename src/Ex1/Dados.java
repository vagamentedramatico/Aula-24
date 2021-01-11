package Ex1;

import java.io.Serializable;

public class Dados implements Serializable {
    private String nome;
    private String texto;
    private String titulo;

    public Dados(String nome, String texto, String titulo) {
        this.nome = nome;
        this.texto = texto;
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return "Eu sou o/a " + titulo + " " + nome + " e gosto de " + texto + "!";
    }
}
