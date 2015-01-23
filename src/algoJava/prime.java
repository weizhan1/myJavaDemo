package algoJava;

public class prime {

	public prime() {
		// TODO Auto-generated constructor stub
	}
	
	public static boolean isPrime(int n) {
		for (int divisor = 2; divisor < n; divisor++) {
			if (n % divisor == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		boolean[] prime = new boolean[20+1];
//		for (int i=2; i<=20; i++) {
//			prime[i] = true;
//		}
//		
//		for (int divisor = 2; divisor * divisor <= 20; divisor++) {
//			if (prime[divisor]) {
//				for (int i = 2 * divisor; i <= 20; i = i+divisor) {
//					prime[i] = false;
//				}
//			}
//		}
//		
//		for (int i = 2; i <= 20; i++) {
//			if (prime[i]) {
//				System.out.print(" "+i);
//			}
//		}
//		
//		System.out.println();
		
		for (int i = 2;i < 30; i++) {
			if (isPrime(i)) {
				System.out.print(" " + i);
			}
		}
	}

}
