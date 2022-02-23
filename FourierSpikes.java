/* *****************************************************************************
 *  Name:              Alan Turing
 *  Coursera User ID:  123456
 *  Last modified:     1/1/2019
 **************************************************************************** */

public class FourierSpikes {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        StdDraw.setCanvasSize(1000, 1000);
        StdDraw.setXscale(-0.5, 0.5);
        StdDraw.setYscale(-0.5, 1.5);
        double t0 = 0;
        double aver0 = 0;
        for (double T = -10; T < 10; T = T + 0.04) {
            double t = Math.toRadians(T);
            double sum = 0;

            for (int i = 1; i <= n; i++) {
                sum += Math.cos(i * t);
            }
            double aver = sum / n;

            StdDraw.line(t0, aver0, t, aver);
            t0 = t;
            aver0 = aver;
        }
    }
}
