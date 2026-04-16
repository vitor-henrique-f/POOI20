
package sistemadeveiculos;


public class Moto extends Veiculo{
    
    public Moto(String marca, String modelo, int ano) {
        super(marca, modelo, ano);
    }

    @Override
    public void mover() {
        System.out.println("A moto está acelerando rapidamente.");
    }
    
}
