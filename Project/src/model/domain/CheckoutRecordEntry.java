package model.domain;

import java.io.Serializable;
import java.time.LocalDate;

public class CheckoutRecordEntry implements Serializable {
	private static final long serialVersionUID = 659783906422028230L;
	private BookCopy bookcopy;
	private LocalDate checkoutDate;
	private LocalDate dueDate;

	public CheckoutRecordEntry(BookCopy bookcopy, LocalDate checkoutDate, LocalDate dueDate) {
		this.bookcopy = bookcopy;
		this.checkoutDate = checkoutDate;
		this.dueDate = dueDate;
	}

	public BookCopy getBookcopy() {
		return bookcopy;
	}

	public LocalDate getCheckoutDate() {
		return checkoutDate;
	}

	public LocalDate getDueDate() {
		return dueDate;
	}

	@Override
	public String toString() {
		return "CheckoutRecordEntry [bookcopy=" + bookcopy + ", checkoutDate=" + checkoutDate + ", dueDate=" + dueDate
				+ "]";
	}

}
