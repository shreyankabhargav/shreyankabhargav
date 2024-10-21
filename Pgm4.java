import java.util.Scanner;
public class Pgm4{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter marks ");
        int marks = scanner.nextInt();
        if (marks >= 0 && marks <= 100) 
        {
            String grade = method(marks);
            System.out.println("Marks= " + marks + " Grade= " + grade);
        } 
        else 
        {
            System.out.println("Invalid input");
        }
    }
        static String method(int marks) {
        if (marks >= 91 && marks <= 100) {
            return "AA";
        } else if (marks >= 81 && marks <= 90) {
            return "AB";
        } else if (marks >= 71 && marks <= 80) {
            return "BB";
        } else if (marks >= 61 && marks <= 70) {
            return "BC";
        } else if (marks >= 51 && marks <= 60) {
            return "CD";
        } else if (marks >= 41 && marks <= 50) {
            return "DD";
        } else {
            return "Fail";
        }
    }

   
}

