package bill2;

import java.util.Scanner;

public class Billing {

	public static void main(String[] args) {
		int a,c=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter how many products you need");
		try{
		int b=scan.nextInt();
		System.out.println("enter "+b+" products");
		for(int i=0;i<b;i++){
			a=scan.nextInt();
			c=c+a;
		}
		}
		catch(Exception e){
			e.getMessage();
		}
		System.out.println("total bill="+c);
	}

}
