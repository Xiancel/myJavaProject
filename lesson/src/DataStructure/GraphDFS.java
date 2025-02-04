package DataStructure;

import java.util.ArrayList;
public class GraphDFS {

    ArrayList<Node1> nodes;
    int[][] matrix;

    public GraphDFS(int size){
        nodes = new ArrayList<>();
        this.matrix = new int[size][size];
    }

    public void addNode(Node1 node){
        nodes.add(node);
    }
    public void addEdge(int src,int dst){
        matrix[src][dst] = 1;
    }

    public boolean checkEdge(int src, int dst){
        if(matrix[src][dst] == 1){
            return true;
        }else{
            return false;
        }
    }

    public void print(){
        System.out.print(" ");
        for(Node1 node : nodes){
            System.out.print(node.data + "  ");
        }
        System.out.println();
        for (int i = 0; i < matrix.length; i++) {
            System.out.print(nodes.get(i).data + "  ");
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }
    //DFS
    public void depthFirstSearch(int src){
        boolean[] visited = new boolean[matrix.length];
        dFSHelper(src,visited);

    }

    private void dFSHelper(int src, boolean[] visited) {
        if(visited[src]){
            return;
        }else{
            visited[src]= true;
            System.out.println(nodes.get(src).data + "= visited");
        }

        for (int i = 0; i < matrix[src].length; i++) {
            if(matrix[src][i] == 1){
                dFSHelper(i,visited);
            }
        }
        return;
    }

    public static void main(String[] args) {
        GraphDFS graph = new GraphDFS(5);

        graph.addNode(new Node1('A'));
        graph.addNode(new Node1('B'));
        graph.addNode(new Node1('C'));
        graph.addNode(new Node1('D'));
        graph.addNode(new Node1('E'));

        graph.addEdge(0,1);
        graph.addEdge(1,2);
        graph.addEdge(1,4);
        graph.addEdge(2,3);
        graph.addEdge(2,4);
        graph.addEdge(4,0);
        graph.addEdge(4,2);

        graph.print();
        graph.depthFirstSearch(0);
    }
}

class Node1{
    char data;
    Node1(char data){
        this.data = data;
    }
}
