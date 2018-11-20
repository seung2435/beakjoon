package beakjoon.Math.PrimeNum;
import java.util.*;
public class No1929 {
	public static boolean prime(int n) {
		if(n<2) {
			return false;
		}
		for(int i=2; i<=n/2; i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		StringTokenizer st = new StringTokenizer(sc.nextLine());
		int start = Integer.parseInt(st.nextToken());
		int end = Integer.parseInt(st.nextToken());
		List<String> ans = new ArrayList<String>();
		for(int i=start; i<=end; i++) {
			if(prime(i)==true) {
				ans.add(String.valueOf(i));
			}
		}
		for(int i=0; i<ans.size(); i++) {
			System.out.printf(ans.get(i)+"\n");
		}
		sc.close();
	}
}
