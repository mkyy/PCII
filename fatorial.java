# fatorial 
import java.util.Scanner;
public class fatorial {
	
	static int Fatorial(int N) {
		if (N>1) {
			return N * Fatorial(N-1);
		} else
			return 1;
	}
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("entre com o numero");
		int N = scn.nextInt();

		int res = Fatorial(N);
		System.out.println(res);
	}
}
