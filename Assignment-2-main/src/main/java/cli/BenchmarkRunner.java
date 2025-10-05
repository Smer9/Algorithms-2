package cli;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import algorithms.HeapSort;


public class BenchmarkRunner {
    public static void main(String[] args) {
        int[] sizes = {1000, 5000, 10000, 50000, 100000};
        String fileName = "heap_results.csv";

        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write("n,time_ms\n");

            for (int n : sizes) {
                int[] arr = new Random().ints(n, 0, 100000).toArray();

                long start = System.nanoTime();
                HeapSort.sort(arr);
                long end = System.nanoTime();

                double timeMs = (end - start) / 1e6;
                writer.write(n + "," + String.format("%.3f", timeMs) + "\n");
                System.out.println("n = " + n + " → " + timeMs + " ms");
            }

            System.out.println("✅ Results saved to " + fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
