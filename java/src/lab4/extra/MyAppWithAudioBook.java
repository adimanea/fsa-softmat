

public class MyAppWithAudioBook {
	public static void main (String[] args) {
		AudioBook book1 = new AudioBook ("Sapiens: scurta istorie a omenirii",1980,"Yuval Noah Harari",true);
		AudioBook book2 = new AudioBook ("Steve Jobs",2007,"Walter Isaacson",false);
		System.out.println(book1.getAuthor()+" "+book1.getTitle()+" "+book1.getPubYear()+" "+book1.getAudioSetting());
		System.out.println(book2.getAuthor()+" "+book2.getTitle()+" "+book2.getPubYear()+" "+book2.getAudioSetting());
		AudioBook.showCount();
	}

}
