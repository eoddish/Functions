/* *****************************************************************************
 *  Name:              Alan Turing
 *  Coursera User ID:  123456
 *  Last modified:     1/1/2019
 **************************************************************************** */

public class UnitHyperbola {
    public static void main(String[] args) {
        StdDraw.setXscale(-6, 6);
        StdDraw.setYscale(-6, 6);
        for (int i = 0; i < 360; i++) {
            double t = Math.toRadians(i);
            double x = Math.cosh(t);
            double y = Math.sinh(t);
            StdDraw.point(x, y);
        }
    }
}
