package beakjoon.Graph;
import java.util.*;
public class No1260 {
	static boolean[] c;
	static ArrayList<Integer>[] a;
	static void dfs(int x) {
		c[x] = true;
		System.out.print(x+" ");
		for(int n : a[x]) {
			if(c[n]==false) {
				dfs(n);
			}	
		}		
	}
	//비재귀함수 
//	static void dfs2(int x) {
//		Stack<Integer> s = new Stack<>();
//		s.push(x);
//		c[x]=true;
//		System.out.print(x+" ");
//		while(!s.isEmpty()) {
//			for(int i=0; i<a[x].size(); i++) {
//				int next = a[x].get(i);
//				if(c[next]==false) {
//					x = next;
//					s.add(x);
//					System.out.print(x+" ");
//					c[next]=true;
//					
//				}
//				
//			}
//			x = s.pop();
//			
//		}
//	}
	
	public static void dfs2(int start,boolean[] visit,ArrayList[] graph) {
	      //Pair 클래스를 만들어서 쓰면 불필요한 반복을 없앨 수 있음
	      Stack<Integer> stack = new Stack<>();
	      stack.push(start);
	      visit[start]=true;
	      System.out.print(start+" ");
	      while(!stack.isEmpty()) {
	         int peek = stack.peek();
	         int count =0;
	         for(int i=0;i<graph[peek].size();i++) {
	            int next =(Integer) graph[peek].get(i);

	            if(!visit[next]) {
	               visit[next]=true;
	               stack.push(next);
	               System.out.print(next+" ");
	               count++;
	               break;
	            }
	         }
	         if(count==0) stack.pop();
	      }
	   }
//	8 7 1
//	1 2 1 3 2 4 4 5 4 6 6 7 6 8
	static void bfs(int x) {
		Queue<Integer> q = new LinkedList<Integer>();
		c[x]= true;
		q.add(x);
		while(!q.isEmpty()) {
			x = q.poll();
			System.out.print(x+" ");
			for(int n : a[x]) {
				if(c[n]==false) {
					c[n] = true;
					q.add(n);
				}
			}
		}
	}
	public static void main(String[] args) {
		//첫째 줄에 정점의 개수 N(1 ≤ N ≤ 1,000), 간선의 개수 M(1 ≤ M ≤ 10,000), 탐색을 시작할 정점의 번호 V
		//간선이 연결하는 두 정점의 번호
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt(), m=sc.nextInt(), v=sc.nextInt();
		a = new ArrayList[n+1];
		
		/*인접리스트*/
		for(int i=1; i<=n; i++) {
			a[i] = new ArrayList<Integer>();
		}
		for(int i=1; i<=m; i++) {
			int first=sc.nextInt(), second=sc.nextInt();
			a[first].add(second);
			a[second].add(first);
		}
		for(int i=1; i<=n; i++) { //a.length(x)
			Collections.sort(a[i]);
		}
		c = new boolean[n+1];
		dfs(v);
		dfs2(v, c, a);
		System.out.println();
		c = new boolean[n+1];
		bfs(v);
		System.out.println();
		
		sc.close();
	}
}
