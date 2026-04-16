
package sistemaformasgeometricas;

import java.util.ArrayList;

public class SistemaFormasGeometricas {

   
    public static void main(String[] args) {

        ArrayList<Forma> formas = new ArrayList<>();

        formas.add(new Quadrado(4));
        formas.add(new Retangulo(5, 3));
        formas.add(new Circulo(2.5));
        formas.add(new Triangulo(6, 2));

        for (Forma f : formas) {
            System.out.println("Área: " + f.calcularArea());
        }

    }
    
}
