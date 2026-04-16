
package sistemadispositivoseletronicos;

public class Televisao extends Dispositivo{
    
    public Televisao(String nome, String marca) {
        super(nome, marca);
    }

    @Override
    public void executarFuncao() {
        System.out.println(getNome() + " está transmitindo canais.");
    }
    
}
