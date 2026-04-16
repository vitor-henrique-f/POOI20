
package sistemadenotificacoes;

public class Notificacao {
    
    private String destinatario;
    private String mensagem;
    private String data;

    public Notificacao(String destinatario, String mensagem, String data) {
        this.destinatario = destinatario;
        this.mensagem = mensagem;
        this.data = data;
    }

    public void enviar() {
        System.out.println("Enviando notificação genérica.");
    }

    public String getDestinatario() {
        return destinatario;
    }

    public String getMensagem() {
        return mensagem;
    }

    public String getData() {
        return data;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public void setData(String data) {
        this.data = data;
    }
    
}
