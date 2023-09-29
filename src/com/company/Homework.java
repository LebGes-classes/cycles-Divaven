import java.util.Scanner;
import java.lang.Math;

public class Homework {
    public static void main(String[] args) {
        // 1
        System.out.println("Одномерные массивы");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }

        int max = -1;
        int first_index = 0, second_index = n - 1;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            max = Math.max(max, Math.abs(a[i]));
        }
        for (int i = 0; i < n; i++) {
            if (a[i] < 0) {
                first_index = i;
                break;
            }
        }
        for (int i = first_index + 1; i < n; i++) {
            if (a[i] < 0) {
                second_index = i;
                break;
            }
        }

        for (int i = first_index + 1; i < second_index; i++) {
            sum += a[i];
        }

        System.out.println(max + " " + sum / (second_index - first_index - 1));
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();

        // 2
        System.out.println("Двумерные массивы");
        int m = scan.nextInt();
        int[][] matrix = new int[m][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = scan.nextInt();
            }
        }

        boolean ok;
        for (int i = 0; i < m; i++) {
            ok = true;
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] % 2 == 1) {
                    ok = false;
                }
            }
            if (ok) System.out.println(i + 1);
        }

        for (int i = 0; i < m; i++) {
            int x = matrix[0][i];
            matrix[0][i] = matrix[2][i];
            matrix[2][i] = x;
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
