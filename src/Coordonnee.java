
public class Coordonnee {
    private Contact lecontact;
    
    public Coordonnee(Contact contact)
    {
        this.lecontact = contact;
    }

    public String toString()
    {
        return lecontact.getName() + ", " + lecontact.getSurName();
    }

}


