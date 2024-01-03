import java.util.Scanner;
import javax.swing.JFrame;

public class Main{
public static void main (String[]args){
Scanner scanner = new Scanner(System.in);
System.out.print("name?");
String name ="";
name= scanner.nextLine();
System.out.println("hello, "+ name);
scanner.close();

JFrame frame = new JFrame();
frame.setTitle("jpractice");
frame.setVisible(true);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setResizable(false);
frame.setSize(450, 450);





}
}