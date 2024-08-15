import java.io.RandomAccessFile;
public class CarManagement {
    Car[] carList;
    private int numberOfCar;

    public CarManagement(int maxCar) {
        carList=new Car[maxCar];
        numberOfCar=0;
    }        
    public void addNewCar(Car x) {
        if (x!=null && numberOfCar<carList.length) {
            carList[numberOfCar]=x;
            numberOfCar++;            
        } else System.out.println("Car list if full.");
    }    
    public void readDataFromFile(String fName) {
        try {
            RandomAccessFile raf = new RandomAccessFile(fName, "r");
            String line="";
            while ((line=raf.readLine())!=null){
                String[] arr= line.split(";");
                double price=Double.parseDouble(arr[2]);
                Car newCar=new Car(arr[0].trim(), arr[1].trim(), price);
                addNewCar(newCar);
            }
            raf.close();
        } catch (Exception e) {
            System.out.println("Error while reading file.");
        }        
    }     
    public void displayCarList() {
        System.out.println("ID   Car Name \t\t\t Car Price");
        System.out.println("---  -------- \t\t\t ---------");
        for (int i = 0; i < numberOfCar; i++) {
            System.out.println(carList[i].getCarId()+"  "+
                    carList[i].getCarName()+" \t\t "+
                    carList[i].getCarPrice());
        }
    }
    
    public void findCarByID(String id) {
        boolean found=false;
        for (int i = 0; i < numberOfCar; i++) {
            if (carList[i].getCarId().compareToIgnoreCase(id)==0) {
                System.out.println("ID   Car Name \t\t\t Car Price");
                System.out.println("---  -------- \t\t\t ---------");
                System.out.println(carList[i].getCarId()+"  "+
                    carList[i].getCarName()+" \t\t "+
                    carList[i].getCarPrice());
                found=true; break;     
            }
        }
        if (!found) System.out.println("Find not found car with id as "+ id.toUpperCase());
    }
    
    public void displayByPos(int i) {
        System.out.println("ID   Car Name \t\t\t Car Price");
        System.out.println("---  -------- \t\t\t ---------");
        System.out.println(carList[i].getCarId() + "  "
                + carList[i].getCarName() + " \t\t "
                + carList[i].getCarPrice());       
    }
    
    public void sortCarByPriceDesc() {
        for (int i = 0; i < numberOfCar-1; i++) {
            for (int j = numberOfCar-1; j >i; j--) {
                if (carList[j].getCarPrice()<carList[j-1].getCarPrice()) {
                    Car temp = carList[j];
                    carList[j]=carList[j-1];
                    carList[j-1]=temp;
                }
            }
        }
        displayCarList();
    }

    public void sortTheFirstKCarsAsc(int k) {
        for (int i = 0; i < k; i++) {
            for (int j = k-1; j >i; j--) {
                if (carList[j].getCarPrice()<carList[j-1].getCarPrice()) {
                    Car temp = carList[j];
                    carList[j]=carList[j-1];
                    carList[j-1]=temp;
                }
            }
        }
        displayCarList();        
    }
    
    public void sortTheLast5CarsAsc(int k) {
       
    } 
    
    public void findTheCheapestCar() {
        int minPos=0;
        double minPrice=carList[minPos].getCarPrice();        
        for (int i = minPos+1; i < numberOfCar; i++) 
            if (carList[i].getCarPrice()<minPrice) 
            {
                minPrice=carList[i].getCarPrice();
                minPos=i;
            }
        displayByPos(minPos);      
    }   
     
    public void findTheMostExpensiveCar() {
        int maxPos=0;
        double maxPrice=carList[maxPos].getCarPrice();        
        for (int i = 1; i < numberOfCar; i++) 
            if (carList[i].getCarPrice()>maxPrice) {
                maxPrice=carList[i].getCarPrice();
                maxPos=i;
            }
        displayByPos(maxPos);        
    } 
    
}
