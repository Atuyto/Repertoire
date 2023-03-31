public class Telephone extends Coordonnee {
    private String pays;
    private String numeroLocal;


    public Telephone(Contact c ,String pays, String tel)
    {
        super(c);
        this.pays = pays;
        this.numeroLocal = tel;
    }

    public String toString()
    {
        return this.pays + " " + this.numeroLocal;
    }
}
