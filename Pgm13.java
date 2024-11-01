import java.util.Scanner;
public class Pgm13{
public static void main(String[] args) 
{
    System.out.println("Enter the String");
    Scanner sc=new Scanner(System.in);
    String str=sc.nextLine();
    StringBuffer s2= new StringBuffer(str);
    s2.reverse();
    System.out.println("Reversed string is\n"+s2);
    sc.close();
    }
}