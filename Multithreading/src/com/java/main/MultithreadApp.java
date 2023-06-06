package com.java.main;

public class MultithreadApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TextExtractorTask textExtractor = new TextExtractorTask();
		TextExtractorTask textGenerator = new TextExtractorTask();
		TextExtractorTask textAnalyzer = new TextExtractorTask();
		
		textExtractor.setName("textExtractor");
		textGenerator.setName("textGenerator");
		textAnalyzer.setName("textAnalyzer");
		
		textExtractor.start();
		textGenerator.start();
		textAnalyzer.start();
		
		System.out.println("Program End");
	}

}
