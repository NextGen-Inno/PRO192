/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DUKE
 */
public class Student {
    private String id;
    private String name;
    private double mark;
    private int age;

    public Student() {
    }

    public Student(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Student(String id, String name, double mark, int age) {
        this.id = id;
        this.name = name;
        this.mark = mark;
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        String[] words = name.trim().split("\\s+");
        StringBuilder formattedName = new StringBuilder();
        for (String word : words) {
            if (!word.isEmpty()) {
                formattedName.append(Character.toUpperCase(word.charAt(0)))
                             .append(word.substring(1).toLowerCase())
                             .append(" ");
            }
        }
        return formattedName.toString().trim();
    }

    public double getMark() {
        return mark;
    }

    public int getAge() {
        return age;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return id + "; \t" + name + ";\t" + age + ";\t" + mark;
    }
    
    
}
