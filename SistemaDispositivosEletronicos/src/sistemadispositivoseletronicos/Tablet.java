
package sistemadispositivoseletronicos;

public class Tablet extends Dispositivo{
    
    public Tablet(String nome, String marca) {
        super(nome, marca);
    }

    @Override
    public void executarFuncao() {
        System.out.println(getNome() + " está sendo usado para leitura.");
    }
    
}
