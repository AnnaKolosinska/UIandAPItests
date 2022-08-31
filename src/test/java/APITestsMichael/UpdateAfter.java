package APITestsMichael;

import java.util.Date;

public class UpdateAfter {

    private String name;
    private String job;
    private Date updatedAt;

    public UpdateAfter(String name, String job, Date updatedAt) {
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

    public Date getUpdatedAt() {
        return updatedAt;
    }
    public UpdateAfter(){

    }
}
