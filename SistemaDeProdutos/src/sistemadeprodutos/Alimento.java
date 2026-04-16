
package sistemadeprodutos;

public class Alimento extends Produto{
    
    public Alimento(String nome, double preco, int quantidade) {
        super(nome, preco, quantidade);
    }

    @Override
    public double calcularPrecoFinal() {
        return getPreco() * 1.08;
    }
    
}
