package DataStructure;

import java.util.*;

public class DijskstraAlgoritm {

        private static final int INFINITY = Integer.MAX_VALUE;

        private static class Edge{
            int destination;
            int weight;

            public Edge(int destination, int weight) {
                this.destination = destination;
                this.weight = weight;

            }
        }

        public void dijkstra(List<List<Edge>> graph, int source){
                int numVertices = graph.size();

                int[] distances = new int[numVertices];
                int[] previous = new int[numVertices];

                Set<Integer> visited = new HashSet<>();

                Arrays.fill(distances, INFINITY);
                distances[source] = 0;

                for (int i = 0; i < numVertices ; i++) {
                    int current = getMinDistance(distances,visited);

                    visited.add(current);

                    for(Edge edge : graph.get(current)){
                        int neighbor = edge.destination;
                        int weight = edge.weight;
                        if(!visited.contains(neighbor)){
                            int newDistance = distances[current]+ weight;
                            if(newDistance < distances[neighbor]){
                                distances[neighbor] = newDistance;
                                previous[neighbor] = current;
                            }
                        }
                    }
            }
            for (int i = 0; i < numVertices; i++) {
                System.out.println("Найменша дистанція від точки "+ i +": "+ distances[i]);
                System.out.println("Найменший шлях ");
                printPath(previous, i);
                System.out.println();

            }

        }

    private void printPath(int[] previous, int i) {
            if(i == 0){
                System.out.println("0");
            }else if(previous[i] == 0){
                System.out.println("0 -> "+i);
            } else  {
                printPath(previous,previous[i]);
                System.out.println(" -> " + i);
            }
    }

    private int getMinDistance(int[] distances, Set<Integer> visited) {
            int minDistance = INFINITY;
            int minIndex = -1;

            for (int i = 0; i < distances.length; i++) {
                if(!visited.contains(i) && distances[i] < minDistance) {
                    minDistance = distances[i];
                    minIndex = i;
                }
        }
            return minIndex;
    }

    public static void main(String[] args) {

            int numVertices = 7;
            int source = 0;
            List<List<Edge>> graph = new ArrayList<>();

        for (int i = 0; i < numVertices; i++) {
            graph.add(new ArrayList<>());
        }

        graph.get(0).add(new Edge(1,9));
        graph.get(0).add(new Edge(2,2));
        graph.get(0).add(new Edge(3,10));
        graph.get(0).add(new Edge(4,14));
        graph.get(0).add(new Edge(5,10));
        graph.get(0).add(new Edge(6,11));

        graph.get(1).add(new Edge(0,9));
        graph.get(1).add(new Edge(2,15));
        graph.get(1).add(new Edge(3,1));
        graph.get(1).add(new Edge(4,12));
        graph.get(1).add(new Edge(5,7));
        graph.get(1).add(new Edge(6,1));

        graph.get(2).add(new Edge(0,2));
        graph.get(2).add(new Edge(1,15));
        graph.get(2).add(new Edge(3,13));
        graph.get(2).add(new Edge(4,11));
        graph.get(2).add(new Edge(5,9));
        graph.get(2).add(new Edge(6,11));

        graph.get(3).add(new Edge(0,10));
        graph.get(3).add(new Edge(1,1));
        graph.get(3).add(new Edge(2,13));
        graph.get(3).add(new Edge(4,9));
        graph.get(3).add(new Edge(5,4));
        graph.get(3).add(new Edge(6,14));

        graph.get(4).add(new Edge(0,14));
        graph.get(4).add(new Edge(1,12));
        graph.get(4).add(new Edge(2,11));
        graph.get(4).add(new Edge(3,9));
        graph.get(4).add(new Edge(5,12));
        graph.get(4).add(new Edge(6,9));

        graph.get(5).add(new Edge(0,10));
        graph.get(5).add(new Edge(1,7));
        graph.get(5).add(new Edge(2,9));
        graph.get(5).add(new Edge(3,4));
        graph.get(5).add(new Edge(4,12));
        graph.get(5).add(new Edge(6,14));

        graph.get(6).add(new Edge(0,11));
        graph.get(6).add(new Edge(1,1));
        graph.get(6).add(new Edge(2,11));
        graph.get(6).add(new Edge(3,14));
        graph.get(6).add(new Edge(4,9));
        graph.get(6).add(new Edge(5,14));



        DijskstraAlgoritm dijskstra = new DijskstraAlgoritm();
        dijskstra.dijkstra(graph,source);
    }
}
