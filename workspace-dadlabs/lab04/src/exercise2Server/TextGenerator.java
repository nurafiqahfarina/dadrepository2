package exercise2Server;

import java.util.Date;

public class TextGenerator {
	
	/**
	 * This method generates current date
	 * 
	 * @return current date
	 */
	
	public String getCurrentDate( ) {
		
		
		String currentDate = new Date().toString();
		
		return currentDate;
	}

}