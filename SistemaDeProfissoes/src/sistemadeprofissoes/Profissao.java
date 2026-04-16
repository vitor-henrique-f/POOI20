
package sistemadeprofissoes;

public class Profissao {
    
    private String nome;
    private String area;
    private double salario;

    public Profissao(String nome, String area, double salario) {
        this.nome = nome;
        this.area = area;
        if (salario > 0 ) {
          this.salario = salario; 
        } else {
          System.out.println("Salário inválido");
        } 
    }

    public void executarTrabalho() {
        System.out.println("Executando trabalho genérico.");
    }

    public String getNome() {
        return nome;
    }

    public String getArea() {
        return area;
    }

    public double getSalario() {
        return salario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public void setSalario(double salario) {
        if (salario > 0 ) {
          this.salario = salario; 
        } else {
          System.out.println("Salário inválido");
        } 
    }
    
}
