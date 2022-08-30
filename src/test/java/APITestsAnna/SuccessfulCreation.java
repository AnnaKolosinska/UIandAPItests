package APITestsAnna;

public class SuccessfulCreation {
    public String name;
    public String job;
    public String id;
    public String createdAt;

    public SuccessfulCreation(String name, String job) {
        this.name = name;
        this.job = job;
        this.id = id;
        this.createdAt = createdAt;
    }

    public String getName() {
        return name;
    }

    public String getJob() {
        return job;
    }

    public String getId() {
        return id;
    }

    public String getCreatedAt() {
        return createdAt;
    }
    public SuccessfulCreation () {}
}
