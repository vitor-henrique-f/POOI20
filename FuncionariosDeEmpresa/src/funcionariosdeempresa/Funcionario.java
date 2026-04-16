
package funcionariosdeempresa;

public class Funcionario {
    
    private String nome;
    private double salario;
    private String cargo;

    public Funcionario(String nome, double salario, String cargo) {
        this.nome = nome;
        if (salario > 0) {
          this.salario = salario;
        } else {
          System.out.println("Salário");
        }
        this.cargo = cargo;
    }

    public void trabalhar() {
        System.out.println("O funcionário está trabalhando.");
    }

    public double calcularBonus() {
        return salario * 0.1;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSalario(double salario) {
        if (salario > 0) {
          this.salario = salario;
        } else {
          System.out.println("Salário");
        }
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
}
