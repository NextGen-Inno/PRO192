/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DUKE
 */
public class Student {
    private String stdID;
    private String name; 
    private int age;
    private float GPA;

    public Student() {
    
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

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public float getGPA() {
        return GPA;
    }

    public void setStdID(String stdID) {
        this.stdID = stdID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGPA(float GPA) {
        this.GPA = GPA;
    }

    @Override
    public String toString() {
        return "Student{" + "stdID=" + stdID + ", name=" + name + ", age=" + age + ", GPA=" + GPA + '}';
    }
   
    
}
