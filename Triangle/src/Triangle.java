import java.util.Scanner;
import java.io.File;
import java.util.*;
import java.io.FileNotFoundException;

public class Triangle {

	public static void main (String[] args)
	{

		File fileName = new File("input.txt"); // establishes file location
		String array[];
		int s1,s2,s3;
		try { 
			Scanner file = new Scanner( new File("input.txt")); // establishes scanner and file to be scanned
			String parse; 
			while((parse = file.nextLine())!=null) { 
				
				array = parse.split(" "); // reads a space as a delimiter
					if(array.length==3) {
						try {
							s1 = Integer.parseInt(array[0]);
							s2 = Integer.parseInt(array[1]);
							s3 = Integer.parseInt(array[2]);
							
							if(s1+s2>=s3 && s2+s3>=s1 && s1+s3>=s2){
								
								if(s1==s2 && s2==s3) System.out.println("Equilateral");
							
								else if(s1==s2 || s2==s3 || s3==s1) System.out.println("Isosceles");
							
								else System.out.println("Scalene");
							}
							else {
								System.out.println("Not a Triangle because ");
							}
						}
						catch(Exception e) {
							
							System.out.println("Not a Triangle because ");
						}
		
					}	
			else{
					System.out.println("Not a Triangle because of ");
				}
			}
		file.close();	
		}
		catch(Exception e) {
		
		}
		
	}

}

