package com.java.main;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
public class TextExtractorTask extends Thread {
	//declare attributes text and listOfWords
	private String text;
	private List<String> listOfWords;
	
	public TextExtractorTask() {
		// assign value to attribute text
		text = "The List component presents the user with a "
				+ "scrolling list of text items. The list can be "
				+ "set up so that the user can "
				+ "choose either one item or multiple items.";
		
		//create an ArrayList
		listOfWords = new ArrayList<>();
		
		//splitting the input text on spaces
		for(String word: text.split(" "))
			// adding each word to the list
			listOfWords.add(word);
	}
	
	// get random text from attribute listOfWords
    public String getRandomText() {
        // shuffle the listOfWords to get word in random order
        Collections.shuffle(listOfWords);
        /*
         * concatenate the words into a random text
         * separated by spaces
         */
        return String.join(" ", listOfWords);
    }
    
   // extract a portion of text at random length
    public String getRandomLengthText(int start, int end) {
    	return text.substring(start, end);
    	
    }

    // implement Runnable interface
	@Override
	public void run() {
		//get thread name
		String threadName = currentThread().getName();
		
		//print the thread name
		System.out.println(threadName);
		
		/*
		 *  execute method getRandomText() if the name 
		 *  of the thread contains "Generator"
		 */
		if(threadName.contains("Generator")) {
			// print the random text
			System.out.println("Random Text: " + getRandomText());
		}
		
		/*
		 *  execute method getRandomLengthText() if the name 
		 *  of the thread contains "Extractor"
		 */
		if(threadName.contains("Extractor")) {
			// print the text with random length
			System.out.println("Random Length: " + getRandomLengthText(0, 10));
		}
	}
}
