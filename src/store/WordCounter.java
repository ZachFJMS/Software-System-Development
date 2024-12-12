package store;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class WordCounter {

	private final Map<String, Integer> wordMap = new HashMap<String, Integer>();
	
	void addWord(String word){
		if(wordMap.containsKey(word)) {
			int var = wordMap.get(word) + 1;
			wordMap.put(word,var);
		}
		else 
			wordMap.put(word, 1);
			
		}
	
	
	void addSentence(String sentence){
		String array [] = sentence.split(" ");
		for (String word : array) {
			addWord(word);
		}
	}
	
	void outputResults() {
		for (Entry<String, Integer> entry : wordMap.entrySet()) {
		    String key = entry.getKey();
		    Object value = entry.getValue();
		    System.out.println(key +" : "+ value);
		    
		}
	}
}

