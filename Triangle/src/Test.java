import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.ArrayList;

public class Test {

		public static void main(String[] args) throws FileNotFoundException 
		{
			Scanner file = new Scanner(new File("input.txt"));
			//String triangleSide1 = "1 5 1";
			//Scanner parse = new Scanner (triangleSide1);
			//file.useDelimiter(" ");
		
				
			//instantatiate array list to hold TriangleSides
			ArrayList<Integer> listTriangleSides = new ArrayList<Integer>();
			
			
			while (file.hasNextLine())
				listTriangleSides.add(file.nextInt());
				
				
				
				System.out.println(listTriangleSides);			
			/*try
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
		*/
		
		//public Triangle(int s1, int s2, int s3) {}
			
			
		}
		
	}

