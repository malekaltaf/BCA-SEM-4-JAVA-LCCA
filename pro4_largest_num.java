class pro4_largest_num
{
	public static void main(String args[])
	{
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		int c=Integer.parseInt(args[2]);
		if(a>c&&a>b)
		{
			System.out.println(a+ " Is Largest Number Amoung Us.");
		}
		else if(b>a&&b>c)
		{
			System.out.println(b+ " Is Largest Number Amoung Us.");
		}
		else
		{
			System.out.println(c+ " Is Largest Number Amoung Us.");
		}
	}
}