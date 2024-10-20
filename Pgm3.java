import java.util.Scanner;
public class Pgm3 {
    public static void main(String args[]){
        int a,b,x,y,temp,gcd,lcm;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter two numbers");
        x=sc.nextInt();
        y=sc.nextInt();
        a=x;
        b=y;

        while (b!=0)
        {
            temp=b;
            b=a%b;
            a=temp;
        }
        gcd=a;
        System.out.println("gcd of two numbers is "+ gcd);
        lcm=(x*y)/gcd;
        System.out.println("lcm of two numbers is "+ lcm);
    }
}
