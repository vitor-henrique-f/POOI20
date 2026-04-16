
package sistemadepagamentos;


public class Pagamento{
    
    private double valor;
    private String data;
    private String descricao;

    public Pagamento(double valor, String data, String descricao) {
        if (valor > 0) {
          this.valor = valor;
        } else {
          System.out.println("Valor inválido");
        }
        this.data = data;
        this.descricao = descricao;
    }

    public void processarPagamento() {
        System.out.println("Processando pagamento...");
    }

    public double getValor() {
        return valor;
    }

    public String getData() {
        return data;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setValor(double valor) {
        if (valor > 0) {
          this.valor = valor;
        } else {
          System.out.println("Valor inválido");
        }
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
}
