import java.util.Scanner;

public class CountTotalNumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("enter the Amount");

		int amt = input.nextInt();

		int note_500, note_100, note_50, note_20, note_10, n5, n2, n1;

		note_500 = note_100 = note_50 = note_20 = note_10 = n5 = n2 = n1 = 0;

		if (amt >= 500)
			note_500 = amt / 500;
		amt -= note_500 * 500;
		if (amt >= 100)
			note_100 = amt / 100;
		amt -= note_100 * 100;
		if (amt >= 50)
			note_50 = amt / 50;
		amt -= note_20 * 20;
		if (amt >= 10)
			note_10 = amt / 10;
		amt -= note_10 * 10;
		if (amt >= 5)
			n5 = amt / 5;
		amt -= n5 * 5;
		if (amt >= 2)
			n2 = amt / 2;
		amt -= n2 * 2;
		if (amt >= 1)
			n2 = amt / 1;
		amt -= n1 * 1;

		System.out.println("Total no of notes");

		System.out.println("500 = " + note_500);
		System.out.println("100 = " + note_100);
		System.out.println("50 = " + note_50);
		System.out.println("20 = " + note_20);
		System.out.println("10 = " + note_10);
		System.out.println("5 = " + n5);
		System.out.println("2 = " + n2);
		System.out.println("1 = " + n1);

	}

}
