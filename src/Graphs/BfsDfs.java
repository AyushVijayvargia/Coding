package Graphs;

/**Java program to print DFS, DFS traversal from a given given graph,
 * it checks for disconnected components(isolated units) also,
 * good graph made to see the difference the between both....
**/
import java.util.*;

//This class represents a
//directed graph using adjacency
//list representation
public class BfsDfs {
	private int V; // No. of vertices

	static int disconnected = 0;
	// Array of lists for
	// Adjacency List Representation
	private LinkedList<Integer> adj[];

	// Constructor
	@SuppressWarnings("unchecked")
	BfsDfs(int v) {
		V = v;
		adj = new LinkedList[v];
		for (int i = 0; i < v; ++i)
			adj[i] = new LinkedList();
	}

	// Function to add an edge into the graph
	void addEdge(int v, int w) {
		adj[v].add(w); // Add w to v's list.
		// making it undirected
		adj[w].add(v);
	}

	// A function used by DFS
	void DFSUtil(int v, boolean visited[]) {
		// Mark the current node as visited and print it
		visited[v] = true;
		System.out.print(v + " ");

		// Recur for all the vertices adjacent to this
		// vertex
		Iterator<Integer> i = adj[v].listIterator();
		while (i.hasNext()) {
			int n = i.next();
			if (!visited[n])
				DFSUtil(n, visited);
		}
	}

	// The function to do DFS traversal. It uses recursive
	// DFSUtil()
	void DFS() {
		// Mark all the vertices as not visited(set as
		// false by default in java)
		boolean visited[] = new boolean[V];
		// Call the recursive helper function to print DFS
		// traversal starting from all vertices one by one
		for (int i = 0; i < V; ++i)
			if (visited[i] == false) {
				DFSUtil(i, visited);
				disconnected++;
			}

	}

	// prints BFS traversal from a given source s
	void BFSUtil(int s, boolean visited[]) {
		// Create a queue for BFS
		LinkedList<Integer> queue = new LinkedList<Integer>();

		// Mark the current node as visited and enqueue it
		visited[s] = true;
		queue.add(s);

		while (queue.size() != 0) {
			// Dequeue a vertex from queue and print it
			s = queue.poll();
			System.out.print(s + " ");

			// Get all adjacent vertices of the dequeued vertex s
			// If a adjacent has not been visited, then mark it
			// visited and enqueue it
			Iterator<Integer> i = adj[s].listIterator();
			while (i.hasNext()) {
				int n = i.next();
				if (!visited[n]) {
					visited[n] = true;
					queue.add(n);
				}
			}
		}

	}

	// BFSUtil() -- todo bfs traversal uses queue
	void BFS() {
		// Mark all the vertices as not visited(set as
		// false by default in java)
		boolean visited[] = new boolean[V];
		// just for covering disconnected components
		for (int i = 0; i < V; ++i)
			if (visited[i] == false)
				BFSUtil(i, visited);
	}

	// Driver method to

	// Driver Code
	public static void main(String args[]) {
		BfsDfs g = new BfsDfs(7);

		g.addEdge(0, 1);
		g.addEdge(1, 2);
		g.addEdge(2, 3);
		g.addEdge(3, 4);
		g.addEdge(0, 3);
		g.addEdge(5, 5);
		g.addEdge(6, 6);
		System.out.println("Following is Depth First Traversal");

		g.DFS();

		System.out.println();

		System.out.println("Following is Breadth First Traversal");

		g.BFS();

		System.out.println();

		if (disconnected > 1) {
			System.out.println("Undirected Graph is disconnected, total components " + disconnected);

		} else {
			System.out.println("Undirected Graph is connected");
		}

	}
}
