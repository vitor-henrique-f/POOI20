
package sistemadepagamentos;

public class Boleto extends Pagamento{
    
    public Boleto(double valor, String data, String descricao) {
        super(valor, data, descricao);
    }

    @Override
    public void processarPagamento() {
        System.out.println("Boleto gerado no valor de R$" + getValor() + ".");
    }
    
}
