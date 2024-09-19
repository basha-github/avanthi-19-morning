import java.util.Scanner;

public class CheckIsAlpha {

	public static void main(String[] args) {
		
		//Write a program to check whether a character is alphabet or not
		char ch = '6';
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a character");
		String str = sc.next();// 
		
		ch = str.charAt(0);
		
		// A-Z
		//65-90
		// 97+25---122
		if( ((ch >=65) && (ch<=90)) || ( (ch >=97) && (ch<=122) )
		  ) {
			System.out.println("Alphabet");
		}
		else {
			System.out.println("Not alphabet");
		}
	}

}
