import java.util.Scanner;
public class IT24100170Lab4Q2{
	public static void main(String[]args){
	int examMarks;
	int labMarks;
	int examPercentage;
	int labPercentage;
	int finalMark;

	Scanner abc = new Scanner(System.in);

	System.out.print("Please enter exam marks(out of 100): ");
	examMarks = abc.nextInt();
	if(examMarks>=0 && examMarks<=100){
		System.out.print("Please enter lab submission marks(out of 100): ");
		labMarks = abc.nextInt();
		if(labMarks>=0 && labMarks<=100){
			System.out.print("Please enter the percentage given for the exam: ");		
			examPercentage = abc.nextInt();
			if(examPercentage>=0 && examPercentage<=100){
				System.out.print("Please enter the percentage given for the lab submission: ");
				labPercentage = abc.nextInt();
				if((examMarks+labMarks)==100){
					finalMark = (examMarks*examPercentage/100)+(labMarks*labPercentage/100);
				System.out.print("Final exam marks: "+finalMark);
				}
				else{
					System.out.print("The percentage must add up to 100.Terminating program");
				}
			}
			else{
				System.out.print("Invalid input for the percentage given for the exam. Terminating program.");
			}		
		}
		else{
			System.out.print("Invalid input for lab marks.Terminating program");
		}
	}
	else{
		System.out.print("Invalid input for exam marks.Terminating program");
	}
	}
}