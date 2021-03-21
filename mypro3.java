//java program
import java.util.Scanner;
class mypro3
{
	public static void main(String args[])
	{
	int a,b,c;
	Scanner in = new Scanner(System.in);
		System.out.println("Enter First Digit: ");
	a= in.nextInt();
	System.out.println("Enter Second Digit: ");
	b = in.nextInt();
	c=a+b;
	System.out.println("Sum of First & Second Number is "+c);
	}
}