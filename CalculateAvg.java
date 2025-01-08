import java.util.*;
public class CalculateAvg {
public static void main (String[] args) {
Scanner sc=new Scanner(System.in);
double first_no = sc.nextDouble();
double Second_no = sc.nextDouble();
double Third_no = sc.nextDouble();
double Average = (first_no+Second_no+Third_no)/3;
System.out.println("Average of three numbers is: " + Average);
}
}