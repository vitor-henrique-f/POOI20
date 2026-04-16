

package sistemadebiblioteca;


public class ItemBiblioteca {
    
    private String titulo;
    private int codigo;
    private boolean disponivel;

    public ItemBiblioteca(String titulo, int codigo, boolean disponivel) {
        this.titulo = titulo;
        this.codigo = codigo;
        this.disponivel = disponivel;
    }

    public void emprestar() {
        if (disponivel) {
            disponivel = false;
            System.out.println(titulo + " foi emprestado.");
        } else {
            System.out.println(titulo + " não está disponível.");
        }
    }

    public void devolver() {
        disponivel = true;
        System.out.println(titulo + " foi devolvido.");
    }

    public String getTitulo() {
        return titulo;
    }

    public int getCodigo() {
        return codigo;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
    
}
