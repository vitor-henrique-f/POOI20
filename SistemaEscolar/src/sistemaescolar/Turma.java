
package sistemaescolar;

import java.util.ArrayList;

public class Turma{
    
    private String nomeTurma;
    private ArrayList<Aluno> alunos;

    public Turma(String nomeTurma) {
        this.nomeTurma = nomeTurma;
        this.alunos = new ArrayList<>();
    }

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public void listarAlunos() {
        for (Aluno a : alunos) {
            System.out.println("Aluno: " + a.getNome() + " | Média: " + a.calcularMedia());
        }
    }

    public String getNomeTurma() {
        return nomeTurma;
    }

    public void setNomeTurma(String nomeTurma) {
        this.nomeTurma = nomeTurma;
    }
    
}
