
package sistemadebiblioteca;


public class Revista extends ItemBiblioteca{
    
    public Revista(String titulo, int codigo, boolean disponivel) {
        super(titulo, codigo, disponivel);
    }

    @Override
    public void emprestar() {
        System.out.println("Revista: empréstimo por tempo reduzido.");
        super.emprestar();
    }
    
}
