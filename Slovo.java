import java.util.Scanner;
public class Slovo
{
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	String text = scan.nextLine();
	char[] arr = text.toCharArray();
	String t = "";
	for(int i = 0; i<arr.length;i++){
	    t = arr[i] + t;
	}
	System.out.println(t);
	}
}