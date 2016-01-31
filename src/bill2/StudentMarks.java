package bill2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class StudentMarks {

	

	public static void main(String[] args) {
      Scanner scan=new Scanner(System.in);
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       String sname=null,rn=null,grade="";
       int s=0,sbj=0,total=0,percentage=0,pass=0,fail=0;
       
       try{
    	   System.out.println("enter student name");
    	   sname=br.readLine();
    	   System.out.println("enter roll number");
    	   rn=br.readLine();    	   
    	   System.out.println("enter subjects");
    	   s=scan.nextInt();
    	   for(int i=0;i<s;i++){
    		   sbj=scan.nextInt();
    		   if(sbj<40){
    			   fail++;
     		   }
    		   if(sbj>40){
    			   pass++;
    		   }
    		   total=total+sbj;
    	   }
    	   percentage=(total/s);
    	   if(percentage>75){
    	   grade="A";
    	   }
    	   if(percentage>60){
    		   grade="B";
    	   }
    	   System.out.println("student name="+sname);
    	   System.out.println("roll number="+rn);
    	   System.out.println("percentage="+percentage);
    	   System.out.println("grade="+grade);
    	   System.out.println("pass="+pass);
    	   System.out.println("fail="+fail);
       }
       
    	   catch(Exception e){
    		   e.getMessage();
    	   }
    	 
       }
	}


