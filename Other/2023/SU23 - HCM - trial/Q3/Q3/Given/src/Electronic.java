
class Electronic {

    private String code;
    private String name;
    private String brand;
    private long price;

    public Electronic() {
    }

    public Electronic(String code, String name, String brand, long price) {
        this.code = code;
        this.name = name;
        this.brand = brand;
        this.price = price;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public String getBrand() {
        return brand;
    }

    public long getPrice() {
        return price;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return name + "-" + brand + "-" + price;
    }

}
