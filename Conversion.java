package Conversion;
import java.util.*;
import java.util.Scanner;

public class Conversion {

  public static void main(String[] args) {
   double minutesInyear=60*24*365;
   Scanner input=new Scanner(System.in);
   System.out.println("Inter the number of minutes:");
   double min=input.nextDouble();
   long year=(long)(min/minutesInyear);
   int days=(int)(min/60)%365;
   System.out.println((int)min+"minutes is approximately"+year+"year and"+days+"days");
  }
}
