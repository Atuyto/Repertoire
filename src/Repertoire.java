import java.util.ArrayList;

public class Repertoire {
    private ArrayList<Contact> lesContacts;

    public Repertoire()
    {
        this.lesContacts = new ArrayList<>();
    }

    public void setContact(Contact c)
    {
        boolean existe = false;
        for (Contact p : lesContacts)
        {
            if ( p.getName() == c.getName() && p.getSurName() == c.getSurName()) existe = true;
            else existe = false;
        }

        if ( ! existe)
        {
            lesContacts.add(c);
        }
        else System.out.println("le contacte existe ");
    }
}
