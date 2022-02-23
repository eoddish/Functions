/* *****************************************************************************
 *  Name:              Alan Turing
 *  Coursera User ID:  123456
 *  Last modified:     1/1/2019
 * clamp: round all samples greater than +1 to +1; round all samples less than –1 to –1.
normalize: rescale a sound so that all values are between –1 and +1.
cut: extract a contiguous subarray from a given sound.
trim: remove leading / trailing sequence of samples that are 0 (or nearly 0).
loop: repeat a given sound a specified number of times.
mirror: concatenate a sound with its reverse.
hip–hop: increase speed of a sound; mirror it; then loop it.
echo, delay, reverb: add a time-delayed version of a sound to itself, attenuated by a given factor.
fade-in, fade-out: gradually increase/decrease the volume at the beginning/end of a sound.
crossfade: fade-out first sound; fade-in second sound; overlap.
tremolo: create a trembling effect by modulating the amplitude up and down.
* You could also synthesize your own sounds by creating a sine wave, square wave, triangle wave, or sawtooth wave of a given amplitude, frequency, and duration.
 **************************************************************************** */

public class AudioCollage {

    // Returns a new array that rescales a[] by a multiplicative factor of alpha.
    public static double[] amplify(double[] a, double alpha) {
        double[] res = new double[a.length];
        for (int i = 0; i < a.length; i++) {
            res[i] = a[i] * alpha;
        }
        return res;
    }

    // Returns a new array that is the reverse of a[].
    public static double[] reverse(double[] a) {
        double[] res = new double[a.length];
        for (int i = 0; i < a.length; i++) {
            res[i] = a[a.length - i - 1];
        }
        return res;
    }

    // Returns a new array that is the concatenation of a[] and b[].
    public static double[] merge(double[] a, double[] b) {
        double[] c = new double[a.length + b.length];
        for (int i = 0; i < a.length; i++) {
            c[i] = a[i];
        }
        for (int i = a.length; i < b.length + a.length; i++) {
            c[i] = b[i - a.length];
        }
        return c;
    }

    // Returns a new array that is the sum of a[] and b[],
    // padding the shorter arrays with trailing 0s if necessary.
    public static double[] mix(double[] a, double[] b) {
        int n = Math.max(a.length, b.length);
        double[] c = new double[n];
        for (int i = 0; i < a.length; i++) {
            c[i] = a[i];
        }
        for (int i = 0; i < b.length; i++) {
            c[i] += b[i];
        }
        return c;
    }

    // Returns a new array that changes the speed by the given factor.
    public static double[] changeSpeed(double[] a, double alpha) {
        double[] res = new double[(int) (a.length / alpha)];
        for (int i = 0; i < res.length; i++) {
            res[i] = a[(int) (i * alpha)];
        }
        return res;
    }

    // Creates an audio collage and plays it on standard audio.
    // See below for the requirements.
    public static void main(String[] args) {
        double[] a = StdAudio.read("chimes.wav");
        double[] b = StdAudio.read("beatbox.wav");
        double[] c = StdAudio.read("singer.wav");
        double[] d = StdAudio.read("cow.wav");
        double[] e = StdAudio.read("piano.wav");

        b = changeSpeed(b, 0.5);
        c = reverse(c);
        b = amplify(b, 2);

        double[] collage = mix(e, merge(d, mix(mix(a, b), c)));

        StdAudio.play(collage);

    }
}
