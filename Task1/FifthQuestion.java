package Task1;
//Write a java program that takes the purchase amount as input and calculates the final payable amount after applying the discount
import java.util.Scanner;

public class FifthQuestion {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the purchase amount");
		int amount = scan.nextInt();
		if(amount<500) {
			System.out.println("No discount applied");
			System.out.println("Final payable amount="+amount);
		} else if((amount>=500)&&(amount<=1000)){
			System.out.println("10% discount applied");
			amount=(amount*90)/100;
			System.out.println("Final payable amount is"+amount);
		} else {
			System.out.println("20% discount applied");
			amount=(amount*80)/100;
			System.out.println("Final payable amount is"+amount);
		}

	}

}
