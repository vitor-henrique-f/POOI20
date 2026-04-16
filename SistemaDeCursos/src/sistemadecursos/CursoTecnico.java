
package sistemadecursos;

public class CursoTecnico extends Curso{
    
    public CursoTecnico(String nome, int cargaHoraria, double valor) {
        super(nome, cargaHoraria, valor);
    }

    @Override
    public double calcularMensalidade() {
        return getValor() * 1.05;
    }
    
}
