import java.util.Scanner;

public class Alphabet {

	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
System.out.println("enter a letter");
char alpha = scan.next();

switch(alpha) {
case 'a' : 
	System.out.println("it is a vowel");
break;
case 'e' : 
	System.out.println("it is a vowel");
break;
case 'i' : 
	System.out.println("it is a vowel");
break;
case 'o' : 
	System.out.println("it is a vowel");
break;
case 'u' : 
	System.out.println("it is a vowel");
break;
default:System.out.println("it is consonant");
}
	}

}
