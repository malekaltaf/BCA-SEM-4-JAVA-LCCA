///	prog8 myresult	///
import java.util.*;
interface exam
{
	boolean pass (int mark);
}
interface classify
{
	String division(int avg);
}
class Result implements exam,classify
{
	public boolean pass (int mark)
	{
		if(mark>=35)
			return true;
		else
			return false;
	}
	public String division(int avg)
	{
		if(avg>=60)
			return "First";
		else if(avg>=50)
			return "Second";
		else if(avg>=35)
			return "Pass";
		else
			return "Fail >> NOW GOTO JAIL ;)";
	}
}
public class unit2_prog8 //result display
{
	public static void main(String args[])
	{
		boolean pass;
		int mark,avg;
		String division;
		Result res = new Result();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter The Marks: ");
		mark = s.nextInt();
		System.out.println("Enter The Average: ");
		avg=s.nextInt();
		pass=res.pass(mark);
		division = res.division(avg);
		if(pass)
			System.out.println("Passed -- "+division+".");
		else
			System.out.println("Failed -- "+division+".");	
	}
	
}