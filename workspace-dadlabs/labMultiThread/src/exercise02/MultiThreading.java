package exercise02;

import java.util.Arrays;

public class MultiThreading{

	public static void main(String[] args) {
		
		// create objects of runnable
		Runnable numerable = new DataPrinter();
		Thread numberThread = new Thread(numerable);
		numberThread.setName("text");
		
		Runnable statement = new data();
		Thread statementThread = new Thread(statement);
		statementThread.setName("word1/word2");
		
		// Execute thread
		statementThread.start();
		numberThread.start();

	}

}