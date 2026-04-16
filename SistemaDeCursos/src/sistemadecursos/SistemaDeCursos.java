
package sistemadecursos;

public class SistemaDeCursos {

   
    public static void main(String[] args) {

        Curso c1 = new CursoPresencial("Administração", 200, 1000);
        Curso c2 = new CursoOnline("Programação", 150, 800);
        Curso c3 = new CursoTecnico("Informática", 300, 1200);
        Curso c4 = new CursoLivre("Inglês", 100, 500);

        Curso[] cursos = {c1, c2, c3, c4};

        for (Curso c : cursos) {
            c.exibirInformacoes();
            System.out.println("Mensalidade: R$" + c.calcularMensalidade());
            System.out.println("----------------------");
        }

    }
    
}
