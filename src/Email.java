
public class Email extends Coordonnee {
    private String adresseMail;


    public Email(Contact c ,String adresse)
    {
        super(c);
        this.adresseMail = adresse;
    }

    public String toString()
    {
        return this.adresseMail;
    }
}
