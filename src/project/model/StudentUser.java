package project.model;

public class StudentUser {
    String regNo;
    String name;
    String course;

    public StudentUser() {
    }

    public String getRegNo() {
        return regNo;
    }

    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    String department;

    public StudentUser(String regNo, String name, String course, String department) {
        this.regNo = regNo;
        this.name = name;
        this.course = course;
        this.department = department;
    }


}
