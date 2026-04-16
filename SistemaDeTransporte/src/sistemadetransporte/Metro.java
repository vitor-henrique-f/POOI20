
package sistemadetransporte;

public class Metro extends Transporte{
    
    public Metro(int capacidade, String empresa, double tarifaBase) {
        super(capacidade, empresa, tarifaBase);
    }

    @Override
    public double calcularTarifa() {
        return getTarifaBase() * 0.9;
    }
    
}
