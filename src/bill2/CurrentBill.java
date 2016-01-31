package bill2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class CurrentBill {

	public static void main(String[] args) throws IOException, Exception {
       Scanner scan=new Scanner(System.in);
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    		String name;
           int date=0,sarwayno=0,pollno=0,bill=0,dueamount=0,units=0;
        	   System.out.println("name=");
        	   name=br.readLine();
        	   System.out.println("date=");
        	   date=scan.nextInt();
        	   System.out.println("surveyno=");
        	   sarwayno=scan.nextInt();
        	   System.out.println("pollno=");
        	   pollno=scan.nextInt();
        	   System.out.println("bill=");
        	   bill=scan.nextInt();
        	   System.out.println("dueamount=");
        	   dueamount=scan.nextInt();
        	   System.out.println("enter units");
        	   units=scan.nextInt();
//        	   add(units, dueamount);
        	   if(units>90){
       			System.out.println("total bill="+(dueamount*2));
       		}
        	
        		  
        	   
           }
			

//	public void add(int units, int dueamount) {
//
//		int units1=units;
//		int due1=dueamount;
//		
//	}
    		
            
            
    		}
	
	

	
