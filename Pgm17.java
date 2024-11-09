import java.util.Scanner;

public class Pgm17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[5];
        System.out.println("array elements in normal order is");
        for(int i = 0; i < 5; i++) 
        {
            a[i] = sc.nextInt();
        }
        System.out.println("array elements in reversed order is");
        for(int i = 4; i >= 0; i--) 
        {
            System.out.println(a[i]);
        }
        sc.close();
    }
}