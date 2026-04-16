
package sistemadeprodutos;


public class Produto {
    
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        if (preco > 0) {
          this.preco = preco;
        } else {
          System.out.println("Preço inválido");
        }
        if (quantidade > 0) {
          this.quantidade = quantidade;
        } else {
          System.out.println("Quantidade inválida");
        }
    }

    public double calcularPrecoFinal() {
        return preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        if (preco > 0) {
          this.preco = preco;
        } else {
          System.out.println("Preço inválido");
        }
    }

    public void setQuantidade(int quantidade) {
        if (quantidade > 0) {
          this.quantidade = quantidade;
        } else {
          System.out.println("Quantidade inválida");
        }
    }
    
}
