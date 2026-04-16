
package sistemadezoológico;


public class Macaco extends Animal{
    
    public Macaco(String nome, int idade, double peso) {
        super(nome, idade, peso);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " faz: Uh uh ah ah!");
    }

    @Override
    public void alimentar() {
        System.out.println(getNome() + " está comendo frutas.");
    }

    @Override
    public void movimentar() {
        System.out.println(getNome() + " está pulando entre árvores.");
    }
    
}
