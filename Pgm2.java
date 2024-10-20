import java.util.Scanner;
public class Pgm2{
    public static void main(String args[]){
        int num,i,d;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        num=sc.nextInt();
        System.out.println("Tables in forward order is");
        for (i=1;i<=10;i++)
        {
            System.out.println(num+"X"+i+"="+i*num);
        }
        System.out.println("\n");
        System.out.println("Tables in reverse order is");
        for (i=10;i>=1;i--)
        {
            System.out.println(num+"X"+i+"="+i*num);
        }
        
    }
}
