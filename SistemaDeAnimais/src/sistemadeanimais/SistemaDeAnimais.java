
package sistemadeanimais;


public class SistemaDeAnimais {

    
    public static void main(String[] args) {

        Animal a1 = new Cachorro("Rex", 3);
        Animal a2 = new Gato("Mimi", 2);
        Animal a3 = new Vaca("Mimosa", 5);
        Animal a4 = new Cavalo("Pé de Pano", 4);

        a1.emitirSom();
        a2.emitirSom();
        a3.emitirSom();
        a4.emitirSom();

    }
    
}
