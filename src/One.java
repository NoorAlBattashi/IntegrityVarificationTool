/**
 * 
 */

/**
 * This class can be used to generate hashes of files and strings.
 *
 */

import java.util.Scanner;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * TBD
 * Generate sha256 hash
 */
public class One {

	/**
	 * @param args: Contains arguments from command line
	 * @throws NoSuchAlgorithmException 
	 */
	public static void main(String[] args) throws NoSuchAlgorithmException {
		// TODO: Add a space after double forward slashes in comments Exercise1
		System.out.println("Exercise1:");
		System.out.println("Select an action:");
		System.out.println("---------------------");
		System.out.println("1) Generate HASH");
		System.out.println("2) Compare HASH");
		System.out.println("3) Re-compute");
		System.out.println("---------------------");
		
		// Create a Scanner
		Scanner input = new Scanner(System.in);
		
		//Prompt the user to enter his SELECTION
		System.out.println("Select the number of the action you want from the list:");
		
		//Store the value of the user input in string variable
		int userSelection = input.nextInt();
	
		//Display the result depends on the input
		if (userSelection == 1) {
			System.out.println("You select Generate HASH!");
			System.out.println("");
			
			//SHA256
			Scanner textSHA = new Scanner(System.in);
			System.out.println("Enter the words that you want to hash");			
			String in =  textSHA.nextLine();
			
			MessageDigest md = MessageDigest.getInstance("SHA-256");
			//update Method of Message Digest Class
			md.update(in.getBytes());
			
			//Byte[]: the array of bytes for the resulting hash value.
			byte[] digest = md.digest();
			//create an empty object of StringBuffer and then adding the value using append or insert method
			StringBuffer sb = new StringBuffer();
			for(byte b : digest) {
				
				//b & 0xff gets the last byte of b. Since b is already a byte
				//%02x means to specify a format where there are two characters using hexadecimal
				sb.append(String.format("%02x",b & 0xff));
								
			}	
			System.out.println("SHA-256 HASH: " + sb.toString());
		}
		else if (userSelection == 2){
			System.out.println("You select Compare HASH!");
		}
		else if (userSelection == 3){
			System.out.println("You select Re-compute!");
		}
		else{
			System.out.println("Wrong Selection!");
		}

	}
	
}
