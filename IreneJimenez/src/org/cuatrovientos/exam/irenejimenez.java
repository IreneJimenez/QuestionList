/**
 * 
 */
package org.cuatrovientos.exam;

/**
 * Simple class to manage an array of ip´s
 * @author Irene
 *
 */
import java.util.Random;
import java.util.Scanner;




public class irenejimenez {
	
	/**
	 * Show all elements of an array
	 * @param ipAddresses
	 */
	public static void showArray(String[] ipAddresses) {
		for (int i=0;i< ipAddresses.length;i++) {
			System.out.println(i + ": " + ipAddresses[i]);
			
		}
	}
	
	/**
	 * Generate an IP with random numbers 
	 * @param ipAddresses 
	 * @return an ip address
	 */
	public static String generateRandomIp() {
		  Random random = new Random();
		  String ip = "";
		  int a = 0;
		  int b = 0;
		  int c = 0;
		  int d = 0;
		  
		  for (int i = 1; i < 2; i++) {
				a = random.nextInt(256);
				b = random.nextInt(256);
				c = random.nextInt(256);
				d = random.nextInt(256);
				
			}
		  ip = a + "." + b + "." + c + "." + d;
		  return ip; 
	  } 
	
	/**
	 * Init an array with IP addresses
	 * @param ipAddresses
	 */
	public static void loadArray(String[] ipAddresses) {
		for (int i=0;i< ipAddresses.length;i++) {
			ipAddresses[i] = generateRandomIp();
		}
	}
	
	/**
	 * Summary of IpAddresses starts with 1, 2 or other numbers
	 * @param ipAddresses
	 */
	 public static void summary(String[] ipAddresses) {
		 int two = 0;
		 int one = 0;
		 int other = 0;
		 
		 
		 for (int i = 0; i < ipAddresses.length;i++) {
			 if (ipAddresses[i].startsWith("2")) {
				 two = two + 1;
			 } else {
				 if (ipAddresses[i].startsWith("1")) {
					 one = one + 1;
				 } else {
					 other = other + 1;
				 }
			 }
		 }
		 
		 System.out.println("Total IP start with 1: " + one);
		 System.out.println("Total IP start with 2: " + two);
		 System.out.println("Other IP´s: " + other);
	 }

	//public static void showArray (String[] ipAddresses) {}
	//public static String generateRandomIp() {}
	//public static void loadArray(String[] ipAddresses) {}
	//public static void summary(String[] ipAddresses) {}

	/**
	 * Main method
	 * @param args
	 */
	public static void main (String args[]) {
		String [] ipAddresses = new String[10];
		Scanner reader = new Scanner(System.in);
		String option = "";
		
		do {

			System.out.println("Select an option:");
			System.out.println("1. Display array elements");
			System.out.println("2. Display a randomly generated IP address");
			System.out.println("3. Init array with random IP addresses");
			System.out.println("4. Summary of array");
			System.out.println("5. exit");

			option = reader.nextLine();

			switch (option) {
			case "1":
				showArray(ipAddresses);
				break;
			case "2":
				generateRandomIp();
				break;
			case "3":
				loadArray(ipAddresses);
				break;
			case "4":
				summary(ipAddresses);
				break;
			case "5":
				System.out.println("See you around");
				break;
			default:
				break;
			}

		} while (!option.equals("5"));
	}
	
	}

