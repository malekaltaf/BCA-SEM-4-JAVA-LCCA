import java.util.*;
class Prog2_EMI
{
     public static void main(String args[])
     {
          Scanner a = new Scanner (System.in);
          double principal , rate , time;
          principal = Double.parseDouble (args[0]);
          System.out.print("Enter Rate : ");
          rate = a.nextFloat();
          time = 5;
          double emi = (principal*rate*Math.pow(1+rate,time))/(Math.pow(1+rate,time)-1);
          System.out.print(" EMI in RS. is = "+emi+"\n");
     }
}