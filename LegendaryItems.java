/**
 * 2017/3/31 20:18
 *
 * @author changyi yuan
 */

import java.util.Scanner;
public class LegendaryItems {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int P = scan.nextInt();
            int Q = scan.nextInt();
            int N = scan.nextInt();
            double result = 0.0;
            int divide = 1;
            for (int i = 0; i < N; i++) {
                int tempP = P / divide;
                if (tempP == 0) {
                    result += (N - i) * caculate(0, Q);
                    break;
                }
                result += caculate(tempP, Q);
                divide = divide * 2;
            }
            scan.close();
            System.out.println((double) Math.round(result * 100) / 100);
        }

        static double caculate(int p, int q) {
            double result = 0.0;
            int count = 1;
            double curp = 1;
            while (true) {
                result += count * curp * p * 0.01;
                curp = curp * (1 - p * 0.01);
                p = p + q;
                count++;
                if (p >= 100) {
                    result += count * curp;
                    return result;
                }
            }
        }


}
