package APITestsAnna;

public class CreateUser {
    private String name;
    private String job;

    public CreateUser(String name, String job) {
        this.name = name;
        this.job = job;
    }

    public String getName() {
        return name;
    }

    public String getJob() {
        return job;
    }
}
