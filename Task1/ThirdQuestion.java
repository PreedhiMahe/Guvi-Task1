package Task1;

import java.util.Scanner;

//Write down the program to reverse the given using loops
public class ThirdQuestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number");
		int input = scan.nextInt();
		int rev=0;
		System.out.println("Input="+input);
		while(input>0) {
			rev = rev*10 + input%10;
			input/=10;
		}
		System.out.println("The Reversed number");
		System.out.println("Output="+rev);

	}

}
