import java.util.Scanner;

public class FloydWarshall {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of vertices:");
        int n = scanner.nextInt();
        System.out.println("Enter the number of edges:");
        int e = scanner.nextInt();
        int[][] p = new int[10][10];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                p[i][j] = 999;
            }
        }

        for (int i = 1; i <= e; i++) {
            System.out.println("Enter the end vertices of edge" + i + " with its weight");
            int u = scanner.nextInt();
            int v = scanner.nextInt();
            int w = scanner.nextInt();
            p[u][v] = w;
        }

        System.out.println("Matrix of input data:");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(p[i][j] + "\t");
            }
            System.out.println();
        }

        floyds(p, n);

        System.out.println("Transitive closure:");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(p[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("The shortest paths are:");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i != j) {
                    System.out.println("<" + i + "," + j + ">=" + p[i][j]);
                }
            }
        }
    }

    public static void floyds(int[][] p, int n) {
        for (int k = 1; k <= n; k++) {
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    if (i == j) {
                        p[i][j] = 0;
                    } else {
                        p[i][j] = Math.min(p[i][j], p[i][k] + p[k][j]);
                    }
                }
            }
        }
    }
}
