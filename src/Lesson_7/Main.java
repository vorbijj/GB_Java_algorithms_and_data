package Lesson_7;
/*

(0) --- (3) --- (4)
 | \      \       \
 |  (5)    \       \
(6)        (7) --- (9)
  \       /        /
   \    (2)       /
   (8) --- ---  (1)

 */

public class Main {
    public static void main(String[] args) {
        Graph graph = new Graph(10);

        int a = 0;
        int b = 1;

        graph.addEdge(0, 5);
        graph.addEdge(0, 3);
        graph.addEdge(0, 6);
        graph.addEdge(6, 8);
        graph.addEdge(1, 8);
        graph.addEdge(1, 9);
        graph.addEdge(7, 2);
        graph.addEdge(7, 3);
        graph.addEdge(7, 9);
        graph.addEdge(4, 3);
        graph.addEdge(4, 9);

        System.out.println("Количество вершин, " + graph.getVertexCount());
        System.out.println("Количество ребер, " + graph.getEdgeCount());
        System.out.println("Список смежности для вершины (" + a + ") - " + graph.getAdjList(a));

        BreadthFirstPath bfp = new BreadthFirstPath(graph, a);
        System.out.println("Существует путь от (" + a + ") до (" + b + ") - " + bfp.hasPathTo(b));
        System.out.println("Кратчайший путь от (" + a + ") до (" + b + ") - " + bfp.pathTo(b));

    }
}
