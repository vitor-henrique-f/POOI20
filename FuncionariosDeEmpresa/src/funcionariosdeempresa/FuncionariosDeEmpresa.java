
package funcionariosdeempresa;

public class FuncionariosDeEmpresa {

    public static void main(String[] args) {

        Funcionario f1 = new Gerente("Ana", 8000);
        Funcionario f2 = new Vendedor("Carlos", 3000);
        Funcionario f3 = new Programador("Lucas", 5000);
        Funcionario f4 = new Designer("Marina", 4000);
        
        f1.trabalhar();
        System.out.println("Bônus: " + f1.calcularBonus());

        f2.trabalhar();
        System.out.println("Bônus: " + f2.calcularBonus());

        f3.trabalhar();
        System.out.println("Bônus: " + f3.calcularBonus());

        f4.trabalhar();
        System.out.println("Bônus: " + f4.calcularBonus());
    }
    
}
