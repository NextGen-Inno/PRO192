public class WordData extends Factory implements IConnect{
    private String content;
    
    public WordData(String type, String dataSource) {
        super.setType(type);
        super.setDataSource(dataSource);
        this.content = "this is a string";
    }
    
    @Override
    void readData() {
        if (super.getType().contains(".doc") && super.getType().endsWith(".doc") ) {
            this.content = "humpty dumpty sat on the wall";
        }
    }

    @Override
    String writeData() {
        String[] array =  content.split("\\s+");
        for (int i = 0; i < array.length; i++) {
            String uppercase = array[i].substring(0, 1).toUpperCase();
            String lowerCase = array[i].substring(1).toLowerCase();
            array[i] = uppercase + lowerCase;
        }
        String result = "";
        for (int i = 0; i < array.length; i++) {
            result += (array[i] + " ");
        }
        result = result.trim();
        return result;
    }

    @Override
    public boolean makeConnection() {
        if (super.getDataSource().contains("localhost:8080")) {
            return true;
        }else{
            return false;
        }
    }
    
}
