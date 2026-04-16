
package sistemadeprofissoes;


public class SistemaDeProfissoes {

    public static void main(String[] args) {

        Profissao p1 = new Medico("Dr. João", "Cardiologia", 15000);
        Profissao p2 = new Professor("Maria", "Matemática", 5000);
        Profissao p3 = new Advogado("Carlos", "Direito Civil", 8000);
        Profissao p4 = new Engenheiro("Ana", "Civil", 9000);

        Profissao[] profissoes = {p1, p2, p3, p4};

        for (Profissao p : profissoes) {
            p.executarTrabalho();
        }

    }
    
}
