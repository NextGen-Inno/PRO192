// Factory abstract class
public abstract class Factory {
    String type;
    String dataSource;

    // Default constructor initializes fields to empty strings
    public Factory() {
        this.type = "";
        this.dataSource = "";
    }

    // Constructor with parameters to set type and dataSource
    public Factory(String type, String dataSource) {
        this.type = type;
        this.dataSource = dataSource;
    }

    // Getter for type field
    public String getType() {
        return type;
    }

    // Getter for dataSource field
    public String getDataSource() {
        return dataSource;
    }

    // Abstract method to read data
    public abstract void readData();

    // Abstract method to write data and return the result string
    public abstract String writeData();
}