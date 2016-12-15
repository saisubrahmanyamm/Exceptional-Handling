import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExceptionHandling {
	
	public static void main(String args[]) throws  IOException 
	{
		int s= 1;
		do
		{
		int firstNumber =20;
		
		int secondNumber = 0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("1 : Arithmetic Exception \n2 : NullPointer Exception \n3 : ArrayIndexOutOfBounds Exception \n4 : NumberFormat Exception");
		System.out.println("Enter choice:");
		int choice =Integer.parseInt(br.readLine());
		
		try
		{
		switch(choice)
		{
		case 1:
			System.out.println("case 1 : Expected ArithmeticException: / by zero");
			int divisionResult= firstNumber/secondNumber;
			System.out.println(divisionResult);
			break;
		case 2 :
			System.out.println("case 2 : Expected NullPointerException ");
			String s1=null;  
			System.out.println(s1.length());
			break;
		case 3 : 
			System.out.println("case 3: Expected ArrayIndexOutOfBoundsException ");
			int array[]=new int[5];  
			array[10]=50;
			break;
		case 4:
			System.out.println("case 4 : Expected NumberFormatException ");
			String abc="abc";  
			int i=Integer.parseInt(abc);
			break;
		
		}
		
		
		}
		
		
	
		catch (Exception e1)
		
		{
			System.out.println(e1);
	  
		}
		finally
		{
			System.out.println("Finally always executes ");
		
		
			s++;
		}
		//System.out.println( "saihih");
		}while (s<5);

		System.out.println( "saihih");

	}

}
