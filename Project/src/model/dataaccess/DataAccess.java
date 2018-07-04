package model.dataaccess;

import java.util.HashMap;

import model.domain.Book;
import model.domain.LibraryMember;
import model.domain.User;

public interface DataAccess {
	public HashMap<String, Book> readBooksMap();

	public HashMap<String, LibraryMember> readMemberMap();

	public HashMap<String, User> readUserMap();

	public void saveAbook(Book bk);

	public void saveNewMember(LibraryMember member);
}
