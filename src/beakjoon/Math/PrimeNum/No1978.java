package beakjoon.Math.PrimeNum;
import java.util.*;
public class No1978 {
	public static boolean prime(int n) {
		if(n<2){
			return false;
		}
		for(int i=2; i<=n/2; i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] arr = new int[num];
		List<String> ans = new ArrayList<String>();
		for(int i=0; i<num; i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0; i<num; i++) { //0부터 시작하므로 부등호에 =표시 지워야했음
			if(prime(arr[i])==true) {
				ans.add(String.valueOf(arr[i]));
			}
		}
		System.out.print(ans.size());
		sc.close();
	}
}

