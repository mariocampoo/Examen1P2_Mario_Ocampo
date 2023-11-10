package examen1p2_marioocampo;
public class admin {
    protected String user;
    protected String passw;

    public admin() {
    }

    public admin(String user, String passw) {
        this.user = user;
        this.passw = passw;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassw() {
        return passw;
    }

    public void setPassw(String passw) {
        this.passw = passw;
    }
    
    
    
}
