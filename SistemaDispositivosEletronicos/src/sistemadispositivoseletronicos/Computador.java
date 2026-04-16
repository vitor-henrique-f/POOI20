
package sistemadispositivoseletronicos;

public class Computador extends Dispositivo{
    
    public Computador(String nome, String marca) {
        super(nome, marca);
    }

    @Override
    public void executarFuncao() {
        System.out.println(getNome() + " está rodando programas pesados.");
    }
    
}
