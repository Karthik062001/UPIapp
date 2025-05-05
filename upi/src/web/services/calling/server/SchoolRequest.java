package web.services.calling.server;

public class SchoolRequest {
    private String schoolName;
    private String className;

    public SchoolRequest() {}

    public SchoolRequest(String schoolName, String className) {
        this.schoolName = schoolName;
        this.className = className;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
}
