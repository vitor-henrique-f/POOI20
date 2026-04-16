
package sistemadeimoveis;

public class SalaComercial extends Imovel{
    
    public SalaComercial(String endereco, double preco, double metragem) {
        super(endereco, preco, metragem);
    }

    @Override
    public double calcularImposto() {
        return getPreco() * 0.02;
    }
    
}
