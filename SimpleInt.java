import java.util.*;
public class SimpleInt {
public static void main (String[] args) {
Scanner sc=new Scanner(System.in);
int Principal = sc.nextInt();
int Rate = sc.nextInt();
int Time = sc.nextInt();
System.out.println("the simple interest is: "+(Principal*Rate*Time/100));
}
}