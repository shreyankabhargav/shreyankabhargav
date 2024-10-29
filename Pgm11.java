import java.util.Scanner;
public class Pgm11
{
  public static void main(String[] args)
  {
    System.out.println("Enter currency in rupees");
    Scanner sc=new Scanner(System.in);
    int rup=sc.nextInt();
    System.out.println(convertusd(rup));
  }
    public static String convertusd(int rup)
    {
      double usd;
      usd=(rup*0.012);
      return(+rup+" rupees is equal to " +usd+" dollars");
    }
}
