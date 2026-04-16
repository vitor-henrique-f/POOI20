
package sistemadenotificacoes;


public class SistemaDeNotificacoes {

    
    public static void main(String[] args) {

        Notificacao n1 = new Email("email@email.com", "Olá por email!", "16/04/2026");
        Notificacao n2 = new SMS("99999-9999", "Mensagem SMS", "16/04/2026");
        Notificacao n3 = new WhatsApp("99999-9999", "Mensagem WhatsApp", "16/04/2026");
        Notificacao n4 = new Push("UsuárioApp", "Nova notificação!", "16/04/2026");

        Notificacao[] notificacoes = {n1, n2, n3, n4};

        for (Notificacao n : notificacoes) {
            n.enviar();
            System.out.println("----------------------");
        }

    }
    
}
