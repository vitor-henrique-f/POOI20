
package sistemahospitalar;


public class Medico extends Pessoa{
    
    private String especialidade;

    public Medico(String nome, int idade, String especialidade) {
        super(nome, idade);
        this.especialidade = especialidade;
    }

    @Override
    public void realizarAtendimento() {
        System.out.println("Médico " + getNome() + " está atendendo como " + especialidade + ".");
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
    
}
