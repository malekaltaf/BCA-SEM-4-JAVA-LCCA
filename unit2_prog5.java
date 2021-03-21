//unit 2 prog 5
interface numbers
{
	public int process(int x,int y);
}
class sum1 implements numbers
{
	public int process(int a,int b)
	{
		return(a+b);
	}
}
class average1 implements numbers
{
	public int process(int a,int b)
	{
		return((a+b)/2);
	}
}
public class unit2_prog5//interface
{
	public static void main(String []args)
	{
		int n1=8,n2=10;
		int result;
		sum1 s = new sum1();
		result = s.process(n1,n2);
		System.out.println("Sum of two numbers "+n1+" and "+n2+" is "+result);
	}
}