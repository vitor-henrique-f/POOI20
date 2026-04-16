
package sistemahospitalar;

public class SistemaHospitalar {

    public static void main(String[] args) {

        Paciente paciente = new Paciente("João", 30, "Dor de cabeça");

        Pessoa medico = new Medico("Dr. Carlos", 45, "Clínico Geral");
        Pessoa enfermeiro = new Emfermeiro("Ana", 35, "Emergência");

        Consulta c1 = new Consulta(paciente, medico, "20/04/2026");
        Consulta c2 = new Consulta(paciente, enfermeiro, "21/04/2026");

        c1.agendarConsulta();
        c2.agendarConsulta();

        System.out.println("----------------------");

        c1.realizarConsulta();
        c2.realizarConsulta();
    }

    }
    

