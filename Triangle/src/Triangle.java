import java.util.Scanner;
import java.io.File;
import java.util.*;
import java.io.FileNotFoundException;

public class Triangle {

	public static void main (String[] args)
	{

		String array[];
		int s1,s2,s3;
		try { 
			Scanner file = new Scanner( new File("input.txt")); // establishes scanner and file to be scanned
			String parse; 
			while((parse = file.nextLine())!=null) { 
				
				array = parse.split(" "); // reads a space as a delimiter
				if(array.length==3) {
					try {
						s1 = Integer.parseInt(array[0]);//brings first side into array
                        s2 = Integer.parseInt(array[1]);//brings second side into array
                        s3 = Integer.parseInt(array[2]);//brings third side into array
						
						if(s1 == 0){
							System.out.println("Not a Triangle because the sides cannot form a triangle");//checks for zero input on s1
							
						}
						else if(s2 == 0) {
							System.out.println("Not a Triangle because the sides cannot form a triangle");//checks for zero input on s2
						}
						else if(s3 == 0) {
							System.out.println("Not a Triangle because the sides cannot form a triangle");//checks for zero input on s3
						}
				
						else if(s1+s2>=s3 && s2+s3>=s1 && s1+s3>=s2){//tests if the sides equal a triangle
							
							if(s1==s2 && s2==s3) System.out.println("Equilateral"); // tests for Equilateral
						
							else if(s1==s2 || s2==s3 || s3==s1) System.out.println("Isosceles");// tests for isosceles
						
							else System.out.println("Scalene");//everything else is scalene
						}
						else {
							System.out.println("Not a Triangle because the sides cannot form a triangle.");// if sides aren't equal
						}
					}
					catch(Exception e) {
						
						System.out.println("Not a Triangle because there is an input error.");//catch for incorrect format of triangle
					}
	
				}	
				else{
						System.out.println("Not a Triangle because there are not exactly three sides.");//shows the amount of sides are not correct 
					}
			}
		file.close();	
		}
		catch(Exception e) {
		//catch for file error
		}
		
	}

}

