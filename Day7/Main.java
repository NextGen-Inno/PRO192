package ArrayOfObj;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        try {
            StudentManagement myStd = new StudentManagement();
            int sel;
            do{
                menu();
                sel=sn.nextInt();
                sn.nextLine();  //Clear buffer
                switch (sel){
                    case 1: 
                        System.out.print("Input student ID: ");
                        String id = sn.nextLine();
                        System.out.print("Input student Name: ");
                        String name = sn.nextLine();
                        System.out.print("Input student age: ");
                        int age = Integer.parseInt(sn.nextLine());
                        Student newStd = new Student(id, name, age);
                        
                        myStd.addStudent(newStd);
                        System.out.println("Added student:");
                        myStd.displayStudentList1();
                        break;
                    case 2: 
                        myStd.displayStudentList1();
                        break;
                    case 3:
                        System.out.print("Input searching ID: ");
                        String kw_ID=sn.nextLine();
                        myStd.findByIDAndDisplay(kw_ID);
                        break;
                    case 4: break;
                    case 5:
                        System.out.print("Input student ID to modify: ");
                        String kw_ID5=sn.nextLine();
                        if (myStd.findByID(kw_ID5)) {
                            System.out.print("Input new name: ");
                            String newName = sn.nextLine();
                            System.out.print("Input new age: ");
                            int newAge = Integer.parseInt(sn.nextLine());
                            myStd.modifyStudentByID(kw_ID5, newName, newAge);
                            myStd.displayStudentList1();
                        } else
                            System.out.println("Find not found student with ID as "+ kw_ID5);
                        break;
                    case 0: 
                        break;
                    default:                     
                        System.out.println("Select again.");                  
                }                
            } while (sel!=0);
        } catch (Exception e) {
            System.out.println("Error while input data");
        }       
        sn.close();
    }
    public static void menu() {
        System.out.println("");
        System.out.println("1. Add new student");
        System.out.println("2. Display student list");
        System.out.println("3. Find by ID");
        System.out.println("4. Find student by Name");
        System.out.println("5. Modify student info by ID");
        System.out.println("0. Quit");
        System.out.print("What is your selection? ");
    }
    
}
