
package sistemahospitalar;


public class Pessoa {
    
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        if (idade > 0) {
          this.idade = idade; 
        } else {
          System.out.println("Idade inválida");
        } 
    }

    public void exibirDados() {
        System.out.println("Nome: " + nome + " | Idade: " + idade);
    }

    public void realizarAtendimento() {
        System.out.println("Realizando atendimento genérico.");
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        if (idade > 0) {
          this.idade = idade; 
        } else {
          System.out.println("Idade inválida");
        } 
    }
    
}
