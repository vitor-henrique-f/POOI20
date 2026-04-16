
package sistemadispositivoseletronicos;

public class Smartphone extends Dispositivo{
    
    public Smartphone(String nome, String marca) {
        super(nome, marca);
    }

    @Override
    public void executarFuncao() {
        System.out.println(getNome() + " está enviando mensagens.");
    }
    
}
