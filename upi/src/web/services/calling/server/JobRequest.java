package web.services.calling.server;

public class JobRequest {
    private String name;
    private String job;

    public JobRequest() {
    	
    }

    public JobRequest(String name, String job) {
        this.name = name;
        this.job = job;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
}
