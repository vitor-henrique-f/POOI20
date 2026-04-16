
package sistemadenotificacoes;


public class Push extends Notificacao{
    
    public Push(String destinatario, String mensagem, String data) {
        super(destinatario, mensagem, data);
    }

    @Override
    public void enviar() {
        System.out.println("Enviando notificação PUSH para " + getDestinatario());
        System.out.println("Mensagem: " + getMensagem());
    }
    
}
