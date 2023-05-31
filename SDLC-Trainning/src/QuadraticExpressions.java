import java.util.Scanner;

public class QuadraticExpressions {

	public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.println("enter the values");
int a = input.nextInt();
int b = input.nextInt();
int c = input.nextInt();
System.out.println("Enter the choice");
int choice = input.nextInt();

if (choice == 1) {
    double x1 = (b-(b+Math.sqrt(b*b-4*a*c))/2*a);
    System.out.println(x1);
}
    else if(choice == 1) {
    	double x2 = (b+(b+Math.sqrt(b*b-4*a*c))/2*a);
    System.out.println(x2);
    }
    else {
    	System.out.println("invalid number");
    }

}
}