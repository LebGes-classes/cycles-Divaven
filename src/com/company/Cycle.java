import java.util.Scanner;
import java.lang.Math;

public class Cycle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // 1
        System.out.println("Первая задача");
        int n = scan.nextInt();

        for (int i = 100; i < 1000; i++) {
            int ans = i;
            int sum = 0;
            while (ans > 9) {
                sum += (ans % 10);
                ans /= 10;
            }
            sum += ans;
            if (sum == n) System.out.println(i);
        }


        // 2
        /*
        -3 x<-5
        x+ 3 -5<=x<=-3
        x^2+y^2=9 -3<x<=3
        0.6(x-3) 3<x<=8
        3 x>8
         */


        System.out.println("Вторая задача");
        System.out.print("x | ");
        for (double x = -8.0; x <= 10.0; x += 0.5) {
            System.out.print(x + " | ");
        }
        System.out.println();
        System.out.print("y | ");
        for (double x = -8.0; x <= 10.0; x += 0.5) {
            if (x >= -8.0 && x < -5.0) {
                System.out.print(-3.0 + " | ");
            } else {
                if (x >= -5 && x <= -3) {
                    System.out.print(x + 3.0 + " | ");
                } else {
                    if (x > -3 && x <= 3) {
                        System.out.print(Math.sqrt(9 - x * x) + " | ");
                    } else {
                        if (x > 3 && x <= 8) {
                            System.out.print(0.6 * (x - 3) + " | ");
                        } else {
                            System.out.print(3.0 + " | ");
                        }
                    }
                }
            }
        }
    }
}
