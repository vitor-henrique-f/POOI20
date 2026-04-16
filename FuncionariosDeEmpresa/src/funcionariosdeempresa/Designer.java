
package funcionariosdeempresa;

public class Designer extends Funcionario{
    
    public Designer(String nome, double salario) {
        super(nome, salario, "Designer");
    }

    @Override
    public void trabalhar() {
        System.out.println("O designer está criando layouts.");
    }

    @Override
    public double calcularBonus() {
        return getSalario() * 0.11; // 11%
    }
    
}
