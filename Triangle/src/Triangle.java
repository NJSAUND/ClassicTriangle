import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Arrays;

public class Triangle 
{
	public static void main(String[] args) 
	{
		int[] sides = readFiles("input.txt");
		System.out.println(Arrays.toString(sides));
	}
	
	public static int[] readFiles(String file) {
		
		try {
			File f = new File(file);
			Scanner s = new Scanner(f);
			//file.useDelimiter(" ");
			int ctr = 0;
			
			
			while (s.hasNextInt()) {
				ctr++;
				s.nextInt();
			}
			
			int[] arr = new int[ctr];
			
			Scanner s1= new Scanner(f);
			for(int i = 0; i < arr.length; i++)
				arr[i] = s1.nextInt();
			
			return arr;
			//Scanner file = new Scanner(new File("input.txt")); this should work, but have string file in method
			
		}
		catch(Exception e) {
			return null;
			
		}
		
	}
}
