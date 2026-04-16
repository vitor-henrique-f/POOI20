
package sistemadepagamentos;

public class SistemaDePagamentos {

    public static void main(String[] args) {

        Pagamento p1 = new CartaoCredito(150.0, "16/04/2026", "Compra online");
        Pagamento p2 = new Pix(80.0, "16/04/2026", "Pagamento rápido");
        Pagamento p3 = new Boleto(200.0, "16/04/2026", "Conta de luz");
        Pagamento p4 = new Dinheiro(50.0, "16/04/2026", "Compra local");

        Pagamento[] pagamentos = {p1, p2, p3, p4};

        for (Pagamento p : pagamentos) {
            p.processarPagamento();
        }
        
    }
    
}
