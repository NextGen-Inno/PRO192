package ArrayOfObj;
public class Student {
    private String stdID;
    private String stdName;
    private int    stdAge; 

    public Student(String stdID, String stdName, int stdAge) {
        this.stdID = stdID;
        this.stdName = stdName;
        this.stdAge = stdAge;
    }

    public String getStdID() {
        return stdID;
    }

    public void setStdID(String stdID) {
        this.stdID = stdID;
    }

    public String getStdName() {
        return stdName;
    }

    public void setStdName(String stdName) {
        this.stdName = stdName;
    }

    public int getStdAge() {
        return stdAge;
    }

    public void setStdAge(int stdAge) {
        this.stdAge = stdAge;
    }  

    @Override
    public String toString() {
        return "Student{" + "stdID=" + stdID + ", stdName=" + stdName + ", stdAge=" + stdAge + '}';
    }
    
}
