
package sistemaderestaurante;


public class SistemaDeRestaurante {

    public static void main(String[] args) {
 
        ItemCardapio i1 = new Pizza("Calabresa", 30.0, "Pizza com calabresa");
        ItemCardapio i2 = new Hamburguer("X-Burger", 20.0, "Hambúrguer com queijo");
        ItemCardapio i3 = new Bebida("Refrigerante", 8.0, "Bebida gelada");
        ItemCardapio i4 = new Sobremesa("Pudim", 12.0, "Sobremesa doce");

        ItemCardapio[] itens = {i1, i2, i3, i4};

        for (ItemCardapio item : itens) {
            System.out.println("Item: " + item.getNome());
            item.preparar();
            System.out.println("Preço final: R$" + item.calcularPreco());
            System.out.println("----------------------");
        }
        
    }
    
}
