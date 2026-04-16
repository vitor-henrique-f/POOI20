
package sistemademidia;

public class Midia {
    
    private String titulo;
    private int duracao; // em minutos
    private String autor;

    public Midia(String titulo, int duracao, String autor) {
        this.titulo = titulo;
        if (duracao > 0) {
          this.duracao = duracao;
        } else {
          System.out.println("Duração invalída");
        }
        this.autor = autor;
    }

    public void reproduzir() {
        System.out.println("Reproduzindo mídia...");
    }

    public String getTitulo() {
        return titulo;
    }

    public int getDuracao() {
        return duracao;
    }

    public String getAutor() {
        return autor;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDuracao(int duracao) {
        if (duracao > 0) {
          this.duracao = duracao;
        } else {
          System.out.println("Duração invalída");
        }
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    
}
