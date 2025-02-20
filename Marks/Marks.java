import java.util.Scanner;
public class Marks {

    public static void main(String[] args)
    {
        float m,sc,a,p,b,P;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter your Maths marks out of 80:");
        m = s.nextFloat();
        System.out.print("Enter your Science marks out of 80:");
        sc = s.nextFloat();
        System.out.print("Enter your Algebra marks out of 80:");
        a = s.nextFloat();
        System.out.print("Enter your Physics marks out of 80:");
        p = s.nextFloat();
        System.out.print("Enter your Biology marks out of 80:");
        b = s.nextFloat();
        P =( (m+sc+a+p+b)/400)*100;
        if(P>35) {
            System.out.println("You Scored " + P + "% Pass");
        }

else {
            System.out.println("You Scoured "+P+"% Fail");
        }
        }


}
