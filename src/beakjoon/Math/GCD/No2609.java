package beakjoon.Math.GCD;

import java.util.*;
public class No2609 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int gcd = 0;
		int lcm = 0;
		//입력값이 1인 경우를 생각하지x(i를 2부터시작이라 적음)
		//i가 Math.min(a,b)까지임을 고려x(부등호를 <라고 적음)
			for(int i=1; i<=Math.min(a, b); i++) { 
				if(a%i==0 && b%i==0) {
					gcd = i;
				}
			}
			lcm = (a*b)/gcd;
			
			System.out.println(gcd);
			System.out.println(lcm);
		
		sc.close();
	}
}
