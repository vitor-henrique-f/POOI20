
package sistemadeprofissoes;


public class Advogado extends Profissao{
    
    public Advogado(String nome, String area, double salario) {
        super(nome, area, salario);
    }

    @Override
    public void executarTrabalho() {
        System.out.println(getNome() + " está defendendo um caso na área de " + getArea() + ".");
    }
    
}
