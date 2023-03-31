import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Repertoire rep1 = new Repertoire();
        Contact c1 = new Contact("Hannecart", "Alexandre", rep1);
        Contact c2 = new Contact("Hannecart", "Léo", rep1);
        
        rep1.setContact(c1);
        rep1.setContact(c2);

        c1.addMail("test@uphf.fr");
        c1.addAdressePostale(60, "rue Thomas edison", 59460, "Jeumont");
        c1.addPhone("33", " 6 55 45 67");

        
        c2.addMail("test@uphf.fr");
        c2.addAdressePostale(60, "rue Thomas edison", 59460, "Jeumont");
        c2.addPhone("33", " 6 55 45 67");

       

        System.out.println(" Contacte 1 : \n");
        c1.afficherCoordonnee();
        System.out.println("Contacte 2 :  \n");
        c2.afficherCoordonnee();
    
    }

}
