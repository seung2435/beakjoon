package beakjoon.Math.GCD;

import java.util.*;

public class No9613 {
	public static int gcd(int a, int b) {
		while(b!=0) {
			int r = a%b;
			a = b;
			b = r;
		}
		return a;
	}
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
//			int t = sc.nextInt();
//			while(t-- > 0) {
//				int n = sc.nextInt();
//				int[] test = new int[n];
//				for(int i=0; i<n; i++) {
//					test[i] = sc.nextInt();
//				}
//				long sum = 0;
//				for(int i=0; i<n-1;i++) {
//					for(int j=i+1; j<n; j++) {
//						sum += gcd(test[i], test[j]);
//					}
//				}
//				System.out.println(sum);
//			}
			
			int size = Integer.parseInt(sc.nextLine());
			
	
			int[] test;
			int sum;
			int a;
			int b;
			
			for(int i=0; i<size; i++) {
				StringTokenizer st = new StringTokenizer(sc.nextLine()); //for문 밖에 있었
				test = new int[Integer.parseInt(st.nextToken())];
				sum = 0;
				for(int j=0; j<test.length; j++) {
					test[j] = Integer.parseInt(st.nextToken());
				}
				for(int j=0; j<test.length-1; j++) {
					for(int k=j+1; k<test.length; k++) {
						a = test[j];
						b = test[k];
						
						sum += gcd(a,b);
					}
				}
				System.out.println(sum);
			}
			sc.close();
	}
}
