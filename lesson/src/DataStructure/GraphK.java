package DataStructure;
import java.sql.SQLOutput;
import java.util.*;
public class GraphK {
    class Edge implements Comparable<Edge> {
        int src ,dest ,weight;

        @Override
        public int compareTo(Edge edge) {
            return this.weight - edge.weight;
        }
    }

    int V,E;

    Edge edge[];

    public GraphK(int v, int e){
        V = v;
        E = e;
        this.edge = new Edge[E];
        for (int i = 0; i < e; i++) {
            edge[i] = new Edge();
        }
    }

    int find(int parent[],int i){
        if(parent[i] == -1)
            return i;
            return find(parent,parent[i]);
    }

    void Union(int parent[],int x,int y){
        int xset = find(parent,x);
        int yset = find(parent,y);
        parent[xset] = yset;
    }

    void kruskalMST(){
        Edge result[] = new Edge[V];
        int e = 0;
        int i = 0;
        Arrays.sort(edge);
        int parent[] = new int[V];
        Arrays.fill(parent, -1);
        while(e < V-1){
            Edge nextEdge = edge[i++];
            int x = find(parent, nextEdge.src);
            int y = find(parent, nextEdge.dest);

            if(x != y){
                result[e++] = nextEdge;
                Union(parent,x,y);
            }
        }
        System.out.println("Kruskal algoritm result: ");
        for (int j = 0; j < e; j++) {
            System.out.println(result[j].src + " -- " + result[j].dest + " weight: " + result[j].weight);
        }
    }
    public static void main(String[] args) {
        int V = 7;
        int E = 21;
        GraphK graph = new GraphK(V,E);

        graph.edge[0].src = 0;
        graph.edge[0].dest = 1;
        graph.edge[0].weight = 9;

        graph.edge[1].src = 0;
        graph.edge[1].dest = 2;
        graph.edge[1].weight = 2;

        graph.edge[2].src = 0;
        graph.edge[2].dest = 3;
        graph.edge[2].weight = 10;

        graph.edge[3].src = 0;
        graph.edge[3].dest = 4;
        graph.edge[3].weight = 14;

        graph.edge[4].src = 0;
        graph.edge[4].dest = 5;
        graph.edge[4].weight = 10;

        graph.edge[5].src = 0;
        graph.edge[5].dest = 6;
        graph.edge[5].weight = 12;

        graph.edge[6].src = 1;
        graph.edge[6].dest = 2;
        graph.edge[6].weight = 15;

        graph.edge[7].src = 1;
        graph.edge[7].dest = 3;
        graph.edge[7].weight = 1;

        graph.edge[8].src = 1;
        graph.edge[8].dest = 4;
        graph.edge[8].weight = 12;

        graph.edge[9].src = 1;
        graph.edge[9].dest = 5;
        graph.edge[9].weight = 7;

        graph.edge[10].src = 1;
        graph.edge[10].dest = 6;
        graph.edge[10].weight = 1;

        graph.edge[11].src = 2;
        graph.edge[11].dest = 3;
        graph.edge[11].weight = 13;

        graph.edge[12].src = 2;
        graph.edge[12].dest = 4;
        graph.edge[12].weight = 11;

        graph.edge[13].src = 2;
        graph.edge[13].dest = 5;
        graph.edge[13].weight = 9;

        graph.edge[14].src = 2;
        graph.edge[14].dest = 6;
        graph.edge[14].weight = 11;

        graph.edge[15].src = 3;
        graph.edge[15].dest = 4;
        graph.edge[15].weight = 9;

        graph.edge[16].src = 3;
        graph.edge[16].dest = 5;
        graph.edge[16].weight = 4;

        graph.edge[17].src = 3;
        graph.edge[17].dest = 6;
        graph.edge[17].weight = 14;

        graph.edge[18].src = 4;
        graph.edge[18].dest = 5;
        graph.edge[18].weight = 12;

        graph.edge[19].src = 4;
        graph.edge[19].dest = 6;
        graph.edge[19].weight = 9;

        graph.edge[20].src = 5;
        graph.edge[20].dest = 6;
        graph.edge[20].weight = 14;

        graph.kruskalMST();

    }
}
