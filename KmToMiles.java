import java.util.*;
public class KmToMiles {
public static void main (String[] args) {
Scanner sc=new Scanner(System.in);
double Distance_in_KM = sc.nextDouble();
double Distance_in_Miles = Distance_in_KM*0.621371;
System.out.println("The Kilometers Distance in Miles is: " + Distance_in_Miles);
}
}