package lab4;

//definim clasa care implementeaza Interfata Book

public class BookDemo implements Book {
	protected String title;
	protected int pubYear;
	protected String author;
	protected static int count;

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String _title) {
		this.title = _title;
	}

	public int getPubYear() {
		return this.pubYear;
	}

	public void setPubYear(int _pubYear) {
		this.pubYear = _pubYear;
	}

	public String getAuthor() {
		return this.author;
	}

	public void setAuthor(String _Author) {
		this.author = _Author;
	}

	// doi constructori
	public BookDemo() {
		++count;
	}

	public BookDemo(String title, int pubYear, String author) {
		setTitle(title);
		setPubYear(pubYear);
		setAuthor(author);
		++count;
	}

	public static void showCount() {
		System.out.println("count = " + count);
	}
}