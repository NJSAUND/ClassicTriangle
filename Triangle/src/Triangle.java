import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Triangle {
	public static void main(String[] args) 
	{
		Scanner file = new Scanner("input.txt");
		//String triangleSide1 = "1 x 1";
		//Scanner parse = new Scanner (triangleSide1);
		file.useDelimiter(" ");
		
		try
		{
			int s1= file.nextInt();
			System.out.println(s1);
			int s2= file.nextInt();
			System.out.println(s2);
			int s3= file.nextInt();
			System.out.println(s3);
				
		}
		catch(InputMismatchException ime)
		{
			System.out.println("Error in data");
			
		}
	}
}