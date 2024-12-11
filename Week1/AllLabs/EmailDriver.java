package store;

public class EmailDriver {

	public static void main(String[] args) {
		
		Emailstore mail = new Emailstore();
		WordCounter wc = new WordCounter();
		
		mail.addEmail("zach@icloud.com");
		mail.addEmail("zach@icloud.com");
		mail.hasEmail("zach@icloud.com");
		mail.hasEmail("james@icloud.com");
		mail.displayEmails();
		System.out.println("__________________");
		
		wc.addSentence("This sentence has the word has in it twice");
		wc.addWord("word");
		wc.outputResults();

	}

}
