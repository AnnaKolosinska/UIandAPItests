package APITestsMichael;

public class RegEmail {

    private String Email;
    private String password;

    public RegEmail(String email, String password) {
        Email = email;
        this.password = password;
    }

    public String getEmail() {
        return Email;
    }

    public String getPassword() {
        return password;
    }

    public RegEmail(){

    }
}
