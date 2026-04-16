
package sistemadebiblioteca;

public class Livro extends ItemBiblioteca{
    
    public Livro(String titulo, int codigo, boolean disponivel) {
        super(titulo, codigo, disponivel);
    }

    @Override
    public void emprestar() {
        System.out.println("Livro: ");
        super.emprestar();
    }
    
}
