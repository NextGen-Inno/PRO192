/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DUKE
 */
public class Student extends Person{
    private double gpa;

    public Student(int id, String name, int age, double gpa) {
        super(id, name, age);
        this.gpa = gpa;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "ID: " + getId() +" | Name: " + getName() +" | Age: " + getAge() +" | GPA: " + gpa ;
    }
}
