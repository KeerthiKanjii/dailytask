import java.util.Scanner;

public class SwitchMonths {

	public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.println("enter the month");
int month = input.nextInt();
switch(month) {
case 1:System.out.println("january");
break;
case 2:System.out.println("feb");
break;
case 3:System.out.println("march");
break;
case 4:System.out.println("april");
break;
case 5:System.out.println("may");
break;
case 6:System.out.println("june");
break;
case 7:System.out.println("juliy");
break;
case 8:System.out.println("agust");
break;
case 9:System.out.println("sept");
break;
case 10:System.out.println("ocut");
break;
case 11:System.out.println("nov");
break;
case 12:System.out.println("dec");
break;
default:System.out.println("invalid");
break;


}
	}

}
