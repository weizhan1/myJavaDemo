package algoJava;

import java.util.Scanner;

public class WeightedQuickUnionPathCompressionUF {

	private int[] id; //id[i] = parent of i
	private int[] sz; //sz[i] = number of objects in subtree rooted at i
	private int count;
	
	public WeightedQuickUnionPathCompressionUF(int N) {
		count = N;
		id = new int[N];
		sz = new int[N];
		for (int i=0; i<N; i++) {
			id[i] = i;
			sz[i] = 1;
		}
	}
	
	public int count() {
		return count;
	}
	
	public boolean connected(int p, int q) {
		return find(p) == find(q);
	}
	
	public int find(int p) {
		int root = p;
		while (root != id[root])
			root = id[root];
		while (p != root) {
			int newp = id[p];
			id[p] = root;
			p = newp;
		}
		return root;
	}
	
	public void union(int p, int q) {
		int rootP = find(p);
		int rootQ = find(q);
		
		if (rootP == rootQ) return;
		
		if (sz[rootP] < sz[rootQ]) {
			id[rootP] = rootQ;
			sz[rootQ] += sz[rootP];
		} else {
			id[rootQ] = rootP;
			sz[rootP] += sz[rootQ];
		}
		count--;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Starting ...");
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		
		WeightedQuickUnionPathCompressionUF uf = new WeightedQuickUnionPathCompressionUF(N);
		int i = 0;
		while (i<6) {
			int p = scan.nextInt();
			int q = scan.nextInt();
			
			if (uf.connected(p, q)) continue;
			uf.union(p, q);
			System.out.println(p + " " + q);
			i++;
		}
		System.out.println(uf.count() + " components");		
	}
}
