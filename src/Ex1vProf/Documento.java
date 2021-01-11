package Ex1vProf;

import java.io.Serializable;

public class Documento implements Serializable {
    private String nome;
    private String texto;
    private String titulo;

    public Documento(String nome, String texto, String titulo) {
        this.nome = nome;
        this.texto = texto;
        this.titulo = titulo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return "Documento{" +
                "nome='" + nome + '\'' +
                ", texto='" + texto + '\'' +
                ", titulo='" + titulo + '\'' +
                '}';
    }
}
