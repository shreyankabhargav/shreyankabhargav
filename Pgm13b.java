import java.util.Scanner;
public class Pgm13b{
public static void main(String[] args){
    System.out.println("Enter the String");
    Scanner sc=new Scanner(System.in);
    String str=sc.nextLine();
    String reversedStr="";
    for (int i=str.length()-1;i>=0;i--)
    {
        reversedStr=reversedStr+str.charAt(i);
    }
    System.out.println("Original string is: "+ str);
    System.out.println("Reversed string is: "+ reversedStr);
    sc.close();
}
}