import java.util.Scanner;
public class Pgm16 {
    public static void main(String args[]){
        int a[]=new int[5];
        int max,i;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter elements of the array:");
        for(i=0;i<5;i++)
        {
            a[i]=sc.nextInt();
        }
        max=a[0];
        for(i =1;i<5;i++)
        {
            if(a[i]>max)
            {
                max=a[i];
            }
        }
        System.out.println("Maximum element is: "+max);
        sc.close();
    }
}
