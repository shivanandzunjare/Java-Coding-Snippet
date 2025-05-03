
package pkg1;
import java.util.Scanner;

public class NestedIfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int marksObtained, passingMarks =40;
		char grade ;
		
		Scanner in = new Scanner(System.in);
		System.out.println(" input marks obtained by you ");
		marksObtained = in.nextInt();
		
		if (marksObtained >= passingMarks) {
			if ( marksObtained > 90 )
				grade = 'A';
			else if (marksObtained > 75) 
				grade = 'B';
			else 
				grade = 'c';
			
			System.out.println(" u passed the exam & your grade is " + grade );
				
		}
		else {
			grade = 'F';
			
			System.out.println(" u r fail to pass exam");
		}
	}

}
