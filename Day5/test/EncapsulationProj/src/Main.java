public class Main {
    public static void main(String[] args) {
        int a; 
        Student std = new Student();
 
        
        System.out.println("ID: "+std.getStdID());
        System.out.println("Name: "+std.getName());
        System.out.println("Age: "+std.getAge());
        System.out.println("GPA: "+std.getGPA());
        System.out.println("\n----");
        
        std = new Student("He190001", "NgUyEN VAn nAm", 19, 3.5F);
        
        System.out.println("ID: "+std.getStdID());
        System.out.println("Name: "+std.getName());
        System.out.println("Age: "+std.getAge());
        System.out.println("GPA: "+std.getGPA());
        System.out.println("\n----Edit----");        
        
        String newName = "tRAn VAn nAm";
        std.setName(newName);
        std.setGPA(3.8F);
        
        System.out.println("ID: "+std.getStdID());
        System.out.println("Name: "+std.getName());
        System.out.println("Age: "+std.getAge());
        System.out.println("GPA: "+std.getGPA());
        
        System.out.println("\n----Edit----");         
        System.out.println(std.toString());      
        
        System.out.println(std.getName());
    }
}
