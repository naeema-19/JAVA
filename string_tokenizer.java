/* Write a JAVA program that reads a line of integers and then displays each integer, and the sum of all the integers (use String Tokenizer class of java.util)*/

import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int dig=0,sum=0; 
		System.out.println("Enter the digits with space in between them");
		String s1 = sc.nextLine();
		StringTokenizer token = new StringTokenizer(s1);
		System.out.println("Entered Numbers");
		while(token.hasMoreTokens())
		{
			String s3 = token.nextToken();
			dig = Integer.parseInt(s3);
			System.out.println(dig + " ");
			sum = sum + dig;
			
		}
		System.out.println("\n Sum = " + sum);
		
		
	}

}
