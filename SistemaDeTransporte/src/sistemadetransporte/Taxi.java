
package sistemadetransporte;


public class Taxi extends Transporte{
    
    public Taxi(int capacidade, String empresa, double tarifaBase) {
        super(capacidade, empresa, tarifaBase);
    }

    @Override
    public double calcularTarifa() {
        return getTarifaBase() * 1.25;
    }
    
}
