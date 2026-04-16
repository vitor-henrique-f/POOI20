
package sistemaescolar;

public class SistemaEscolar {

  
    public static void main(String[] args) {
     
        Pessoa p1 = new Professor("Carlos", 40, "Matemática");
        Pessoa p2 = new Coordenador("Ana", 35, "Ensino Médio");

        p1.apresentar();
        p1.trabalhar();
        
        System.out.println("");
        
        p2.apresentar();
        p2.trabalhar();
        
        System.out.println("");
        
        Aluno a1 = new  Aluno("João", 16, 8.0, 7.5);
        Aluno a2 = new Aluno("Maria", 17, 9.0, 8.5);

        Turma turma = new Turma("3º Ano");

        turma.adicionarAluno(a1);
        turma.adicionarAluno(a2);

        turma.listarAlunos();
    }
        
    }
