/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DUKE
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UniversityManagement {

    private List<Course> courseList = new ArrayList<>();
    private Map<Integer, Person> personMap = new HashMap<>();

    public void addCourse(Course course) {
        courseList.add(course);
    }

    public void addPerson(Person person) {
        personMap.put(person.getId(), person);
    }

    public void displayCourseList() {
        for (Course course : courseList) {
            System.out.println(course);
        }
    }

    public void displayStudents() {
        for (Person person : personMap.values()) {
            if (person instanceof Student) {
                System.out.println(person);
            }
        }
    }

    public void displayTeachers() {
        for (Person person : personMap.values()) {
            if (person instanceof Teacher) {
                System.out.println(person);
            }
        }
    }

    public void sortStudentsByGpaDesc() {
        List<Student> students = new ArrayList<>();
        for (Person person : personMap.values()) {
            if (person instanceof Student) {
                students.add((Student) person);
            }
        }
        students.sort(Comparator.comparingDouble(Student::getGpa).reversed());
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public void sortTeachersBySalaryDesc() {
        List<Teacher> teachers = new ArrayList<>();
        for (Person person : personMap.values()) {
            if (person instanceof Teacher) {
                teachers.add((Teacher) person);
            }
        }
        teachers.sort(Comparator.comparingDouble(Teacher::getSalary).reversed());
        for (Teacher teacher : teachers) {
            System.out.println(teacher);
        }
    }

    public void readDataFromFiles(String studentsFile, String teachersFile) {
        readStudents(studentsFile);
        readTeachers(teachersFile);
    }

    private void readStudents(String studentsFile) {
        try (BufferedReader br = new BufferedReader(new FileReader(studentsFile))) {
            String line;
            while ((line = br.readLine()) != null) {
                line = line.trim();

                if (line.isEmpty()) {
                    continue;
                }

                String[] studentData = line.split(",");

                if (studentData.length != 5) {
                    System.out.println("Invalid data format: " + line);
                    continue;
                }

                try {
                    int id = Integer.parseInt(studentData[0].trim());
                    String name = studentData[2].trim(); 
                    int age = Integer.parseInt(studentData[3].trim());
                    double gpa = Double.parseDouble(studentData[4].trim());

                    Student student = new Student(id, name, age, gpa);
                    addPerson(student);
                } catch (NumberFormatException e) {
                    System.out.println("Error parsing line: " + line);
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading students file: " + e.getMessage());
        }
    }

    private void readTeachers(String teachersFile) {
        try (BufferedReader br = new BufferedReader(new FileReader(teachersFile))) {
            String line;
            while ((line = br.readLine()) != null) {
                line = line.trim();

                if (line.isEmpty()) {
                    continue;
                }

                String[] teacherData = line.split(",");

                if (teacherData.length != 6) {
                    System.out.println("Invalid data format: " + line);
                    continue;
                }

                try {
                    int id = Integer.parseInt(teacherData[0].trim());
                    String name = teacherData[2].trim(); 
                    int age = Integer.parseInt(teacherData[3].trim());
                    String subject = teacherData[4].trim();
                    double salary = Double.parseDouble(teacherData[5].trim());

                    Teacher teacher = new Teacher(id, name, age, subject, salary);
                    addPerson(teacher);
                } catch (NumberFormatException e) {
                    System.out.println("Error parsing line: " + line);
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading teachers file: " + e.getMessage());
        }
    }

    public Person getPerson(int personId) {
        return personMap.get(personId);
    }
}
