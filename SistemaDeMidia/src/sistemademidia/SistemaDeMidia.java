
package sistemademidia;


public class SistemaDeMidia {

    public static void main(String[] args) {

        Midia m1 = new Musica("Imagine", 3, "John Lennon");
        Midia m2 = new Filme("Inception", 148, "Christopher Nolan");
        Midia m3 = new Podcast("Flow Podcast", 120, "Igor Coelho");
        Midia m4 = new AudioLivro("Dom Casmurro", 600, "Machado de Assis");

        Midia[] midias = {m1, m2, m3, m4};

        for (Midia m : midias) {
            m.reproduzir();
            System.out.println("----------------------");
        }
  
    }
    
}
