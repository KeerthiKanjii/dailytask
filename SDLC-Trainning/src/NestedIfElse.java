import java.util.Scanner;

public class NestedIfElse {

	public static void main(String[] args) {
Scanner input = new Scanner (System.in);
System.out.println("enter marks of 5 subs");
int m1 = input.nextInt();
int m2 = input.nextInt();
int m3 = input.nextInt();
int m4 = input.nextInt();
int m5 = input.nextInt();

int total = m1+m2+m3+m4+m5;

float sub = total/5;

System.out.println("total marks" +" "+total);
System.out.println("total percentage is "+" "+sub);

if(sub<=100) {
	if(sub>= 90) {
		System.out.println("grade A+");
	}
	
	if(sub>= 80) {
		System.out.println("grade A");
	}
	
	
	if(sub>= 70) {
		System.out.println("grade B+");
	}
	
	if(sub>= 60) {
		System.out.println("grade B");
	}
	
	if(sub>= 50) {
		System.out.println("grade C");
	}
}
else {
	System.out.println("result invalid , please enter valid grade till 100 ");
}
	}

}
