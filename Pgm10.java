import java.util.Scanner;
public class Pgm10 {
    public static void main(String args[]){
        int ch;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        System.out.println("CHOICES ARE\n");
        System.out.println("1.checkpalindrome");
        System.out.println("2.checkArmstrong");
        System.out.println("3.checkAutomorphic");
        ch=sc.nextInt();
        switch(ch)
        {
            case 1:
            
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
                    System.out.println("Entered number is a palindrome");
                else
                    System.out.println("Entered number is not a palindrome");    
                }
            
            break;
            case 2:
            
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
                System.out.println ("Entered number is an armstrong number");
                else
                System.out.println ("Entered number is not an armstrong number");
            
                break;
            case 3:
               
                int square = num * num;   
                while (num > 0)   
                 {   
                    if (num % 10 != square % 10)   
                    System.out.println("Entered number isn't an automorphic number");   
                    num = num/10;   
                    square = square/10;   
                 }   
                    System.out.println("Entered number is an automorphic number");   
                 break;
                 default:
                 {
                    System.out.println("invalid choice");
                 }
                }
            }
        }

