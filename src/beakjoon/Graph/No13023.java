package beakjoon.Graph;
/*ABCDE*/
import java.util.*;
public class No13023 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt(); //각 친구 관계 수
		int[][] E = new int[m][2];
		for(int i=0; i<m; i++) {
			for(int j=0; j<2; j++) {
				E[i][j] = sc.nextInt();
			}
		} //친구 관계 저장
		
		/*간선리스트 만들기 위한 cnt배열 만들기*/
		int[] cnt = new int[n]; //사람의 번호와 index가 동일하게 사용될 수 있음
		for(int i=0; i<m; i++) {
			cnt[E[i][0]] += 1;
		}//각 간선의 정점의 개수를 넣음; 정점별 간선의 개수
		for(int i=1; i<cnt.length; i++) {
			cnt[i] = cnt[i-1] + cnt[i]; 
		}//누적값 저장 
		
		/**/
		boolean[] visit = new boolean[n];
		Queue<Integer> q = new LinkedList<>();
		q.add(0);
		visit[0] = true;
		int stage = 0;
		while(!q.isEmpty()) {
			int poll = q.poll();
			for(int i=0; i<q.size(); i++) {
				
			}
		}
		
		
		
		sc.close();
	}

}
