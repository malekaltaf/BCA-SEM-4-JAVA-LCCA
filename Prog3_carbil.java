import java.util.*;
class Prog3_carbil
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		boolean quit = false;
		double sum = 0.0;
		double salestax = 0.0 , amount;
		double seatcover = 6000 , str_wheel = 20000 , lights = 15000 , airpurifiers = 5000, others = 1000;
		double total_amount = 0.0 ;
		String name[] = new String [5];
		double amt[] = new double[5];
		int i = 0;
		String order = " ";
		do{
			System.out.println("ITEM PRICE");
			System.out.println("1. Seat Cover		6000");
			System.out.println("2. Steering Wheel 	20000");
			System.out.println("3. Car Lighting 	15000");
			System.out.println("4. Air Purifiers	5000");
			System.out.println("5. Other Items		1000");
			System.out.println("6. Quite");
			System.out.println("Enter Choice");
			int choice = input.nextInt();
			switch(choice)
			{
				case 1:
				System.out.println("Seat Cover"+"\n");
				salestax = seatcover*2/100;
				seatcover = seatcover+salestax;
				System.out.println("Bill for Seat Cover is"+seatcover);
				name[i] = "Seat Cover";
				amt[i] = seatcover;
				i++;
				break;
				case 2:
				System.out.println("Streeing Wheel"+"\n");
				salestax = str_wheel*3/100;
				str_wheel = str_wheel+salestax;
				System.out.println("Bill for Streeing Wheel is"+str_wheel);
				name[i] = "Streeing Wheel";
				amt[i] = str_wheel;
				i++;
				break;
				case 3:
				System.out.println("Car Lighting"+"\n");
				salestax = lights*15/100;
				lights = lights+salestax;
				System.out.println("Bill for Car Lighting is"+lights);
				name[i] = "Car Lighting";
				amt[i] = lights;
				i++;
				break;
				case 4:
				System.out.println("Air Purifiers"+"\n");
				salestax = airpurifiers*2/100;
				airpurifiers = airpurifiers+salestax;
				System.out.println("Bill for Air Purifiers is"+airpurifiers);
				name[i] = "Air Purifiers";
				amt[i] = airpurifiers;
				i++;
				break;
				case 5:
				System.out.println("Other Items"+"\n");
				salestax = others*2/100;
				others = others+salestax;
				System.out.println("Bill for Other Items is"+others);
				name[i] = "Other Items";
				amt[i] = others;
				i++;
				break;
				case 6:
				quit = true;
				break;
				default:
				System.out.println("Wrong Choice/Input!");
			}
			}while(!quit);
		System.out.println("____________________________________");
		System.out.println("		CAR BILL	  ");
		System.out.println("____________________________________");
		System.out.println("Name 			Amount");
		for(int j=0; j<name.length;j++)
		{
			System.out.println(name[j]+"\t\t\t"+amt[j]);
			total_amount = total_amount + amt[j];
		}
		System.out.println("____________________________________");
		System.out.println("Total Amount = \t\t\t"+total_amount);
		System.out.println("____________________________________");
	}
}