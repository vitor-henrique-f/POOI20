
package sistemadeimoveis;

public class Imovel {
    
    private String endereco;
    private double preco;
    private double metragem;

    public Imovel(String endereco, double preco, double metragem) {
        this.endereco = endereco;
        if (preco > 0) {
          this.preco = preco;
        } else {
          System.out.println("Preço inválido");
        }
        if (metragem > 0) {
          this.metragem = metragem; 
        } else {
          System.out.println("Metragem inválida");
        } 
    }

    public double calcularImposto() {
        return preco * 0.01; 
    }

    public String getEndereco() {
        return endereco;
    }

    public double getPreco() {
        return preco;
    }

    public double getMetragem() {
        return metragem;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setPreco(double preco) {
        if (preco > 0) {
          this.preco = preco;
        } else {
          System.out.println("Preço inválido");
        }
    }

    public void setMetragem(double metragem) {
        if (metragem > 0) {
          this.metragem = metragem; 
        } else {
          System.out.println("Metragem inválida");
        } 
    }
    
}
