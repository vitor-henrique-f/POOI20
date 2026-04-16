
package sistemadebiblioteca;


public class Jornal extends ItemBiblioteca{
    
    public Jornal(String titulo, int codigo, boolean disponivel) {
        super(titulo, codigo, disponivel);
    }

    @Override
    public void emprestar() {
        System.out.println("Jornal: empréstimo apenas para leitura rápida.");
        super.emprestar();
    }
    
}
