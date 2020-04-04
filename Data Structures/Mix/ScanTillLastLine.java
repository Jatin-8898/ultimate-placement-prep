// Java program to illustrate the 
// hasNextLine() method of Scanner class in Java 
// without parameter 

import java.util.*; 

public class ScanTillLastLine { 
	public static void main(String[] argv) throws Exception 
	{ 
		// new scanner with the specified String Object 
		Scanner scanner = new Scanner(System.in); 

		// use US locale to interpret Lines in a string 
		scanner.useLocale(Locale.US); 

		// iterate till end 
		while (scanner.hasNextLine()) { 

			// print what is scanned 
			System.out.println(scanner.nextLine() + "HELLO"); 
		} 

		// close the scanner 
		scanner.close(); 
	} 
} 
