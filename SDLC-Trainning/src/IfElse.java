import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		/*
		 * System.out.println("enter costprice"); int cp = input.nextInt();
		 * System.out.println("enter sellingprice"); int sp = input.nextInt(); int
		 * profit = sp-cp; //System.out.println("print profit"); if(cp>sp) {
		 * System.out.println("it is loss"); } else {
		 * System.out.println("it is profit"); } System.out.println( profit); }
		 */
		System.out.println("enter costprice");
		int cp = input.nextInt();
		System.out.println("enter sellingprice");
		int sp = input.nextInt();

		float gst = 0.18f;
		float profit = sp + gst;
		float np = sp + 0.18f;

		if (cp > np) {
			System.out.println("it is loss");
		} else {
			System.out.println("it is profit");
		}
		System.out.println(profit);
	}

}
