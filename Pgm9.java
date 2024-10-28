import java.util.Scanner;
public class Pgm9 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        System.out.println(checkpalindrome(num));
        System.out.println(checkArmstrong(num));
        System.out.println(checkAutomorphic(num));
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
    
    public static String checkArmstrong(int num)
    {
        int temp, flag=0,last=0,sum=0;
        temp=num;
        while(temp>0)
        {
            temp=temp/10;
            flag++;
        }
        temp=num;
        while(temp>0)
        {
            last=temp%10;
            sum+=(Math.pow(last,flag));
            temp=temp/10;
        }
        if(num==sum)
        return ("Entered number is an armstrong number");
        else
        return ("Entered number is not an armstrong number");
    }
    
    public static String checkAutomorphic(int num)   
    {   
    int square = num * num;   
    while (num > 0)   
     {   
        if (num % 10 != square % 10)   
        return ("Entered number isn't an automorphic number");   
        num = num/10;   
        square = square/10;   
     }   
         return ("Entered number is an automorphic number");   
   }   
}
    
