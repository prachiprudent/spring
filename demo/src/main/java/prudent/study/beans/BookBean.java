package prudent.study.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BookBean {
	
	private String bookName,author;
	

	public BookBean() {
	 System.out.println("book bean default constructor");
	 this.setAuthor("prachi");
	 this.setBookName("Learning Spring");
	
	}


	public BookBean(String bn,String auth)
	{
		this.bookName =bn;
		this.author =auth;
	}

	@Autowired
	public BookBean(Data d)
	{
		this.bookName =d.getName();
		this.author = d.getAuth();
	}
	
	
	
	public String getAuthor() {
		return author;
	}
	
	public String getBookName() {
		return bookName;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

}
