package ArrayOfObj;

public class StudentManagement {

    private int numberOfStudent;
    final int MAX = 100;
    Student[] stdList;

    public StudentManagement() {
        stdList = new Student[MAX];
        numberOfStudent = 0;
    }

    public void addStudent(Student std) {
        if (std != null && numberOfStudent < MAX) {
            stdList[numberOfStudent] = std;
            numberOfStudent++;
        }
    }
    public boolean findByID(String id) {
        boolean rs = false;
        for (int i = 0; i < numberOfStudent; i++) {
            if (stdList[i].getStdID().equalsIgnoreCase(id)){
                rs=true;
                break;
            }
        }
        return rs;        
    }

    public void modifyStudentByID(String id, String newName, int newAge) {
        for (int i = 0; i < numberOfStudent; i++) {
            if (stdList[i].getStdID().compareToIgnoreCase(id)==0) {
                stdList[i].setStdName(newName);
                stdList[i].setStdAge(newAge);
                break;
            }           
        }
    }
    
    public void findByIDAndDisplay(String id) {
        boolean found=false;
        for (int i = 0; i < numberOfStudent; i++) {
            if (stdList[i].getStdID().compareToIgnoreCase(id)==0) {
                System.out.println("Found student with ID " + id + " at position " + (i + 1));
                System.out.println("ID \t Name \t\t Age");
                System.out.println("-- \t ---- \t\t ---");
                System.out.println(stdList[i].getStdID()
                        + " \t " + stdList[i].getStdName()
                        + " \t\t " + stdList[i].getStdAge());
                found=true;
            } 
        }
        if (!found) {
            System.out.println("Find not found student with ID as "+ id);
        }
    }

    public void displayStudentList() {
        for (int i = 0; i < numberOfStudent; i++) {
            System.out.println("ID: " + stdList[i].getStdID()
                    + ", name: " + stdList[i].getStdName()
                    + ", age: " + stdList[i].getStdAge());
        }
    }

    public void displayStudentList1() {
        System.out.println("ID \t Name \t\t Age");
        System.out.println("-- \t ---- \t\t ---");
        for (int i = 0; i < numberOfStudent; i++) {
            System.out.println(stdList[i].getStdID()
                    + " \t " + stdList[i].getStdName()
                    + " \t\t " + stdList[i].getStdAge());
        }
    }
}
