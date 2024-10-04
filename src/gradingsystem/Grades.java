package gradingsystem;
import java.util.Scanner;
public class Grades {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		
		System.out.print("Enter the number of students:");
		int numberOfStudents=scanner.nextInt();
		
		for(int i=1; i<=numberOfStudents; i++) {
			System.out.print("Enter the score for student"+ i +":");
			int score= scanner.nextInt();
			char grade;
	
		
		//Determine the grade based on the score 
		if(score>=90) {
			grade='A';
			
		}else if(score>=80) {
			grade='B';
		}else if(score>=70) {
			grade='C';
		}else if(score>=60) {
			grade='D';
		}else {
			grade='F';
		}
		
		//Output the grade
		System.out.println("The student's grade is:"+grade);
		
		//Close the scanner
		scanner.close();

	}
	}
}


