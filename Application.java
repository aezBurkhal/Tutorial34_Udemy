import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) throws FileNotFoundException {
		//String fileName = "C:\\Users\\aburk\\Desktop\\Tutorial34File.txt";
		String fileName = "Tutorial34File.txt";
		
		//create file object java representation of file
		File textFile = new File(fileName);
		
		//reading a file in java use Scanner class
		Scanner in = new Scanner(textFile);
		
		int value = in.nextInt();
		//to read an integer value in the file
		System.out.println("Read value: " + value);
		
		//to get rid of blank line after reading integer in file
		in.nextLine();
		
		int count = 2;
		while(in.hasNextLine()) {
			String line = in.nextLine();
			System.out.println(count + ": " + line);
			count++;
		}
		
		in.close();

	}

}
