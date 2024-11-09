import java.util.Scanner;
public class Pgm14 {
    public static void main(String args[]){
        String n=new String();
        int i,vowel_num=0,con_num=0;
        String vowel="",consonant="";
        Scanner sc=new Scanner(System.in);
       
        System.out.println("Enter the string");
        n=sc.nextLine();
        n=n.toLowerCase();
        for (i=0;i<n.length();i++)
        {
            char c=n.charAt(i);
            if(c!=' ')
            {
                if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
                {   vowel+=c;
                    vowel_num++;
                }
                else
                {
                    consonant+=c;
                    con_num++;
                }
            }
            
        }
        System.out.println("vowels are="+vowel+"\nconsonants are="+consonant);
        System.out.println("number of vowels="+vowel_num+"\nnumber of consonants="+con_num);
        sc.close();
    }
}
 