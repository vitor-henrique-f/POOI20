
package sistemadepagamentos;

public class Dinheiro extends Pagamento{
    
    public Dinheiro(double valor, String data, String descricao) {
        super(valor, data, descricao);
    }

    @Override
    public void processarPagamento() {
        System.out.println("Pagamento de R$" + getValor() + " realizado em dinheiro.");
    }
    
}
