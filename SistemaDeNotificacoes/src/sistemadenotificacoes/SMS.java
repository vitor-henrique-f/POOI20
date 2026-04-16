
package sistemadenotificacoes;

public class SMS extends Notificacao{
    
    public SMS(String destinatario, String mensagem, String data) {
        super(destinatario, mensagem, data);
    }

    @Override
    public void enviar() {
        System.out.println("Enviando SMS para " + getDestinatario());
        System.out.println("Mensagem curta: " + getMensagem());
    }
}
