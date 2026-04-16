
package sistemaescolar;


public class Coordenador extends Pessoa{
    
    private String setor;

    public Coordenador(String nome, int idade, String setor) {
        super(nome, idade);
        this.setor = setor;
    }

    @Override
    public void trabalhar() {
        System.out.println("O coordenador está organizando o setor de " + setor + ".");
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }
    
}
