
package sistemadeveiculos;


public class Onibus extends Veiculo{
    
    public Onibus(String marca, String modelo, int ano) {
        super(marca, modelo, ano);
    }

    @Override
    public void mover() {
        System.out.println("O ônibus está transportando passageiros.");
    }
    
}
