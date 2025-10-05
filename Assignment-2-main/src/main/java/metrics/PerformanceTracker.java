package metrics;

public class PerformanceTracker {
    private long comparisons = 0;
    private long swaps = 0;

    public int compare(int a, int b) {
        comparisons++;
        return Integer.compare(a, b);
    }

    public void incrementSwaps() {
        swaps++;
    }

    public long getComparisons() {
        return comparisons;
    }

    public long getSwaps() {
        return swaps;
    }
}
