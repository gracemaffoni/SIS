import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class TextFile 
	{
		static ArrayList<Student> directory = new ArrayList<Student>();
		
		public static void textFile() throws IOException
		{
			Scanner studentList = new Scanner(new File("StudentList.txt"));
			

			
			while (studentList.hasNext())
				{
					String line = studentList.nextLine();
					String[] data = line.split(" ");
					//System.out.println(data.length);
					//Grace, this code is excellent

					directory.add(new Student(data[0], data[1], data[2], data[3], data[4], data[5], data[6], data[7], 0.0, 1, 2, 3));
				}

		}
		public static void tester()
		{
			System.out.println(directory.get(0).getFirstName());
		}
}