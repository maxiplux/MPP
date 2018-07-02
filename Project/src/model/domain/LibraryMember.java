package model.domain;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

final public class LibraryMember extends Person implements Serializable {
	private String memberId;
	private List<CheckoutRecordEntry> checkoutRecordEntries = new ArrayList<>();

	public LibraryMember(String memberId, String fname, String lname, String tel, Address add) {
		super(fname, lname, tel, add);
		this.memberId = memberId;
	}

	public String getMemberId() {
		return memberId;
	}

	public List<CheckoutRecordEntry> getCheckoutRecordEntries() {
		return checkoutRecordEntries;
	}
	
	public void addCheckoutRecordEntry(BookCopy bookcopy, LocalDate checkoutDate, LocalDate dueDate)
	{
		CheckoutRecordEntry cre = new CheckoutRecordEntry(bookcopy, checkoutDate, dueDate);
		this.checkoutRecordEntries.add(cre);
	}

	@Override
	public String toString() {
		return "Member Info: " + "ID: " + memberId + ", name: " + getFirstName() + " " + getLastName() + ", "
				+ getTelephone() + " " + getAddress();
	}

	private static final long serialVersionUID = -2226197306790714013L;
}
