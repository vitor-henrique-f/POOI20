
package sistemademidia;

public class AudioLivro extends Midia{

    public AudioLivro(String titulo, int duracao, String autor) {
        super(titulo, duracao, autor);
    }   
   
    @Override
    public void reproduzir() {
        System.out.println("Ouvindo audiolivro: " + getTitulo() + " narrado por " + getAutor());
    }
    
}
