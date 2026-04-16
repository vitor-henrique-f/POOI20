
package sistemaformasgeometricas;

public class Quadrado extends Forma{
    
    private double lado;

    public Quadrado(double lado) {
        if (lado >= 0) {
          this.lado = lado;
        } else {
            System.out.println("Lados inválidos");
        }
    }

    @Override
    public double calcularArea() {
        return lado * lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        if (lado >= 0) {
          this.lado = lado;
        } else {
            System.out.println("Lados inválidos");
        }
    }
    
}
