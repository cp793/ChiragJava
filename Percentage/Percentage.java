import java.util.Scanner;
public class Percentage {

    public static void main(String[] args) {

       float u, t,Ans;
        Scanner s = new Scanner(System.in);

        System.out.print("Enter your value: ");
        u = s.nextFloat();
        System.out.print("Enter your Total: ");
        t = s.nextFloat();
      Ans =(u/t)*100;
        System.out.println("Percentage= "+Ans);
    }

}