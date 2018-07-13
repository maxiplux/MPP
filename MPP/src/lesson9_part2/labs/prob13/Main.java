package lesson9_part2.labs.prob13;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book book = new Book("test",3);
		List<BookCopy> copies = book.getCopies();
		copies.forEach(e -> e.changeAvailability());
		System.out.println(book.isAvailable());
		

	}

}
