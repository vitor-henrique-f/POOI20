
package sistemademidia;


public class Filme extends Midia{
    
    public Filme(String titulo, int duracao, String autor) {
        super(titulo, duracao, autor);
    }

    @Override
    public void reproduzir() {
        System.out.println("Assistindo filme: " + getTitulo() + " dirigido por " + getAutor());
    }
    
}
