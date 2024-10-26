import java.util.Scanner;
public class Pgm7{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        System.out.println(checkpalindrome(num));
    }
    public static String checkpalindrome(int num)
    {
        int sum=0,rem;
        int temp=num;
        while (num!=0)
        {
            rem=num%10;
            sum=(sum*10)+rem;
            num=num/10;
        }
        if (temp==sum)
            return("Entered number is a palindrome");
        else
            return("Entered number is not a palindrome");    
    }
}