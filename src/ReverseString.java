import java.util.Scanner;

public class ReverseString {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String name= sc.nextLine();
        int l = name.length();
        String rev= "";
        for(int i=(l-1);i>=0;i--){
            rev=rev + name.charAt(i);
        }
        System.out.println("The reverse of " +name+ " is "+rev);
    }
}
