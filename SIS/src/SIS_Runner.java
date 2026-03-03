import java.util.Scanner;
import java.io.IOException; 
public class SIS_Runner
	{
	
	static int selection;
	static int changeSelection;
	static Scanner masterInput = new Scanner(System.in);

		public static void main(String[] args)
			{
			//System.out.println(new java.io.File("StudentList.txt").getAbsolutePath());
			// Don't delete the following lines; they are necessary for us to use the textFile() method
				try 
				{
					TextFile.textFile();
				}
				catch (IOException exc)
				{
					System.out.println("An I/O error occurred: " + exc.getMessage());
				}
				
				System.out.println("Welcome to the Student Information System");
			
				
				System.out.println("What would you like to do?");
				System.out.println("1) add or delete a student");
				System.out.println("2) change student grades/schedule");
				System.out.println("3) sort students");
						
				
				selection = masterInput.nextInt();
				if (selection == 1)
				{
					AddingAndDeleting.addingAndDeleting();
				}
				else if (selection == 2)
				{
					System.out.println("Would you like to (1) Change a student's grade or (2) Change a student's schedule?");
					changeSelection = masterInput.nextInt();
					if (changeSelection == 1)
					{
						ChangeVariables.changeVariable();
					}
					else if (changeSelection == 2)
					{
						ChangeVariables.changeClass();
					}
					
				}
				else if (selection == 3)
				{
					
				}
				
			}

	}
