public class Car {
    private String carId;
    private String carName;
    private double carPrice;

    public Car(String carId, String carName, double carPrice) {
        this.carId = carId;
        this.carName = carName;
        this.carPrice = carPrice;
    }

    public String getCarId() {
        return carId;
    }

    public void setCarId(String carId) {
        this.carId = carId;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public double getCarPrice() {
        return carPrice;
    }

    public void setCarPrice(double carPrice) {
        this.carPrice = carPrice;
    }   

    @Override
    public String toString() {
        return "Car{" + "carId=" + carId + ", carName=" + carName + ", carPrice=" + carPrice + '}';
    }
    
}
