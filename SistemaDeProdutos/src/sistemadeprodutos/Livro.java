
package sistemadeprodutos;

public class Livro extends Produto{
   
    public Livro(String nome, double preco, int quantidade) {
        super(nome, preco, quantidade);
    }

    @Override
    public double calcularPrecoFinal() {
        return getPreco() * 0.9; 
    }
    
}
