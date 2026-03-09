import java.util.Scanner;
import java.util.ArrayList;
public class ChangeVariables

	{
		static int studentGradeChange;
		static int firstGrade;
		static int secondGrade;
		static int thirdGrade;
		static int studentClassChange;
		static int firstClass;
		static int secondClass;
		static String changeGrade;
		static String initialClass;
		static String newClass;
		static String initialClassGrade;
		static String newClassGrade;
		static int gradeToChange;
		
	// This class is used to change student grades and schedules
	// changeClass() now functions properly
		static Scanner userInput = new Scanner(System.in);
		static Scanner userIntInput = new Scanner(System.in);
		static Scanner userStringInput = new Scanner(System.in);
			{
				changeVariable();
			}
			public static void changeVariable()
				{
					//new variable of grade
					String newgrade;
	               
					
					 
						 {
							 System.out.println("Who's Grade do you wish to change?:");
							 for (int i = 0; i < TextFile.directory.size(); i++)
									{
										System.out.println(i+1 + ") " +TextFile.directory.get(i).getFirstName() + " " + TextFile.directory.get(i).getLastName() + ":");
										System.out.println("Period 1: " + TextFile.directory.get(i).getFirstPeriod() + ": " + TextFile.directory.get(studentGradeChange).getFirstGrade());
										System.out.println("Period 2: " + TextFile.directory.get(i).getSecondPeriod()+ ": " + TextFile.directory.get(studentGradeChange).getSecondGrade());
										System.out.println("Period 3: " + TextFile.directory.get(i).getThirdPeriod()+ ": " + TextFile.directory.get(studentGradeChange).getThirdGrade());
										System.out.println(" ");
									}
							 System.out.println("Enter the number of the student whose grade you wish to change.");
							 studentGradeChange = (userIntInput.nextInt()) - 1;
							 System.out.println("You have selected " + TextFile.directory.get(studentGradeChange).getFirstName() + " " + TextFile.directory.get(studentGradeChange).getLastName());
								System.out.println("Their Grades are:");
								System.out.println("Period 1 Grade: " + TextFile.directory.get(studentGradeChange).getFirstPeriod() + ": " + TextFile.directory.get(studentGradeChange).getFirstGrade());
								System.out.println("Period 2 Grade: " + TextFile.directory.get(studentGradeChange).getSecondPeriod() + ": " + TextFile.directory.get(studentGradeChange).getSecondGrade());
								System.out.println("Period 3 Grade: " + TextFile.directory.get(studentGradeChange).getThirdPeriod() + ": " + TextFile.directory.get(studentGradeChange).getThirdGrade());
						
							
								System.out.println("Please enter the period number of the class you wish to change.");
								firstClass = userIntInput.nextInt();
								if (firstClass == 1)
								{
								initialClass = TextFile.directory.get(studentGradeChange).getFirstPeriod();
								initialClassGrade = TextFile.directory.get(studentGradeChange).getFirstGrade();
								}
								else if (firstClass == 2)
								{
								initialClass = TextFile.directory.get(studentGradeChange).getSecondPeriod();
								initialClassGrade = TextFile.directory.get(studentGradeChange).getSecondGrade();
								}
								else if (firstClass == 3) 
								{
								initialClass = TextFile.directory.get(studentGradeChange).getThirdPeriod();
								initialClassGrade = TextFile.directory.get(studentGradeChange).getThirdGrade();
								}
								System.out.println("Please select a new letter grade for the period you have selected");
								changeGrade = userStringInput.nextLine();
								//TextFile.directory.get(studentGradeChange).setFirstGrade(changeGrade);
								
								if(gradeToChange == 1 )
									{
										TextFile.directory.get(studentGradeChange).setFirstGrade(changeGrade);
									}
								else if(gradeToChange == 2)
									{
										TextFile.directory.get(studentGradeChange).setSecondGrade(changeGrade);
									}		
								else if(gradeToChange == 3)
									{
										TextFile.directory.get(studentGradeChange).setThirdGrade(changeGrade);
									}
								System.out.println("The Grade for " + TextFile.directory.get(studentGradeChange).getFirstName() + " " + TextFile.directory.get(studentGradeChange).getLastName() + " is now:");
								System.out.println("Period 1: " + TextFile.directory.get(studentGradeChange).getFirstPeriod() + ": " + TextFile.directory.get(studentGradeChange).getFirstGrade());
								System.out.println("Period 2: " + TextFile.directory.get(studentGradeChange).getSecondPeriod() + ": " + TextFile.directory.get(studentGradeChange).getSecondGrade());
								System.out.println("Period 3: " + TextFile.directory.get(studentGradeChange).getThirdPeriod() + ": " + TextFile.directory.get(studentGradeChange).getThirdGrade());
								
								// person put in student, then puts in class 
								//
								// when asked for new grade changeGrade = (userStringInput.nextLine)
								//  for example, if person desires to change first period gradr, use command TextFiledirectory.get(studentGradeChange).setFirstGrade(changeGrade) 
								// if (gradeToChange == 1)
									//{
										//TextFiledirectory.get(studentGradeChange).setFirstGrade(changeGrade) 
									//}
								// if (gradeToChange = 2)
								//	{
								//TextFiledirectory.get(studentGradeChange).setSecondGrade(changeGrade) 
								//	}
							 
						 }
					
					
					
						
					
					//double newGrade= userInput.nextDouble()
					//TextFile.directory.setGrade(newGrade);
					
					
					
				}
			
			public static void changeClass()
			{
				System.out.println("Change a student's class:");
				System.out.println(" ");
				for (int i = 0; i < TextFile.directory.size(); i++)
				{
					System.out.println(i+1 + ") " +TextFile.directory.get(i).getFirstName() + " " + TextFile.directory.get(i).getLastName() + ":");
					System.out.println("Period 1: " + TextFile.directory.get(i).getFirstPeriod());
					System.out.println("Period 2: " + TextFile.directory.get(i).getSecondPeriod());
					System.out.println("Period 3: " + TextFile.directory.get(i).getThirdPeriod());
					System.out.println(" ");
				}
				
				System.out.println("Enter the number of the student whose schedule you would like to change.");
				studentClassChange = (userIntInput.nextInt()) -1;
				System.out.println("You have selected " + TextFile.directory.get(studentClassChange).getFirstName() + " " + TextFile.directory.get(studentClassChange).getLastName());
				System.out.println("Their schedule is:");
				System.out.println("Period 1: " + TextFile.directory.get(studentClassChange).getFirstPeriod() + ": " + TextFile.directory.get(studentClassChange).getFirstGrade());
				System.out.println("Period 2: " + TextFile.directory.get(studentClassChange).getSecondPeriod() + ": " + TextFile.directory.get(studentClassChange).getSecondGrade());
				System.out.println("Period 3: " + TextFile.directory.get(studentClassChange).getThirdPeriod() + ": " + TextFile.directory.get(studentClassChange).getThirdGrade());
				
				System.out.println("Please enter the period number of the class you wish to change.");
				firstClass = userIntInput.nextInt();
				if (firstClass == 1)
				{
				initialClass = TextFile.directory.get(studentClassChange).getFirstPeriod();
				initialClassGrade = TextFile.directory.get(studentClassChange).getFirstGrade();
				}
				else if (firstClass == 2)
				{
				initialClass = TextFile.directory.get(studentClassChange).getSecondPeriod();
				initialClassGrade = TextFile.directory.get(studentClassChange).getSecondGrade();
				}
				else if (firstClass == 3) 
				{
				initialClass = TextFile.directory.get(studentClassChange).getThirdPeriod();
				initialClassGrade = TextFile.directory.get(studentClassChange).getThirdGrade();
				}
				
				System.out.println("Please enter the period number of the class you wish to switch with the first class you selected.");
				secondClass = userIntInput.nextInt();
				if (secondClass == 1 && firstClass == 2)
				{
				newClass = TextFile.directory.get(studentClassChange).getFirstPeriod();
				TextFile.directory.get(studentClassChange).setSecondPeriod(newClass);
				newClassGrade = TextFile.directory.get(studentClassChange).getFirstGrade();
				TextFile.directory.get(studentClassChange).setSecondGrade(newClassGrade);
				
				TextFile.directory.get(studentClassChange).setFirstPeriod(initialClass);
				TextFile.directory.get(studentClassChange).setFirstGrade(initialClassGrade);
				}
				else if (secondClass == 1 && firstClass == 3)
				{
				newClass = TextFile.directory.get(studentClassChange).getFirstPeriod();
				TextFile.directory.get(studentClassChange).setThirdPeriod(newClass);
				newClassGrade = TextFile.directory.get(studentClassChange).getFirstGrade();
				TextFile.directory.get(studentClassChange).setThirdGrade(newClassGrade);
				
				TextFile.directory.get(studentClassChange).setFirstPeriod(initialClass);
				TextFile.directory.get(studentClassChange).setFirstGrade(initialClassGrade);
				}
				else if (secondClass == 2 && firstClass == 1)
				{
				newClass = TextFile.directory.get(studentClassChange).getSecondPeriod();
				TextFile.directory.get(studentClassChange).setFirstPeriod(newClass);
				newClassGrade = TextFile.directory.get(studentClassChange).getSecondGrade();
				TextFile.directory.get(studentClassChange).setFirstGrade(newClassGrade);
				
				TextFile.directory.get(studentClassChange).setSecondPeriod(initialClass);
				TextFile.directory.get(studentClassChange).setSecondGrade(initialClassGrade);
				}
				else if (secondClass == 2 && firstClass == 3 )
				{
				newClass = TextFile.directory.get(studentClassChange).getSecondPeriod();
				TextFile.directory.get(studentClassChange).setThirdPeriod(newClass);
				newClassGrade = TextFile.directory.get(studentClassChange).getSecondGrade();
				TextFile.directory.get(studentClassChange).setThirdGrade(newClassGrade);
				
				TextFile.directory.get(studentClassChange).setSecondPeriod(initialClass);
				TextFile.directory.get(studentClassChange).setSecondGrade(initialClassGrade);
				}
				else if (secondClass == 3 && firstClass == 1) 
				{
				newClass = TextFile.directory.get(studentClassChange).getThirdPeriod();
				TextFile.directory.get(studentClassChange).setFirstPeriod(newClass);
				newClassGrade = TextFile.directory.get(studentClassChange).getThirdGrade();
				TextFile.directory.get(studentClassChange).setFirstGrade(newClassGrade);
				
				TextFile.directory.get(studentClassChange).setThirdPeriod(initialClass);
				TextFile.directory.get(studentClassChange).setThirdGrade(initialClassGrade);
				}
				else if (secondClass == 3 && firstClass == 2)
				{
				newClass = TextFile.directory.get(studentClassChange).getThirdPeriod();
				TextFile.directory.get(studentClassChange).setSecondPeriod(newClass);
				newClassGrade = TextFile.directory.get(studentClassChange).getThirdGrade();
				TextFile.directory.get(studentClassChange).setSecondGrade(newClassGrade);
				
				TextFile.directory.get(studentClassChange).setThirdPeriod(initialClass);
				TextFile.directory.get(studentClassChange).setThirdGrade(initialClassGrade);
				}
				
				System.out.println("The schedule for " + TextFile.directory.get(studentClassChange).getFirstName() + " " + TextFile.directory.get(studentClassChange).getLastName() + " is now:");
				System.out.println("Period 1: " + TextFile.directory.get(studentClassChange).getFirstPeriod() + ": " + TextFile.directory.get(studentClassChange).getFirstGrade());
				System.out.println("Period 2: " + TextFile.directory.get(studentClassChange).getSecondPeriod() + ": " + TextFile.directory.get(studentClassChange).getSecondGrade());
				System.out.println("Period 3: " + TextFile.directory.get(studentClassChange).getThirdPeriod() + ": " + TextFile.directory.get(studentClassChange).getThirdGrade());
			}
		
	}
