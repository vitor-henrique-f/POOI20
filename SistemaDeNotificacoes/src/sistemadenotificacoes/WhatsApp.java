
package sistemadenotificacoes;


public class WhatsApp extends Notificacao{
    
    public WhatsApp(String destinatario, String mensagem, String data) {
        super(destinatario, mensagem, data);
    }

    @Override
    public void enviar() {
        System.out.println("Enviando mensagem via WhatsApp para " + getDestinatario());
        System.out.println("Mensagem: " + getMensagem());
    }
    
}
