/* *****************************************************************************
 *  Name:              Alan Turing
 *  Coursera User ID:  123456
 *  Last modified:     1/1/2019
 **************************************************************************** */

public class Logarithm {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        System.out.print(lg(n));
    }

    public static int lg(int n) {
        int res = 1;
        int count = 0;
        while (res < n) {
            res *= 2;
            count++;

        }
        if (res > n) count--;
        return count;
    }
}
