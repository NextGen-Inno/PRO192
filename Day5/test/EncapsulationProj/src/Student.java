public class Student {
    private String  stdID;
    private String  name;
    private int     age;
    private float   GPA;

    public Student() {
        stdID   = "He190000";
        name    = "SV FPT";
        age     = 18;
        GPA     = 4.0F;        
    }

    public Student(String stdID, String name, int age, float GPA) {
        this.stdID = stdID;
        this.name = name;
        this.age = age;
        this.GPA = GPA;
    }

    public String getStdID() {
        return stdID;
    }

    public void setStdID(String stdID) {
        this.stdID = stdID;
    }

    public String getName() {
        char firstChar, lastChar;
        firstChar = this.name.charAt(0);
        lastChar = this.name.charAt(this.name.length()-1);
        
        String S = Character.toUpperCase(firstChar) + 
                   this.name.substring(1, this.name.length()-1)+
                   Character.toUpperCase(lastChar);
        return S;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getGPA() {
        return GPA;
    }

    public void setGPA(float GPA) {
        this.GPA = GPA;
    }    

    @Override
    public String toString() {
        return "Student{" + "stdID=" + stdID + ", name=" + name + ", age=" + age + ", GPA=" + GPA + '}';
    }    
    
}
