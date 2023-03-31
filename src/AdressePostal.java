public class AdressePostal extends Coordonnee{
    private int nbVoie;
    private String nomVoie;
    private int CodePostal;
    private String commune;


    public AdressePostal(Contact c, int nbVoie, String nomVoie, int code, String comm)
    {
        super(c);
        this.nbVoie = nbVoie;
        this.nomVoie = nomVoie;
        this.CodePostal = code;
        this.commune = comm;
    }

    public String toString()    
    {
        return this.nbVoie + " " + this.nomVoie + " " + this.commune + ", " + this.CodePostal;
    }
    
    public int getVoie()
    {
        return this.nbVoie;
    }

    public String getNom()
    {
        return this.nomVoie;
    }

    public String getPostal()
    {
        return this.getPostal();
    }

    public String getCommmune()
    {
        return this.commune;
    }
}
