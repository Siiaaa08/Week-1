// importing the Scanner class for taking the input form the user 
import java.util.*;
// Creating VoteEligibilityArr class for determining the eligibility to vote for each student 
public class StudentsVote{
	public static void main(String [] args){
		
		// creating the input object for using scanner class 
		Scanner sc = new Scanner(System.in);
		
		// initializing the array of age size 10 
		int studentsAge [] = new int[10];
		
		//Take user input for the ages of 10 students
		for(int i=0;i<studentsAge.length;i++){
			System.out.println("Enter the age of student");
			studentsAge[i] = sc.nextInt();
		}
		for(int i=0;i<studentsAge.length;i++){
			//Checking Eligibility of the student according to age 
			if(studentsAge[i]<0){
				System.out.println("Invalid age");
			}
			else{
				if(studentsAge[i]>=18){
					System.out.println("The student can vote");
				}
				else{
					System.out.println("The student cannot vote");
				}
			}
		}
	}
}
				
		
