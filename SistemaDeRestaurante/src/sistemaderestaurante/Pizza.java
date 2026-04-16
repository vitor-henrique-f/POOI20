
package sistemaderestaurante;

public class Pizza extends ItemCardapio{
    
    public Pizza(String nome, double preco, String descricao) {
        super(nome, preco, descricao);
    }

    @Override
    public void preparar() {
        System.out.println("Preparando pizza: abrindo massa e adicionando recheio.");
    }

    @Override
    public double calcularPreco() {
        return getPreco() + 5.0;
    }
    
}
