
package sistemadecursos;


public class CursoOnline extends Curso{
    
    public CursoOnline(String nome, int cargaHoraria, double valor) {
        super(nome, cargaHoraria, valor);
    }

    @Override
    public double calcularMensalidade() {
        return getValor() * 0.9;
    }
    
}
