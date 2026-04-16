
package sistemahospitalar;

public class Consulta {
    
    private Paciente paciente;
    private Pessoa profissional;
    private String data;

    public Consulta(Paciente paciente, Pessoa profissional, String data) {
        this.paciente = paciente;
        this.profissional = profissional;
        this.data = data;
    }

    public void agendarConsulta() {
        System.out.println("Consulta agendada para " + paciente.getNome() +
                " com " + profissional.getNome() + " na data " + data);
    }

    public void realizarConsulta() {
        profissional.realizarAtendimento();
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public Pessoa getProfissional() {
        return profissional;
    }

    public String getData() {
        return data;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public void setProfissional(Pessoa profissional) {
        this.profissional = profissional;
    }

    public void setData(String data) {
        this.data = data;
    }
    
}
