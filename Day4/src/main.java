/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DUKE
 */
public class main {
    public static void main(String[] args) {
        Student std = new Student();
        System.out.println("id: "+std.getStdID());
        System.out.println("name: "+std.getName());
        System.out.println("age: "+std.getAge());
        System.out.println("GPA: "+std.getGPA());
        System.out.println("");
        System.out.println(std.toString());
    }
    
}
