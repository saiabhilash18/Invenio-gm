package demo;
public class Exception1{  
	  public static void main(String args[]){  
	   try{  
	      int data=30/0;  
	   }
	   catch(ArithmeticException e)
	   {
		   System.out.println(e);
		   }  
	   
		  System.out.println("right code");
			  
	  }  
	} 
