
package funcionariosdeempresa;


public class Programador extends Funcionario{
    
    public Programador(String nome, double salario) {
        super(nome, salario, "Programador");
    }

    @Override
    public void trabalhar() {
        System.out.println("O programador está escrevendo código.");
    }

    @Override
    public double calcularBonus() {
        return getSalario() * 0.12; // 12%
    }
    
}
