package util;

/**
 * @author summer
 * @see <a href=""></a><br/>
 */
public class Stopwatch {

    private final long start;

    public Stopwatch() {
        this.start = System.currentTimeMillis();
    }

    public double elapsedTime() {
        long now = System.currentTimeMillis();
        return (now - start) / 1000.0;
    }
}
