
package sistemadeimoveis;

public class Terreno extends Imovel{
    
    public Terreno(String endereco, double preco, double metragem) {
        super(endereco, preco, metragem);
    }

    @Override
    public double calcularImposto() {
        return getPreco() * 0.008;
    }
    
}
