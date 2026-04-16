
package sistemadezoológico;


public class SistemaDeZoológico {

    public static void main(String[] args) {
        
        Animal a1 = new Leao("Simba", 5, 190);
        Animal a2 = new Macaco("George", 3, 35);
        Animal a3 = new Elefante("Dumbo", 10, 500);
        Animal a4 = new Papagaio("Loro", 2, 1.5);

        Animal[] animais = {a1, a2, a3, a4};

        for (Animal a : animais) {
            a.emitirSom();
            a.alimentar();
            a.movimentar();
            System.out.println("----------------------");
        }
        
    }
    
}
