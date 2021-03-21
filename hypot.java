class hypot 
{
	public static void main(String args[])
	{
		double x=3.0,y=4.0;
		System.out.println("X is "+x);
		System.out.println("Y is "+y);
		double num = (x*x)+(y*y);
		System.out.println("Sum of Square of X And Y is = "+num);
		double hypot = Math.sqrt(num);
		System.out.println("Hypoteuse of right angled triangle is = "+hypot);
	}
}