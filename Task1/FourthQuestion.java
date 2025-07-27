package Task1;
//Write a program to find the smallest number among three numbers
import java.util.Scanner;

public class FourthQuestion {
//
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a=");
		int a= scan.nextInt();
		System.out.print("Enter b=");
		int b= scan.nextInt();
		System.out.print("Enter c=");
		int c= scan.nextInt();
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("c="+c);
		if((a<b)&&(a<c)){
		System.out.println("The smallest number a is "+a);
		}else if(b<c){
			System.out.println("The smallest number b is "+b);
		} else {
			System.out.println("The smallest number c is "+c);
		}
		}
		

	}
