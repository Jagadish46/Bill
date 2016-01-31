package bill2;

import java.util.Scanner;

public class Cal {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int a,b=0;
		int c=scan.nextInt();
		for(int i=0;i<c;i++){
			a=scan.nextInt();
			b=b+a;
		
		}
		System.out.println(b);	
		
	}

}
