
package sistemadezoológico;


public class Animal {
    
    private String nome;
    private int idade;
    private double peso;

    public Animal(String nome, int idade, double peso) {
        this.nome = nome;
        if (idade > 0) {
          this.idade = idade;  
        } else {
          System.out.println("Idade inválida");
        }
        if (peso > 0) {
          this.peso = peso;
        } else {
          System.out.println("Peso inválido");
        }
    }

    public void emitirSom() {
        System.out.println("O animal faz um som.");
    }

    public void alimentar() {
        System.out.println("O animal está se alimentando.");
    }

    public void movimentar() {
        System.out.println("O animal está se movimentando.");
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getPeso() {
        return peso;
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

    public void setPeso(double peso) {
        if (peso > 0) {
          this.peso = peso;
        } else {
          System.out.println("Peso inválido");
        }
    }
    
}
