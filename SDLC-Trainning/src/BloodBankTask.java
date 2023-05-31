import java.util.Scanner;

public class BloodBankTask {
public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter blood donor's name: ");
		String name = scan.nextLine();
		System.out.println("Enter donor's age: ");
		int age = scan.nextInt();
		System.out.println("Enter donor's weight: ");
		float weight = scan.nextFloat();
		System.out.println("Enter donor's disease: ");
		boolean disesase = scan.nextBoolean();

		if (age >= 18 ) {
			if(weight>50) {
				System.out.println("the person is eligible to donate blood");
			
		}else {
			System.out.println("the person is not eligible to donate blood");
		}
}
else {
	System.out.println("age must be greater than 18");

}
if(disesase==true) {
	System.out.println("the person is eligible to donate blood");
}else {
	System.out.println("you hava diease");
}
}
}





