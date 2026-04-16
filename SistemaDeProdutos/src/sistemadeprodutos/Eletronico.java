
package sistemadeprodutos;


public class Eletronico extends Produto{
    
    public Eletronico(String nome, double preco, int quantidade) {
        super(nome, preco, quantidade);
    }

    @Override
    public double calcularPrecoFinal() {
        return getPreco() * 1.15; // 15% de taxa
    }
    
}
