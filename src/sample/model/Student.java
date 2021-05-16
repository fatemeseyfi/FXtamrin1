package sample.model;

public class Student {
    private String name;
    private String lastName;
    private String sudentID;

    public Student(String name, String lastName, String sudentID) {
        this.setName(name);
        this.setLastName(lastName);
        this.setSudentID(sudentID);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSudentID() {
        return sudentID;
    }

    public void setSudentID(String sudentID) {
        this.sudentID = sudentID;
    }
}
