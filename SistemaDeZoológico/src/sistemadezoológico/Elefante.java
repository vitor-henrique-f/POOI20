
package sistemadezoológico;


public class Elefante extends Animal{
    
    public Elefante(String nome, int idade, double peso) {
        super(nome, idade, peso);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " faz: Pruuu!");
    }

    @Override
    public void alimentar() {
        System.out.println(getNome() + " está comendo vegetação.");
    }

    @Override
    public void movimentar() {
        System.out.println(getNome() + " está caminhando lentamente.");
    }
    
}
