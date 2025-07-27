package Task1;
//Write a java program for number pattern
public class SixthQuestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stud
		int i,j,k;
		System.out.println("The Result is");
		
		for(i=1;i<=5;i++) {
			for(j=1;j<=5;j++) {
				if (j<=i){
					k =6-j;
				}else {
					k=6-i;
				}
				System.out.print(+k);
			}
			System.out.println();
			}

	}

}
