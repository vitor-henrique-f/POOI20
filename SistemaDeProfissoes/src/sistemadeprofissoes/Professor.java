
package sistemadeprofissoes;

public class Professor extends Profissao{
    
    public Professor(String nome, String area, double salario) {
        super(nome, area, salario);
    }

    @Override
    public void executarTrabalho() {
        System.out.println(getNome() + " está dando aula de " + getArea() + ".");
    }
    
}
