import java.util.Scanner;
public class Add {

    public static void main(String[] args)
    {
        int a,b,c;
        Scanner s1= new Scanner(System.in);

        System.out.print("Enter first number:");
       a = s1.nextInt();
        System.out.print("Enter second number:");
       b = s1.nextInt();
       c=a+b;
        System.out.println(""+c);
    }

}
