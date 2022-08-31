package APITestsAnna;

public class UpdateDataResponse {
    public String name;
    public String job;
    public String updatedAt;

    public UpdateDataResponse(String name, String job, String updatedAt) {
        this.name = name;
        this.job = job;
        this.updatedAt = updatedAt;
    }

    public String getName() {
        return name;
    }

    public String getJob() {
        return job;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }
    public UpdateDataResponse () {}
}

