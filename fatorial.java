# fatorial 
import java.util.Scanner;
public class fatorial {
	
	static int Fatorial(int N) {
		if (N>0) {
			return N * Fatorial(N-1);
		} else
			return 1;
	}
	
	public static BigInteger bigfat(int num){ // modo nao-recursivo onde serve para num > 20
		BigInteger r = BigInteger.valueOf(1);
		
		while (num > 1) {
			r = r.multiply(BigInteger.valueOf(num));
			num--;
		}
		
		return r;
	}
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("entre com o numero");
		int N = scn.nextInt();

		int res = Fatorial(N);
		System.out.println(res);
	}
}
