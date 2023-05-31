import java.util.Scanner;

public class TwentySixMay {
 
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int amt_meena = 500;
		System.out.println("enter cost of each");
int cost_tshirt = scan.nextInt();
int cost_pen = scan.nextInt();
int cost_choc = scan.nextInt();

int total = cost_tshirt+cost_pen +cost_choc;
System.out.println("the total cost is"+" " + total);

int balence = 500-total;
if(balence>200) {
	System.out.println("purchase more");
}else if(balence>=100 && balence<200){
	System.out.println("quadbary");
}else if(balence==200){
	System.out.println("bangles");
}else if(balence>=50){
	System.out.println("auto");
}
	}

}
