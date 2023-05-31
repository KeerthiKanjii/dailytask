import java.util.Scanner;

public class SwitchYear {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter the month");
		String month = input.nextLine();
		switch(month) {
		case "jan":System.out.println("1");
		break;
		case "feb":System.out.println("2");
		break;
		case "march":System.out.println("3");
		break;
		case "april":System.out.println("4");
		break;
		case "may":System.out.println("5");
		break;
		case "june":System.out.println("6");
		break;
		case "juliy":System.out.println("7");
		break;
		case "agust":System.out.println("8");
		break;
		case "sept":System.out.println("9");
		break;
		case "ocut":System.out.println("10");
		break;
		case "nov":System.out.println("11");
		break;
		case "dec":System.out.println("12");
		break;
		default:System.out.println("invalid");
		break;


		}
			
		}

	}


