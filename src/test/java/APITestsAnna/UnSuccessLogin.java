package APITestsAnna;

public class UnSuccessLogin {
    private
    String error;

    public UnSuccessLogin(String error) {
        this.error = error;
    }

    public String getError() {
        return error;
    }
    public UnSuccessLogin() {}
}
