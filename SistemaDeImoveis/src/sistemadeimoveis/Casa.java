
package sistemadeimoveis;


public class Casa extends Imovel{

    public Casa(String endereco, double preco, double metragem) {
        super(endereco, preco, metragem);
    }
    
    @Override
    public double calcularImposto() {
        return getPreco() * 0.012;
    
}
}