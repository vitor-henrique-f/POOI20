
package sistemademidia;

public class Podcast extends Midia{
    
    public Podcast(String titulo, int duracao, String autor) {
        super(titulo, duracao, autor);
    }

    @Override
    public void reproduzir() {
        System.out.println("Ouvindo podcast: " + getTitulo() + " apresentado por " + getAutor());
    }
    
}
