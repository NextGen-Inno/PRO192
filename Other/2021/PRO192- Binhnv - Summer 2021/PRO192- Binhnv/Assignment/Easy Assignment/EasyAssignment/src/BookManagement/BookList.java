package BookManagement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

public class BookList {

	public void Input(ArrayList<Book> list) {
		System.out.println("---------------Input the Book's List---------------");
		int yes = 1;
		do {
			System.out.print("Input the Book's code:  ");
			Scanner scanner = new Scanner(System.in);
			String codeString = scanner.nextLine();
			if (codeString == null || codeString == "") {
				break;
			}
			System.out.print("Input the Book's title: ");
			String titleString = scanner.nextLine();

			System.out.print("Input the Book's qua: ");
			int qua = scanner.nextInt();

			System.out.print("Input the Book's price: ");
			double price = scanner.nextDouble();

			list.add(new Book(codeString, titleString, qua, price));
			System.out.println("\nDo you have another book?(1: yes || 0 : No)");
			yes = scanner.nextInt();

		} while (yes == 1);

	}

	public void Display(ArrayList<Book> list) {
		for (Book book : list) {
			System.out.println(book);
		}
	}

	public void Search(ArrayList<Book> list) {
		System.out.print("What is the Book's code: ");
		String number = new Scanner(System.in).nextLine();
		boolean find = false;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getCodeString().equals(number)) {
				find = true;
				System.out.println(list.get(i));
			}

		}
		if (find == false) {
			System.out.println("\nThe library don't have that book ");
		}

	}
	private void Remove(ArrayList<Book> list) {
		System.out.print("What is the Book's code: ");
		String number = new Scanner(System.in).nextLine();
		boolean find = false;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getCodeString().equals(number)) {
				find = true;
				list.remove(i);
			}

		}
		if (find == false) {
			System.out.println("\nThe library don't have that book ");
		}
	}

	private void SortAscending(ArrayList<Book> list) {
		Collections.sort(list,new Comparator<Book>() {

			@Override
			public int compare(Book o1, Book o2) {
				return o1.getCodeString().compareTo(o2.getCodeString());
			}
			
		});
		Display(list);
	}

	private void Max(ArrayList<Book> list) {
		Book max = list.get(0);
		for (Book book : list) {
			if (max.getPrice() < book.getPrice()) {
				max = book;
			}
		}
		System.out.println("The first max value is : "+max);
	}

	private void Update(ArrayList<Book> list) {
		// TODO Auto-generated method stub
		System.out.print("What is the Book's code: ");
		String number = new Scanner(System.in).nextLine();
		boolean find = false;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getCodeString().equals(number)) {
				find = true;
				System.out.println("The new price for that book is: ");
				double newPrice = new Scanner(System.in).nextDouble();
				list.get(i).setPrice(newPrice);
			}

		}
		if (find == false) {
			System.out.println("\nThe library don't have that book ");
		}
	}



	public static void main(String[] args) {
		ArrayList<Book> list = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		BookList bookList = new BookList();
		do {
			System.out.println("-----------------MENU-----------------");
			System.out.println("1.	Input & add book(s) to the end.");
			System.out.println("2.	Display all books.");
			System.out.println("3.	Search a book for given code.");
			System.out.println("4.	Update the book’s price for given code.");
			System.out.println("5.	Find the (first) max price value.");
			System.out.println("6.	Sort the list ascendingly by code.");
			System.out.println("7.	Remove the book having given code.");
			System.out.println("0.	Exit.");
			System.out.println("--------------------------------------");
			System.out.print("What is your choice ? \n");
			int choice = scanner.nextInt();
			switch (choice) {
			case 1: {

				bookList.Input(list);
				break;

			}
			case 2: {
				bookList.Display(list);
				break;
			}
			case (0): {
				System.exit(0);
				break;
			}
			case 3: {
				bookList.Search(list);
				break;

			}
			case 4: {
				bookList.Update(list);
				break;
			}
			case 5: {
				bookList.Max(list);
				break;
			}
			case 6: {
				bookList.SortAscending(list);
				break;
			}
			case 7: {
				bookList.Remove(list);
				break;
			}

			default:
				System.out.println("You are Wrong!!!");
			}

		} while (true);

	}
}

