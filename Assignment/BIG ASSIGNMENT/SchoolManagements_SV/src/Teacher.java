/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DUKE
 */
public class Teacher extends Person {
    private String subject;
    private double salary;

    public Teacher(int id, String name, int age, String subject, double salary) {
        super(id, name, age);
        this.subject = subject;
        this.salary = salary;
    }

    // Getter và Setter cho subject và salary

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "ID: " + getId() +" | Name: " + getName() +" | Age: " + getAge() +" | Subject: " + subject + " | Salary: " + salary ;
    }
}

   
