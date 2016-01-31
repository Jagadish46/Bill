package bill2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Shopping {

	public static void main(String[] args) {
       Scanner scan=new Scanner(System.in);
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       String Cname = null,category = null,pname = null;
       int num,price = 0,items = 0,total = 0,gtotal=0;
    	   num =scan.nextInt();
    	   int arr[]=new int[100];
      	 String arr1[]=new String[100];
    	   try{
         for(int i=0;i<num;i++){        	 
    	   System.out.println("enter company name:");    	   
    	   Cname=br.readLine();
    	   arr1[i]=Cname;
    	   System.out.println("enter category:");
    	   category=br.readLine();
    	   arr1[i+1]=category;
    	   System.out.println("enter product name:");
    	   pname=br.readLine();
    	   arr1[i+2]=pname;
    	   System.out.println("enter price:");
    	   price=scan.nextInt();
    	   arr[i+3]=price;
    	   System.out.println("enter items:");
    	   items=scan.nextInt();
    	   arr[i+4]=items;
    	   total=price*items;
    	   arr[i+5]=total;
    	   gtotal=gtotal+total;
    	   System.out.println("total="+total);
         }
    	   }
    	   catch(Exception e){
    		   e.getMessage();
    	   }
    	   System.out.println("your invoice:");
    	   try{
    		   for(int j=0;j<num;j++){
    	   System.out.println("company name:"+arr1[j]);   
           System.out.println("category:"+arr1[j+1]);
           System.out.println("product name:"+arr1[j+2]);
           System.out.println("price:"+arr[j+3]);
           System.out.println("items:"+arr[j+4]);
           System.out.println("total="+arr[j+5]);
         }
    		   System.out.println("gross total="+gtotal);
    	   }
    	   catch(Exception e){
    		   e.getMessage();
    	   }
	}
	}
