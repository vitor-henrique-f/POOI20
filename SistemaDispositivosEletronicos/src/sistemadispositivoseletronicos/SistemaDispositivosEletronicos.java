
package sistemadispositivoseletronicos;

public class SistemaDispositivosEletronicos {

    public static void main(String[] args) {

        Dispositivo d1 = new Computador("PC Gamer", "Dell");
        Dispositivo d2 = new Smartphone("Galaxy S", "Samsung");
        Dispositivo d3 = new Tablet("iPad", "Apple");
        Dispositivo d4 = new Televisao("Smart TV", "LG");

        Dispositivo[] dispositivos = {d1, d2, d3, d4};

        for (Dispositivo d : dispositivos) {
            d.ligar();
            d.executarFuncao();
            d.desligar();
            System.out.println("----------------------");
        }
        
    }
    
}
