
package sistemadecursos;


public class Curso {
    
    private String nome;
    private int cargaHoraria;
    private double valor;

    public Curso(String nome, int cargaHoraria, double valor) {
        this.nome = nome;
        if (cargaHoraria > 0) {
          this.cargaHoraria = cargaHoraria; 
        } else {
          System.out.println("Carga horaria inválida");
        }
        if (valor > 0) {
          this.valor = valor;  
        } else {
          System.out.println("Valor inválido");
        }
    }

    public void exibirInformacoes() {
        System.out.println("Curso: " + nome +
                " | Carga horária: " + cargaHoraria +
                "h | Valor: R$" + valor);
    }

    public double calcularMensalidade() {
        return valor;
    }

    public String getNome() {
        return nome;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public double getValor() {
        return valor;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCargaHoraria(int cargaHoraria) {
        if (cargaHoraria > 0) {
          this.cargaHoraria = cargaHoraria; 
        } else {
          System.out.println("Carga horaria inválida");
        }
    }

    public void setValor(double valor) {
        if (valor > 0) {
          this.valor = valor;  
        } else {
          System.out.println("Valor inválido");
        }
    }
    
}
