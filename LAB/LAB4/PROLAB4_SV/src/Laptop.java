
/**
 *
 * @author VU VAN HUY
 */
public class Laptop extends ElectronicProduct {

    public Laptop(String name, double price, String brand, int warrantyMonths, int hardDriveCapacity, double cpuSpeed) {
        super(name, price, brand, warrantyMonths);
        this.cpuSpeed = cpuSpeed;
        this.hardDriveCapacity = hardDriveCapacity;
    }
    
    private double cpuSpeed;
    private int hardDriveCapacity;

//YOUR CODE HERE    
    

    public void f0_studentInfo() {
        System.out.println("He180274 - Nguyen Minh Duc");
    }

    public void f2_checkHardDiskCapacity() {
	if(hardDriveCapacity<=120){
            System.out.println("Small capacity");
        }
        else if(hardDriveCapacity<=240){
            System.out.println("Medium capacity");
        }
        else {
            System.out.println("Large capacity");
        }
		
    }
    public void f3_checkCpuSpeed() {
	if(cpuSpeed>=2.5){
            System.out.println("High speed");
        }
        else {
            System.out.println("Low speed");
        }
	
    }
     
	
	//Do not edit member function toString
    @Override
    public String toString() {
        return "Laptop: " + super.getName()+"\nprice: " + super.getPrice()+
                "\nbrand: " + super.getBrand()+ "\nwarranty: " + super.getWarrantyMonths()+
                "\nhard disk capacity: " + hardDriveCapacity + "\nCPU Speed: " + cpuSpeed;
    }       
}
