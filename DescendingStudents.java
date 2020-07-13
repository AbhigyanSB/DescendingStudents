/* This program will take the data against some students
 * and display their names in the descending order. */

//Import the Scanner class from Java.
import java.util.Scanner;

public class DescendingStudents {
	// Main method
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 	//generating the scanner object to store the value provided by the user
		System.out.print("Please enter the number of students: "); 	//asking the user to enter the number of students
		int n=input.nextInt(); 	 	//storing the number of students in the variable "n"
		String[] students = new String[n];		//creating an array with the index equal to the number of students
		int[] scores = new int[students.length];		//creating another array to store the scores of the students


		System.out.println("Please enter the name and the score for each student,");		//asking the user to provide the names and the scores of each an every student
		for (int i = 0; i < students.length; i++) {		//loop to store the names of the student names and their scores
			System.out.print("Student " + (i + 1) + " Name: ");
			students[i] = input.next();
			System.out.print("Score obtained by " + students[i] + ": ");
			scores[i] = input.nextInt();
		}
		input.close();
		sortDecreasing(students, scores);		//calling the method to obtain the names of the students in the decreasing order
		
		//loop for displaying the names of the students in the decreasing order
		System.out.println("The students' names in the descending order is : ");
		for (String d: students) {		
			System.out.println(d);
		}
	}

	/* sorting a string for the students' names and an integer array for the students' scores in the decreasing order */
	public static void sortDecreasing(String[] strs, int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			int max = nums[i];
			int maxIndex = i;
			String temp;

			//finding the minimum in the list[i..nums.length - 1]
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[j] > max) {
					max = nums[j];
					maxIndex = j;
				}
			}
			
			if (maxIndex != i) {
				//swapping the string array to obtain the decreasing order of the students' names
				temp = strs[i];
				strs[i] = strs[maxIndex];
				strs[maxIndex] = temp;

				//swapping the int array to obtain the decreasing order of the students' scores
				nums[maxIndex] = nums[i];
				nums[i] = max;
			}
		}
	}
}