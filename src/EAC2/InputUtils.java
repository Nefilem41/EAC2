package EAC2;

import java.util.Scanner;

public class InputUtils {

	private Scanner scanner;
	
	
	public String readline() {
		
		if (scanner.hasNextLine()) {
			return scanner.nextLine();
		}
			return "-1";	
		
		}
	
	public int readint() {
	
		if (scanner.hasNextInt()) {
			return scanner.nextInt();
		}
			return -1;	
	}
	
	
	
	public InputUtils() {
		
		this.scanner = new Scanner (System.in);
		
	}
}
	 

