import java.util.Arrays;

public class practicewarshall {
    
    
    public static final int INF = 9999;
    public static final int nV = 4;

    public static void floydwarshall(int[][] graph) {
        int[][] matrix = new int[nV][nV];
        int i, j, k;

        for (i = 0; i < nV; i++) {
            for (j = 0; j < nV; j++) {
                matrix[i][j] = graph[i][j];
            }
        }
        
        for (k = 0; k < nV; k++) {
            for (i = 0; i < nV; i++) {
                for (j = 0; j < nV; j++) {
                    if (matrix[i][k] + matrix[k][j] < matrix[i][j]) {
                        matrix[i][j] = matrix[i][k] + matrix[k][j];
                    }
                }
            }
        }

        printWarshall(matrix);
    }

    public static void printWarshall(int[][] matrix) {
        for (int i = 0; i < nV; i++) {
            for (int j = 0; j < nV; j++) {
                if (matrix[i][j] == INF) {
                    System.out.println("INF");
                } else {
                    System.out.print(matrix[i][j] + "");
                }
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        int graph[][] = { { 0, 3, INF, 5 }, { 2, 0, INF, 4 }, { INF, 1, 0, INF }, { INF, INF, 2, 0 } };
        floydwarshall(graph);
        System.out.println(Arrays.toString(graph));
    }
}
