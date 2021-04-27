

public class MyAppWithBook {
	public static void main (String[] args){
		//System.out.println(BookDemo.count);
		BookDemo book1 = new BookDemo();
		book1.setTitle("Sapiens: scurta istorie a omenirii");
		book1.setAuthor("Yuval Noah Harari");
		book1.setPubYear(1980);
		BookDemo book2 = new BookDemo ("Steve Jobs",2007,"Walter Isaacson");
		System.out.println(book1.getAuthor()+" "+book1.getTitle()+" "+book1.getPubYear());
		System.out.println(book2.getAuthor()+" "+book2.getTitle()+" "+book2.getPubYear());
		BookDemo.showCount();
	}

}
