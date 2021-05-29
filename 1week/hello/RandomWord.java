/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class RandomWord {
    public static void main(String[] args) {
        int i = 1;
        String champion = null;
        do {
            double f = 1.0d / i;
            String next = StdIn.readString();
            if (StdRandom.bernoulli(f)) {
                champion = next;
            }
            i = i + 1;
        } while (!StdIn.isEmpty());
        StdOut.println(champion);
    }
}
