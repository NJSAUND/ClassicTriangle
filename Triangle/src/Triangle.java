
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Triangle {

	public static void main(String[] args) {
						
		try {
			Scanner file = new Scanner( new File("Text.txt" ) );
			
		}
		
		
		//File input = new File("Whatever.txt");
		//Scanner scan = new Scanner(input);
		
		
		/*if (a == b && b == c) {
            System.out.println("Equilateral Triangle");
        } 
		else {
            if ((a == b && b !=c) || (a == c && a != b)) {
                System.out.println("Isoceles Triangle");
            }
            if (a != b && b != c && a != c) { 
                System.out.println("Scalene Triangle");
            }
            if (((a + b) > (c)) && ((a + c) > b) && ((b + c) > a)) {
                System.out.println("Not a Triangle");
            }
        }
		*/		
		file.close();
			
	}

}

