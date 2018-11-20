package beakjoon.Permutation;
/*이전 순열*/
import java.util.*;
public class No10973 {
	public static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	public static boolean prev_permutation(int[]a) {
		int i = a.length-1;
		while(i>0 && a[i-1]<=a[i]) i-=1;
		if(i<=0) return false;
		
		int j = a.length-1;
		while(j>i&&a[j]>=a[i-1]) j-=1;
		swap(a, i-1, j);
		j = a.length-1;
		while(i<j) {
			swap(a, i, j);
			i +=1;
			j -=1;
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i=0; i<n; i++) {
			a[i] = sc.nextInt();
		}
		if(prev_permutation(a)) {
			for(int i=0;i<n;i++) {
				System.out.print(a[i] +" ");
			}
			System.out.println();
		}else {
			System.out.print(-1);
		}
		
		sc.close();
	}
}
