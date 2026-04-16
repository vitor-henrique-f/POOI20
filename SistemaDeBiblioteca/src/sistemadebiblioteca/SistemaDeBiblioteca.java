
package sistemadebiblioteca;


public class SistemaDeBiblioteca {

    public static void main(String[] args) {

        ItemBiblioteca i1 = new Livro("Java Básico", 1, true);
        ItemBiblioteca i2 = new Revista("Tech News", 2, true);
        ItemBiblioteca i3 = new Jornal("Diário Local", 3, true);
        ItemBiblioteca i4 = new DVD("Filme Ação", 4, true);

        ItemBiblioteca[] itens = {i1, i2, i3, i4};

        for (ItemBiblioteca item : itens) {
            item.emprestar();
            item.devolver();
            System.out.println("----------------------");
        } 

    }
    
}
