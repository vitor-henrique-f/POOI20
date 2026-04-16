
package sistemaformasgeometricas;


public class Triangulo extends Forma{
    
    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
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
        return (base * altura) / 2;
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
