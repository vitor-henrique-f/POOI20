
package sistemadebiblioteca;

public class DVD extends ItemBiblioteca{
    
    public DVD(String titulo, int codigo, boolean disponivel) {
        super(titulo, codigo, disponivel);
    }

    @Override
    public void emprestar() {
        System.out.println("DVD: verificar danos antes do empréstimo.");
        super.emprestar();
    }
    
}
