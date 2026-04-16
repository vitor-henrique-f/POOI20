
package sistemahospitalar;

public class Emfermeiro extends Pessoa{
    
    private String setor;

    public Emfermeiro(String nome, int idade, String setor) {
        super(nome, idade);
        this.setor = setor;
    }

    @Override
    public void realizarAtendimento() {
        System.out.println("Enfermeiro " + getNome() + " está auxiliando no setor de " + setor + ".");
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }
    
}
