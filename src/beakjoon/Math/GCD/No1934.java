package beakjoon.Math.GCD;

import java.util.*;
public class No1934 {
	public static int gcd(int a, int b) {
		if(b==0) {
			return a;
		}else {
			return gcd(b, a%b);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		int[] test = new int[c*2];
		
		for(int i=0; i<c; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			if(a>=1 && b<=45000) {
				test[i*2] = a;
				test[i*2+1] = b;
			}
		}
		for(int i=0; i<c; i++) {
			int a = test[i*2];
			int b = test[i*2+1];
			int g = gcd(a,b);
			
			System.out.println(a*b/g);
		}
		sc.close();
	}
}
