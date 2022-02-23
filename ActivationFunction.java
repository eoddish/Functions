/* *****************************************************************************
 *  Name:              Alan Turing
 *  Coursera User ID:  123456
 *  Last modified:     1/1/2019
 **************************************************************************** */


public class ActivationFunction {

    // Returns the Heaviside function of x.
    public static double heaviside(double x) {

        if (Double.isNaN(x)) return Double.NaN;
        else if (x < 0) return 0;
        else if (x == 0) return 0.5;
        return 1;

    }

    // Returns the sigmoid function of x.
    public static double sigmoid(double x) {
        return 1.0 / (1 + Math.exp(-x));
    }

    // Returns the hyperbolic tangent of x.
    public static double tanh(double x) {
        if (x <= -20) return -1;
        else if (x >= 20) return 1;
        else return (Math.exp(x) - Math.exp(-x)) / (Math.exp(x) + Math.exp(-x));
    }

    // Returns the softsign function of x.
    public static double softsign(double x) {
        if (x == Double.NEGATIVE_INFINITY) return -1;
        else if (x == Double.POSITIVE_INFINITY) return 1;
        else return (x / (1 + Math.abs(x)));
    }

    // Returns the square nonlinearity function of x.
    public static double sqnl(double x) {
        if (Double.isNaN(x)) return Double.NaN;
        else if (x <= -2) return -1;
        else if (x < 0) return x + x * x / 4.0;
        else if (x < 2) return x - x * x / 4.0;
        return 1;

    }

    // Takes a double command-line argument x and prints each activation
    // function, evaluated, in the format (and order) given below.
    public static void main(String[] args) {
        double x = Double.parseDouble(args[0]);


        StdOut.printf("%9s(" + x + ") = " + heaviside(x) + "\n", "heaviside");
        StdOut.printf("%9s(" + x + ") = " + sigmoid(x) + "\n", "sigmoid");
        StdOut.printf("%9s(" + x + ") = " + tanh(x) + "\n", "tanh");
        StdOut.printf("%9s(" + x + ") = " + softsign(x) + "\n", "softsign");
        StdOut.printf("%9s(" + x + ") = " + sqnl(x) + "\n", "sqnl");

    }
}
