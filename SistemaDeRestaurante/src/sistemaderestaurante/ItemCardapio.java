
package sistemaderestaurante;

public class ItemCardapio {
    
    private String nome;
    private double preco;
    private String descricao;

    public ItemCardapio(String nome, double preco, String descricao) {
        this.nome = nome;
        if (preco > 0) {
          this.preco = preco;  
        } else {
            System.out.println("Preço inválido");
        }
        this.descricao = descricao;
    }

    public void preparar() {
        System.out.println("Preparando item do cardápio...");
    }

    public double calcularPreco() {
        return preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public String getDescricao() {
        return descricao;
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

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
}
