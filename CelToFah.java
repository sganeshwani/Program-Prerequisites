import java.util.*;
public class CelToFah {
public static void main (String[] args) {
Scanner sc = new Scanner(System.in);
double Celsius = sc.nextInt();
double Fahrenheit = Celsius*9/5+32;
System.out.println("the temperature in fahrenheit will be: "+Fahrenheit);
}
}