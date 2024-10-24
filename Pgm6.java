import java.util.Scanner;
public class Pgm6 {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number to check if it is armstrong or not");
        n=sc.nextInt();	
        System.out.println(checkArmstrong(n));
    }
    static String checkArmstrong(int n)
    {
        int temp, flag=0,last=0,sum=0;
        temp=n;
        while(temp>0)
        {
            temp=temp/10;
            flag++;
        }
        temp=n;
        while(temp>0)
        {
            last=temp%10;
            sum+=(Math.pow(last,flag));
            temp=temp/10;
        }
        if(n==sum)
        return ("is an armstrong number");
        else
        return ("is not an armstrong number");
    }
}
