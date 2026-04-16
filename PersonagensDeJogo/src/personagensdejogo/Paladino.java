
package personagensdejogo;

public class Paladino extends Personagem{
    
    public Paladino(String nome, int vida, int nivel) {
        super(nome, vida, nivel);
    }

    @Override
    public void atacar() {
        System.out.println(getNome() + " ataca com poder sagrado!");
    }

    @Override
    public void defender() {
        System.out.println(getNome() + " usa proteção divina!");
    }
    
}
