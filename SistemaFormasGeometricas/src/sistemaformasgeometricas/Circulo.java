
package sistemaformasgeometricas;


public class Circulo extends Forma{
    
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * raio * raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        if (raio > 0) {
          this.raio = raio;
        } else {
          System.out.println("Raio inválido");
        } 
    }
    
}
