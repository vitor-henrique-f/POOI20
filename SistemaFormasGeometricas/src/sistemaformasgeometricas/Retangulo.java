
package sistemaformasgeometricas;

public class Retangulo extends Forma{
    
    private double base;
    private double altura;

    public Retangulo(double base, double altura) {
        if (base > 0) {
          this.base = base;
        } else {
          System.out.println("Base inválida");
        }
        if (altura > 0) {
          this.altura = altura;
        } else {
            System.out.println("Altura inválida");
        }
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        if (base > 0) {
          this.base = base;
        } else {
          System.out.println("Base inválida");
        }
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        if (altura > 0) {
          this.altura = altura;
        } else {
            System.out.println("Altura inválida");
        }
    }
    
}
