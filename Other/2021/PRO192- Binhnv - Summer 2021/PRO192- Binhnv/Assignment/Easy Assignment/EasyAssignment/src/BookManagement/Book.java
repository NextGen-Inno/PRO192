package BookManagement;

public class Book {
	private String codeString; // that hold the book’s code. 
	private String titleString; // that hold the book’s title.
	private int qua; //that hold the  number of  books with the same code in the library
	private double price; // that hold the book’s price.
	public Book() {
		super();
	}
	public Book(String codeString, String titleString, int qua, double price) {
		super();
		this.codeString = codeString;
		this.titleString = titleString;
		this.qua = qua;
		this.price = price;
	}
	public String getCodeString() {
		return codeString;
	}
	public void setCodeString(String codeString) {
		this.codeString = codeString;
	}
	public String getTitleString() {
		return titleString;
	}
	public void setTitleString(String titleString) {
		this.titleString = titleString;
	}
	public int getQua() {
		return qua;
	}
	public void setQua(int qua) {
		this.qua = qua;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("Book: %s\t %s \t %d \t %f ", codeString,titleString,qua, price);
	}
	

}
