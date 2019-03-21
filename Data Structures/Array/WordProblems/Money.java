import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.TreeMap;
 
/*
there are N campers wandering around the city aimlessly. You have to handle Q queries; which consist of two groups finding each other and becoming one larger group. After each query, output the difference between the group of largest size and group of smallest size. If there is only one group, output 0. At first, everyone is in their own group.

Also note, if the two campers in the query are already in the same group, print the current answer, and skip merging the groups together.

Input:

The first line consists of two space separated integers, N and Q

The next Q line consists of two integers, A and B, meaning that the groups involving camper A and camper B find each other.

Output:
Output Q lines, the answer after each query.
Constraints:
1 <= N <= 105
1 <= Q <= 105s
SAMPLE INPUT 
2 1
1 2
SAMPLE OUTPUT 
0
Explanation
Here, the two campers find each other, so the answer is 0.
*/


class TestClass {
	private BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	private BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
 
	public static void main(String[] args) throws Exception {
 
		// System.out.println(Arrays.toString(lowest));
 
		new TestClass().solve();
	}
 
	private void solve() throws Exception {
		int testCases = 1;
		// testCases = Integer.parseInt(in.readLine().trim());
		for (int i = 1; i <= testCases; i++) {
			solve(i);
		}
 
		out.flush();
		out.close();
	}
 
	private void solve(int testCaseNumber) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int q = sc.nextInt();
		
		UF uf = new UF(n);
 
		while (q-- > 0) {
			// StringTokenizer st = new StringTokenizer(in.readLine());
			int i = sc.nextInt() - 1;
			int j = sc.nextInt() - 1;
			uf.union(i, j);
			int low = uf.map.firstKey();
			int high = uf.map.lastKey();
			out.write(high - low + "\n");
		}
 
	}
 
}
 
class UF {
	int id[];
	int size[];
	int components;
	TreeMap<Integer, Integer> map = new TreeMap<>();
 
	public UF(int n) {
		this.components = n;
		this.map.put(1, n);
		this.id = new int[n];
		this.size = new int[n];
		for (int i = 0; i < n; i++) {
			id[i] = i;
			size[i] = 1;
		}
	}
 
	public int root(int i) {
		int root = i;
 
		while (root != id[root])
			root = id[root];
 
		while (i != root) {
			int x = id[i];
			id[i] = root;
			i = x;
		}
 
		return root;
	}
 
	public void union(int p, int q) {
		int pr = root(p);
		int qr = root(q);
 
		if (pr == qr)
			return;
		
		decrementMap(size[pr]);
		decrementMap(size[qr]);
		if (size[pr] > size[qr]) {
			id[qr] = pr;
			size[pr] += size[qr];
			incrementMap(size[pr]);
			
 
		} else {
			id[pr] = qr;
			size[qr] += size[pr];
			incrementMap(size[qr]);
		}
		components--;
 
	}
 
	public void decrementMap(int key) {
		if(this.map.containsKey(key)) {
			map.put(key, map.get(key) -1);
			
			if(map.get(key) == 0) map.remove(key);
		}
	}
 
	public void incrementMap(int key) {
		if(this.map.containsKey(key)) {
			map.put(key, map.get(key) +1);
		}else {
			map.put(key, 1);
		}
	}
	
}