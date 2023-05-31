import java.util.Scanner;

public class CheckAlphabet {

	public static void main(String[] args) {
Scanner input = new Scanner(System.in);

System.out.println("Enter the charcter");
char ch = input.next().charAt(0);
if(ch >='a'&& ch>='z'||ch>='A'||ch>='Z') {
	System.out.println("This is a alphabet");
}else {
	System.out.println("This is not an alphabet");
}
	}
	
}
																																																	