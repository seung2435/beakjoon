package beakjoon.Recursion;
import java.util.*;
public class No9095 {
	public static int go(int sum, int goal) {
		if(sum == goal) return 1;
		if(sum > goal) return 0;
		int count = 0;
		for(int i=1; i<=3; i++) {
			count += go(sum+i, goal);
		}
		return count;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int task = Integer.parseInt(sc.nextLine());
		int sum = 0;
		for(int i=0; i<task; i++) {
			int goal = Integer.parseInt(sc.nextLine());
			System.out.println(go(sum, goal));
		}
		
		sc.close();
	}

}
