import java.util.Scanner;
public class time
{
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int days = scan.nextInt();
	int seconds, minute, hours;
	seconds = days*24*60*60;
	minute  = days*24*60;
	hours = days*24;
	System.out.println(seconds + " second");
		System.out.println(minute + " minute");
			System.out.println(hours + " hours");
		
	}
}
