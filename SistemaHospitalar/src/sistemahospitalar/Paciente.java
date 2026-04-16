
package sistemahospitalar;


public class Paciente extends Pessoa{
    
    private String problema;

    public Paciente(String nome, int idade, String problema) {
        super(nome, idade);
        this.problema = problema;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Problema: " + problema);
    }

    public String getProblema() {
        return problema;
    }

    public void setProblema(String problema) {
        this.problema = problema;
    }
    
}
