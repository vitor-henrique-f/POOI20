
package personagensdejogo;


public class Personagem {
    
    private String nome;
    private int vida;
    private int nivel;

    public Personagem(String nome, int vida, int nivel) {
        this.nome = nome;
        if (vida > 0) {
          this.vida = vida;
        } else {
          System.out.println("Vida inválida");
        }
        if (nivel > 0) {
          this.nivel = nivel;
        } else {
          System.out.println("Nível inválido");
        }
    }

    public void atacar() {
        System.out.println("O personagem ataca.");
    }

    public void defender() {
        System.out.println("O personagem se defende.");
    }

    public String getNome() {
        return nome;
    }

    public int getVida() {
        return vida;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setVida(int vida) {
        if (vida > 0) {
          this.vida = vida;
        } else {
          System.out.println("Vida inválida");
        }
    }

    public void setNivel(int nivel) {
        if (nivel > 0) {
          this.nivel = nivel;
        } else {
          System.out.println("Nível inválido");
        }
    }
    
}
