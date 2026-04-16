
package personagensdejogo;


public class PersonagensDeJogo {

    public static void main(String[] args) {

        Personagem p1 = new Guerreiro("Arthas", 100, 10);
        Personagem p2 = new Mago("Merlin", 80, 12);
        Personagem p3 = new Arqueiro("Legolas", 90, 11);
        Personagem p4 = new Paladino("Uther", 110, 13);

        Personagem[] personagens = {p1, p2, p3, p4};

        for (Personagem p : personagens) {
            p.atacar();
            p.defender();
            System.out.println("-------------------");
        }

    }
    
}
