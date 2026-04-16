
package sistemaescolar;

public class Pessoa {
    
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        if (idade > 0) {
          this.idade = idade;
        } else {
          System.out.println("Idade inválido");
        }
    }

    public void apresentar() {
        System.out.println("Olá, meu nome é " + nome + " e tenho " + idade + " anos.");
    }

    public void trabalhar() {
        System.out.println("A pessoa está trabalhando.");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade > 0) {
          this.idade = idade;
        } else {
          System.out.println("Idade inválido");
        }
    }
    
}
