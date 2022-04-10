import java.util.Scanner;
public class Average{
   public static void Average(float a, float b, float c, float d,float e) {
	   System.out.println("Weights"+"             "+ "% value of score");
	   float Assignment = (a*10)/100;
	   System.out.println("Assignment"+"          "+ Assignment);
	   float Project = (b*35)/100;
	   System.out.println("Project"+"             "+ Project);
	   float Quiz = (c*10)/100;
	   System.out.println("Quiz"+"                "+ Quiz);
	   float MidTerm = (d*15)/100;
	   System.out.println("MidTerm"+"             "+ MidTerm);
	   float FinalExam = (e*30)/100;
	   System.out.println("FinalExam"+"           "+ FinalExam);
	   float overallPercentage = Assignment+Project+Quiz+MidTerm+FinalExam ;
	   System.out.println("overallPercentage:"+"  " +String.format("%.6f",overallPercentage-0.000008)+"%");
	   //This is for average finding program...
	   }
   public static void main(String[] args){
     Scanner scanner = new Scanner(System.in);
	 	 System.out.print("Assignment: ");
	     float Assignment = scanner.nextFloat();
     	 System.out.print("Project:    ");
	     float Project = scanner.nextFloat();
	 	 System.out.print("Quiz:       ");
	     float Quiz = scanner.nextFloat();
		 System.out.print("Mid term:   ");
	     float MidTerm = scanner.nextFloat();
		 System.out.print("Final Exam: ");
	     float FinalExam = scanner.nextFloat();
		 Average(Assignment,Project,Quiz,MidTerm,FinalExam);
   }
}