import java.util.Scanner;
public class Pgm2{
    public static void main(String args[]){
        int num,i,d;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        num=sc.nextInt();
        for (i=1;i<=10;i++)
        {
            System.out.println(num+"X"+i+"="+i*num);
        }
    }
}