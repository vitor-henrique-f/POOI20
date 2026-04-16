
package sistemaescolar;


public class Aluno extends Pessoa{
    
    private double nota1;
    private double nota2;

    public Aluno(String nome, int idade, double nota1, double nota2) {
        super(nome, idade);
        if (nota1 >= 0) {
          this.nota1 = nota1;
        } else {
          System.out.println("Nota inválida");
        }
        if (nota2 >= 0) {
          this.nota2 = nota2;
        } else {
          System.out.println("Nota inválida");
        }
    }

    public double calcularMedia() {
        return (nota1 + nota2) / 2;
    }

    @Override
    public void apresentar() {
        super.apresentar();
        System.out.println("Sou um aluno.");
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        if (nota1 >= 0) {
          this.nota1 = nota1;
        } else {
          System.out.println("Nota inválida");
        }
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        if (nota2 >= 0) {
          this.nota2 = nota2;
        } else {
          System.out.println("Nota inválida");
        }
    }
    
}
