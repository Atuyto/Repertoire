import java.util.ArrayList;

public class Contact {
    private String name;
    private String surName;
    private ArrayList<Coordonnee> lesCoodonnee;
    private Repertoire leRepertoire;

    public Contact(String nom, String prenom, Repertoire rep)
    {
        this.name = nom;
        this.surName = prenom;
        this.lesCoodonnee = new ArrayList<>();
        this.leRepertoire = rep;
    }

    public String getName()
    {
        return this.name;
    }

    public String getSurName()
    {
        return this.surName;
    }

    public void addMail(String email)
    {
        lesCoodonnee.add(new Email(this, email));
    }

    public void addAdressePostale(int nbVoie, String nomVoie, int codePostal, String commune)
    {
        lesCoodonnee.add(new AdressePostal(this, nbVoie, nomVoie, codePostal, commune));
    }

    public void addPhone(String pays, String phone)
    {
        lesCoodonnee.add(new Telephone(this, pays, phone));
    }

    public void afficherCoordonnee()
    {
        System.out.println(this.name + ", " + this.surName );
        for (Coordonnee p : lesCoodonnee)
        {
            System.out.println(p.toString());
        }
    }
}
