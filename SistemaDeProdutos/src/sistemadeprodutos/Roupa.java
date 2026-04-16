
package sistemadeprodutos;

public class Roupa extends Produto{
    
    public Roupa(String nome, double preco, int quantidade) {
        super(nome, preco, quantidade);
    }

    @Override
    public double calcularPrecoFinal() {
        return getPreco() * 0.95;
    }
    
}
