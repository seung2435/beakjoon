package beakjoon.Recursion;
/*암호만들기*/
import java.util.*;
public class No1759 {
	public static void go(int n, String[] alpha, String password, int i) {
		if(password.length() == n) {
			if(check(password)==true) {
				System.out.println(password);
			}return;
		}
		if(i>=alpha.length) return;
		go(n, alpha, password+alpha[i], i+1);
		go(n, alpha, password,i+1);
	}
	private static boolean check(String password) {
		int ja = 0;
		int mo = 0;
		for(char x : password.toCharArray()) {
			if(x=='a' || x=='e' || x=='i' || x=='o' || x=='u') {
				mo += 1;
			}else {
				ja += 1;
			}
		}
		if(mo >=1 && ja>=2) {
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] alpha = new String[sc.nextInt()];
		for(int i=0; i<alpha.length; i++) {
			alpha[i] = sc.next();
		}
		Arrays.sort(alpha);
		go(n, alpha, "", 0);
		sc.close();
	}
}
