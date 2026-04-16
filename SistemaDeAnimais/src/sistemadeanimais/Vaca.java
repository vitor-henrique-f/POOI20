
package sistemadeanimais;


public class Vaca extends Animal{
    
    public Vaca(String nome, int idade) {
        super(nome, idade, "Vaca");
    }

    @Override
    public void emitirSom() {
        System.out.println("A vaca muge: Muuu!");
    }
    
}
