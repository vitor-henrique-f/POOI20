
package sistemadezoológico;


public class Papagaio extends Animal{
    
    public Papagaio(String nome, int idade, double peso) {
        super(nome, idade, peso);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " fala: Olá!");
    }

    @Override
    public void alimentar() {
        System.out.println(getNome() + " está comendo sementes.");
    }

    @Override
    public void movimentar() {
        System.out.println(getNome() + " está voando.");
    }
    
}
