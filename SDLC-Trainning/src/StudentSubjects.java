import java.util.Scanner;

public class StudentSubjects {

	public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.println("Enter student year: ");
int year = input.nextInt();
System.out.println("Enter student marks: ");
int marks = input.nextInt();
if(year==1 ) {
	System.out.println("you are in:"+" "+ year);
	System.out.println("subjects are maths,science");
	
}
else if(year==2 ) {
	System.out.println("you are in:"+" "+ year);
	System.out.println("subjects are EC, TC,FC");
}else if(year==3) {
	System.out.println("you are in:"+" "+ year);
	System.out.println("subjects are GC,FC");
}else if(year==4 ) {
	System.out.println("you are in:"+" "+ year);
	System.out.println("subjects are DC,AC");
}
else {
	System.out.println("invalid year");
	
}
if(marks<=100 && marks>=90) {
	System.out.println("first class");
}else if(marks<=80 && marks>=70){
	System.out.println("second class");
	
}else if(marks<=60 && marks>=50) {
	System.out.println("third class");
}else {
	System.out.println("student is fail");
}
	}
}	
