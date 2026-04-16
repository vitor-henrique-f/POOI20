
package sistemadeimoveis;

public class SistemaDeImoveis {

    public static void main(String[] args) {

        Imovel i1 = new Casa("Rua A", 200000, 120);
        Imovel i2 = new Apartamento("Av B", 300000, 80);
        Imovel i3 = new Terreno("Rua C", 150000, 200);
        Imovel i4 = new SalaComercial("Centro", 500000, 100);

        Imovel[] imoveis = {i1, i2, i3, i4};

        for (Imovel i : imoveis) {
            System.out.println("Endereço: " + i.getEndereco());
            System.out.println("Imposto: R$" + i.calcularImposto());
            System.out.println("----------------------");
        }

    }
    
}
