import java.util.*;

public class TestClass {
    static int firstRoute(int n, int a[][]) {
        int d1 = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j || i + j == n - 1) {
                    d1 += a[i][j];
                }
            }
        }
        return d1;
    }

    static int secondRoute(int n, int a[][]) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1; j++) {
                int sum = a[i][j] + a[i][j + 1] + a[i + 1][j] + a[i + 1][j + 1];
                min = Math.min(min, sum);
            }
        }
        return min;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] a = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.print(firstRoute(n, a) + " " + secondRoute(n, a));
    }
}