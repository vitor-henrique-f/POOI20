
package sistemadepagamentos;


public class Pix extends Pagamento{
    
    public Pix(double valor, String data, String descricao) {
        super(valor, data, descricao);
    }

    @Override
    public void processarPagamento() {
        System.out.println("Pagamento de R$" + getValor() + " realizado via Pix.");
    }
    
}
