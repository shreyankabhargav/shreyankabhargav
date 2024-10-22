import java.util.Scanner;
public class Pgm5 {
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        System.out.println("Sum of "+ n + " natural numbers is" +function(n));
    }
    public static int function(int n){
        return n*(n+1)/2;
    }
    
}
