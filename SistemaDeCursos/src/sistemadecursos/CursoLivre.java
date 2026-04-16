
package sistemadecursos;


public class CursoLivre extends Curso{
    
    public CursoLivre(String nome, int cargaHoraria, double valor) {
        super(nome, cargaHoraria, valor);
    }

    @Override
    public double calcularMensalidade() {
        return getValor();
    }
    
}
