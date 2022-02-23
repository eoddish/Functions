/* *****************************************************************************
 *  Name:              Alan Turing
 *  Coursera User ID:  123456
 *  Last modified:     1/1/2019
 **************************************************************************** */

public class Histogram {
    public static void main(String[] args) {
        int[] a = { 1, 2, 2, 4, 4, 4, 5 };
        int m = 6;
        int[] b = histogram(a, m);
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }
    }

    public static int[] histogram(int[] a, int m) {
        int[] b = new int[m];

        for (int i = 0; i < a.length; i++) {
            b[a[i]]++;
        }
        return b;
    }
}
