package exercise01;


import java.text.SimpleDateFormat;
import java.util.Date;
public class Statementprinter extends Thread{
	

	public void printStatement (String currentThread) {
		
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Date date = new Date();
		
		String currentDate = formatter.format(date);
		
		for (int counter = 1; counter < 11; counter++) {
			System.out.println(currentThread +"\t"+counter+ "->" + currentDate);
;
		}
	}

	@Override
	public void run() {
		// Get current thread
		Thread currentThread = Thread.currentThread();
		
		//Execute task
		printStatement(currentThread.getName());
		
	}

}