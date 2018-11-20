package beakjoon.Recursion;
/*LOTTO*/
import java.util.*;
public class No6603 {
	static ArrayList<Integer> lotto = new ArrayList<>();
	static void go(int[] a, int index, int cnt) {
		if(cnt==6) {
			for(int num : lotto) {
				System.out.print(num + " ");
			}System.out.println();
			return;
		}
		int n =a.length;
		if(n==index) return;
		lotto.add(a[index]);
		go(a, index+1, cnt+1);
		lotto.remove(lotto.size()-1);
		go(a, index+1, cnt);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int n = sc.nextInt();
			if(n==0) break;
			int[] a = new int[n];
			for(int i=0; i<a.length-1; i++) {
				a[i] = sc.nextInt();
			}
			go(a,0,0);
			System.out.println();
		}
		sc.close();

	}

}
