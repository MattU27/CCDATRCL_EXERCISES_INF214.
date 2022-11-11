public class Graph {

    // inner class
    // to keep track of edges
    class Edge {
        String src, dest;
    }

    // number of vertices and edges
    int vertices, edges;

    // array to store all edges
    Edge[] edge;

    Graph(int vertices, int edges) {
        this.vertices = vertices;
        this.edges = edges;

        // initialize the edge array
        edge = new Edge[edges];
        for (int i = 0; i < edges; i++) {

            // each element of the edge array
            // is an object of Edge type
            edge[i] = new Edge();
        }
    }

    public static void main(String[] args) {

        // create an object of Graph class
        int noVertices = 7;
        int noEdges = 7;
        Graph myGraph = new Graph(noVertices, noEdges);

        // create graph

        // Edge 1
        myGraph.edge[0].src = "Banto";
        myGraph.edge[0].dest = "Chas";

        // Edge 2
        myGraph.edge[1].src = "Banto";
        myGraph.edge[1].dest = "Oli";

        // Edge 3
        myGraph.edge[2].src = "Banto";
        myGraph.edge[2].dest = "Ja";

        // Edge 4
        myGraph.edge[3].src = "Chas";
        myGraph.edge[3].dest = "Oli";

	// Edge 5
	myGraph.edge[4].src = "Chas";
        myGraph.edge[4].dest = "Conan";

	// Edge 6
	myGraph.edge[5].src = "Ja";
        myGraph.edge[5].dest = "Conan";

	// Edge 7
	myGraph.edge[6].src = "Conan";
        myGraph.edge[6].dest = "Che";



        // print graph
        for (int i = 0; i < noEdges; i++) {
            System.out.println(myGraph.edge[i].src + " - " + myGraph.edge[i].dest);
        }

    }
}
