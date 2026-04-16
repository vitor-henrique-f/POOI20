
package sistemadetransporte;

public class Uber extends Transporte{
    
    public Uber(int capacidade, String empresa, double tarifaBase) {
        super(capacidade, empresa, tarifaBase);
    }

    @Override
    public double calcularTarifa() {
        return getTarifaBase() * 1.10; // +10% (taxa do app)
    }
    
}
