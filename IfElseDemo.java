import java.util.Scanner;

public class IfElseDemo {

	public static void main(String[] args) {
	
		//Write a program to count total number of notes in given amount
		
		// n--8== 5 2 1
		int money = 8,c5=0,c2=0,c1=0;
		String totalVal = "";
		if(money > 5) {
			c5= money /5;
			totalVal = totalVal + "5 coins--->"+c5+"\n";
			money = money - (c5*5);
		}
		if(money > 2) {
			c2= money /2;
			totalVal = totalVal + "2 coins--->"+c2+"\n";
			money = money - (c2*2);
			
		}
		if(money == 1) {
			c1= money;
			totalVal = totalVal + "1 coins--->"+c1;
			
		}
		System.out.println(totalVal);
		
	}

}
