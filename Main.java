import java.util.Scanner;

public class Main{
public static void main (String[]args){
Scanner scanner = new Scanner(System.in);
System.out.print("name?");
String name ="";
name= scanner.nextLine();
System.out.println("hello, "+ name);
scanner.close();



}
}