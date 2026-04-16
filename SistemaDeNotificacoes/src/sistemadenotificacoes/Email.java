
package sistemadenotificacoes;

public class Email extends Notificacao{
    
    public Email(String destinatario, String mensagem, String data) {
        super(destinatario, mensagem, data);
    }

    @Override
    public void enviar() {
        System.out.println("Enviando EMAIL para " + getDestinatario());
        System.out.println("Mensagem: " + getMensagem());
    }
    
}
