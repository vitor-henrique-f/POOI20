
package sistemadezoológico;


public class Leao extends Animal{
    
    public Leao(String nome, int idade, double peso) {
        super(nome, idade, peso);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " ruge: Roooar!");
    }

    @Override
    public void alimentar() {
        System.out.println(getNome() + " está comendo carne.");
    }

    @Override
    public void movimentar() {
        System.out.println(getNome() + " está correndo na savana.");
    }
    
}
