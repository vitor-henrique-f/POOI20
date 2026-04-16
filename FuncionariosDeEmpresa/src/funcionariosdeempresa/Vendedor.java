
package funcionariosdeempresa;


public class Vendedor extends Funcionario{
    
    public Vendedor(String nome, double salario) {
        super(nome, salario, "Vendedor");
    }

    @Override
    public void trabalhar() {
        System.out.println("O vendedor está realizando vendas.");
    }

    @Override
    public double calcularBonus() {
        return getSalario() * 0.15; // 15%
    }
    
}
