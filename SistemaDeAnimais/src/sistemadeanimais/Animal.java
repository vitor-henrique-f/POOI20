
package sistemadeanimais;


public class Animal {
    
    private String nome;
    private int idade;
    private String especie;

    public Animal(String nome, int idade, String especie) {
        this.nome = nome;
        if (idade > 0) {
          this.idade = idade;            
        } else  {
            System.out.println("Idade inválida");
        }
        this.especie = especie;
    }

    public void emitirSom() {
        System.out.println("O animal faz um som.");
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getEspecie() {
        return especie;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        if (idade > 0) {
          this.idade = idade;            
        } else  {
            System.out.println("Idade inválida");
        }
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }
    
}
