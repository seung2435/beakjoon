package beakjoon.Graph;

import java.util.*;
class Edge {
    int from, to;
    Edge(int from, int to) {
        this.from = from;
        this.to = to;
    }
}
public class No13023_ans{
    /*public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        boolean[][] a = new boolean[n][n];
        ArrayList<Integer>[] g = (ArrayList<Integer>[]) new ArrayList[n];
        ArrayList<Edge> edges = new ArrayList<Edge>();
        for (int i=0; i<n; i++) {
            g[i] = new ArrayList<Integer>();
        }
        for (int i=0; i<m; i++) {
            int from = sc.nextInt();
            int to = sc.nextInt();
            edges.add(new Edge(from, to));
            edges.add(new Edge(to, from));
            a[from][to] = a[to][from] = true;
            g[from].add(to);
            g[to].add(from);
        }
        m *= 2;
        for  (int i=0; i<m; i++) {
            for (int j=0; j<m; j++) {
                int A = edges.get(i).from;
                int B = edges.get(i).to;
                int C = edges.get(j).from;
                int D = edges.get(j).to;
                if (A == B || A == C || A == D || B == C || B == D || C == D) {
                    continue;
                }
                if (!a[B][C]) continue;
                for (int E : g[D]) {
                    if (A == E || B == E || C == E || D == E) {
                        continue;
                    }
                    System.out.println(1);
                    System.exit(0);
                }
            }
        }
        System.out.println(0);
    }*/
	
	static ArrayList<Integer>[] r;
	static int[] visit = new int[2000];

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt(),M=sc.nextInt();
		r=Arrays.stream(new List[N]).map(i->new ArrayList()).toArray(ArrayList[]::new);
		
//	      ArrayList<Integer>[] r = new ArrayList[N];
//	      for(int i=0;i<N;i++) {
//	         r[i]= new ArrayList<Integer>();
//	      }
	      for(int i=0;i<M;i++) {
	         int a=sc.nextInt(); int b=sc.nextInt();
	         r[a].add(b);
	         r[b].add(a);
	        System.out.println(Arrays.toString(r));
	      }
		
		for(int i=0;i<N;i++)
			dfs(i,0);

		System.out.println(0);
	}

	static void dfs(int v, int c) {
		visit[v]=1;
		System.out.println(Arrays.toString(visit));
		if(c==4) {
			System.out.println(1);
			System.exit(0);
		}
		for(int n: r[v])
			if(visit[n]==0)
				dfs(n,c+1);

		visit[v]=0; //cnt=4를충족하지 못하여 dfs를 빠져나갈 때, false로 해주어야 나중에 다시 방문 가능!
	}
}
