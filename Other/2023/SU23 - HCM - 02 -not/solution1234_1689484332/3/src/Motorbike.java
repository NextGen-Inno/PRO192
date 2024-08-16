
public class Motorbike {

    private String licencePlate;
    private String owner;
    private String brand;
    private long value;

    public Motorbike(String licencePlate, String owner, String brand, long value) {
        this.licencePlate = licencePlate;
        this.owner = owner;
        this.brand = brand;
        this.value = value;
    }

    public String getLicencePlate() {
        return licencePlate;
    }

    public String getOwner() {
        return owner;
    }

    public String getBrand() {
        return brand;
    }

    public long getValue() {
        return value;
    }

    public void setLicencePlate(String licencePlate) {
        this.licencePlate = licencePlate;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setValue(long value) {
        this.value = value;
    }

    public Motorbike() {
    }

}
