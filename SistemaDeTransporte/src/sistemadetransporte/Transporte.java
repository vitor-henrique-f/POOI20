
package sistemadetransporte;

public class Transporte {
    
    private int capacidade;
    private String empresa;
    private double tarifaBase;

    public Transporte(int capacidade, String empresa, double tarifaBase) {
        if (capacidade > 0) {
          this.capacidade = capacidade; 
        } else {
          System.out.println("Capacidade inválida");
        } 
        this.empresa = empresa;
        if (tarifaBase > 0) {
          this.tarifaBase = tarifaBase;
        } else {
          System.out.println("Tarifa inválida");
        }
    }

    public double calcularTarifa() {
        return tarifaBase;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public String getEmpresa() {
        return empresa;
    }

    public double getTarifaBase() {
        return tarifaBase;
    }

    public void setCapacidade(int capacidade) {
        if (capacidade > 0) {
          this.capacidade = capacidade; 
        } else {
          System.out.println("Capacidade inválida");
        } 
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public void setTarifaBase(double tarifaBase) {
        if (tarifaBase > 0) {
          this.tarifaBase = tarifaBase;
        } else {
          System.out.println("Tarifa inválida");
        }
    }

    
}
