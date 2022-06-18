import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;



public class Main_UVA_11338_template {
	private static final boolean DEB = true;
	private static BufferedReader br;
	private static final double INF = 10e50;

	public static void main(String[] args) throws Exception {
		File file = new File("11338.in");
		if (file.exists())
			br = new BufferedReader(new InputStreamReader(new FileInputStream(
					file)));
		else
			br = new BufferedReader(new InputStreamReader(System.in));

		solve();

		br.close();
	}

	public static final double EPS = 10e-9;

	public static void solve() throws Exception {

		double d;

		while (true) {
			String line = br.readLine().trim();
			if (line.equalsIgnoreCase("*"))
				break;
			StringTokenizer st = new StringTokenizer(line);
			int w = Integer.parseInt(st.nextToken());
			int h = Integer.parseInt(st.nextToken());
			int n = Integer.parseInt(br.readLine());

			// create your graph and solve the problem
			double x[] = new double[n + 2];
			double y[] = new double[n + 2];
			int from = n;
			int to = n + 1;
			x[from] = 0;
			y[from] = 0;
			x[to] = w;
			y[to] = h;
			Graph g = new Graph(n + 2);
			for (int i = 0; i < n; i++) {
				st = new StringTokenizer(br.readLine());
				x[i] = Double.parseDouble(st.nextToken());
				y[i] = Double.parseDouble(st.nextToken());
			}

			n += 2;
			d = Double.parseDouble(br.readLine().trim());
			
			//TODO here add edges to the graph and solve the problem
			
			if( DEB )
			{
				System.out.println("NEW CASE:");
				System.out.println(g);
				System.out.println(Arrays.toString(g.dijkstra(from)));
				
				//TODO try better version:
				//System.out.println(Arrays.toString(g.dijkstraBest(from)));
			}
			
			double D[] = g.dijkstra(from);
			
			//TODO try better version
			//double D[] = g.dijkstraBest(from);
			
			
			if (D[to] <= d + EPS)
				System.out.println("I am lucky!");
			else
				System.out.println("Boom!");
		}
	}

	private static class Edge implements Comparable<Edge> {

		private int node;
		private double weight;

		public Edge(int to, double weight) {

			this.node = to;
			this.weight = weight;
		}

		public int getTo() {
			return node;
		}
		public double getWeight() {
			return weight;
		}

		@Override
		public int compareTo(Edge other) {
			if (this.getWeight() < other.getWeight())
				return -1;
			if (this.getWeight() > other.getWeight())
				return 1;
			return 0;
		}

		@Override
		public String toString() {
			return "(" + weight + ")" + node;
		}

	}

	private static class Graph {
		private ArrayList<Edge> adj[];

		public Graph(int n) {
			adj = new ArrayList[n];
			for (int i = 0; i < adj.length; i++) {
				adj[i] = new ArrayList<Edge>();
			}
		}

		public int getNodeCount() {
			return this.adj.length;
		}

		public boolean addEdge(int from, int to, double weight) {
			if (from < 0 || from >= getNodeCount() || to < 0
					|| to >= getNodeCount()) {
				System.err.println("Error, wrong node ID in addEdge");
				return false;
			}
			adj[from].add(new Edge(to, weight));
			adj[to].add(new Edge(from, weight));
			return true;
		}

		public String toString() {
			String ans = "";
			for (int i = 0; i < this.getNodeCount(); i++) {
				ans += i + ": ";
				for (Edge e : this.adj[i]) {
					ans += e.getTo() + "(" + e.getWeight() + ") ";
				}
				ans += "\n";
			}
			return ans;
		}
		public double[] dijkstra(int startNode) {
			double distance[] = new double[this.getNodeCount()];
			boolean visited[] = new boolean[this.getNodeCount()];
			int previus[] = new int[this.getNodeCount()];
			Arrays.fill(distance, INF);
			Arrays.fill(previus, -1);
			for (Edge e : adj[startNode])
				distance[e.getTo()] = e.getWeight();
			distance[startNode] = 0;
			visited[startNode] = true;

			while (true) {
				int nextNode = -1;
				double minDistanceSoFar = INF;
				for (int i = 0; i < adj.length; i++)
					if (visited[i])
						for (Edge e : adj[i])
							if (!visited[e.getTo()]
									&& e.getWeight() < minDistanceSoFar) {
								nextNode = e.getTo();
								minDistanceSoFar = e.getWeight();
							}

				if (nextNode == -1)
					break;
				visited[nextNode] = true;
				for (Edge e : adj[nextNode]) {
					if (distance[e.getTo()] > distance[nextNode]
							+ e.getWeight()) {
						distance[e.getTo()] = distance[nextNode]
								+ e.getWeight();
						previus[e.getTo()] = nextNode;
					}
				}
			}
			return distance;
		}

		public double[] dijkstraBest(int startNode) {
			double D[] = new double[this.getNodeCount()];
			boolean permanente[] = new boolean[this.getNodeCount()];
			int padre[] = new int[this.getNodeCount()];
			Arrays.fill(D, INF);
			Arrays.fill(padre, -1);
			D[startNode] = 0;

			PriorityQueue<Edge> q = new PriorityQueue<Edge>();
			q.add(new Edge(startNode, 0));

			while (!q.isEmpty()) {
				Edge nextEdge = q.poll();
				int i = nextEdge.getTo();

				if (permanente[i])
					continue;

				permanente[i] = true;

				for (Edge e : adj[i]) {
					int jj = e.getTo();
					double Cij = e.getWeight();
					if (!permanente[jj] && D[i] + Cij < D[jj]) {
						D[jj] = D[i] + Cij;
						padre[jj] = i;
						q.add(new Edge(jj,D[jj]));

					}
				}
			}
			return D;
		}

		@SuppressWarnings("unused")
		public void testQueue() {

			PriorityQueue<Edge> q = new PriorityQueue<Edge>();

			for (ArrayList<Edge> list : adj) {
				for (Edge edge : list) {
					q.add(edge);
				}
			}
			while (!q.isEmpty()) {
				System.out.println(q.poll());
			}
		}
	}

}
