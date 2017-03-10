package it4kids.login;

/**
 * Created by Gabi on 3/10/2017.
 */
public class ChildAccount extends Account {

    private int idParent;

    public ChildAccount(int id, int idRegisteredUser, int idParent) {
        super(id, idRegisteredUser);
        this.idParent = idParent;
    }

    public int getIdParent() {
        return idParent;
    }

    public void setIdParent(int idParent) {
        this.idParent = idParent;
    }
}
