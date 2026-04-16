
package sistemaderestaurante;


public class Bebida extends ItemCardapio{
    
    public Bebida(String nome, double preco, String descricao) {
        super(nome, preco, descricao);
    }

    @Override
    public void preparar() {
        System.out.println("Servindo bebida gelada.");
    }

    @Override
    public double calcularPreco() {
        return getPreco(); // preço normal
    }
    
}
