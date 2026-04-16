
package sistemademidia;


public class Musica extends Midia{
    
    public Musica(String titulo, int duracao, String autor) {
        super(titulo, duracao, autor);
    }

    @Override
    public void reproduzir() {
        System.out.println("Tocando música: " + getTitulo() + " - " + getAutor());
    }
    
}
