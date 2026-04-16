
package sistemadetransporte;


public class Onibus extends Transporte{
    
    public Onibus(int capacidade, String empresa, double tarifaBase) {
        super(capacidade, empresa, tarifaBase);
    }

    @Override
    public double calcularTarifa() {
        return getTarifaBase();
    }
    
}
