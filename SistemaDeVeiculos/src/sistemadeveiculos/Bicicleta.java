
package sistemadeveiculos;


public class Bicicleta extends Veiculo{
    
    public Bicicleta(String marca, String modelo, int ano) {
        super(marca, modelo, ano);
    }

    @Override
    public void mover() {
        System.out.println("A bicicleta está sendo pedalada.");
    }
    
}
