
package sistemadepagamentos;


public class CartaoCredito extends Pagamento{
    
    public CartaoCredito(double valor, String data, String descricao) {
        super(valor, data, descricao);
    }

    @Override
    public void processarPagamento() {
        System.out.println("Pagamento de R$" + getValor() + " realizado com Cartão de Crédito.");
    }
}
