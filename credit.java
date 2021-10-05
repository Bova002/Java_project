import java.util.Scanner;
public class credit
{
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int amount = scan.nextInt();
	int  newsum;
	for(int i=1; i<=3; i++){
	    newsum = (amount * 10) / 100;
	    amount = amount - newsum;
	}
	System.out.println(amount);
	}
}