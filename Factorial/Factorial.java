import java.util.*;

public class Factorial {
	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
		int n, res = 1;

		System.out.print("Enter Number:");
		n = sc.nextInt();

		while (n > 0) {
			res = res * n;
			n--;
		}
		System.out.println(res);
		sc.close();
	}
}