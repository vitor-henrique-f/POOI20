
package sistemadeprofissoes;

public class Engenheiro extends Profissao{
    
    public Engenheiro(String nome, String area, double salario) {
        super(nome, area, salario);
    }

    @Override
    public void executarTrabalho() {
        System.out.println(getNome() + " está desenvolvendo projetos de " + getArea() + ".");
    }
    
}
