package Week_5_Multidimensional_Arrays.Practice_Matrix;

import java.util.*;

public class IntervalMerge {
    // Function to merge overlapping intervals and return the merged intervals
    public static List<int[]> mergeIntervalsAndCount(int[][] intervals) {
        // Check if the intervals array is null or empty
        if (intervals == null || intervals.length == 0) {
            return new ArrayList<>();
        }

        // Sort intervals based on start time
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));

        // List to store the merged intervals
        List<int[]> mergedIntervals = new ArrayList<>();
        int[] currentInterval = intervals[0];
        mergedIntervals.add(currentInterval);

        // Merge overlapping intervals
        for (int[] interval : intervals) {
            int currentEnd = currentInterval[1];
            int nextStart = interval[0];
            int nextEnd = interval[1];

            if (currentEnd >= nextStart) {
                currentInterval[1] = Math.max(currentEnd, nextEnd);
            } else {
                currentInterval = interval;
                mergedIntervals.add(currentInterval);
            }
        }

        // Return the merged intervals
        return mergedIntervals;
    }

    public static void main(String[] args) {
        // Create a scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter the number of intervals
        System.out.print("Enter the number of intervals: ");
        int n = scanner.nextInt();

        // Create a 2D array to store the intervals
        int[][] intervals = new int[n][2];

        // Input the start and end points for each interval
        for (int i = 0; i < n; i++) {
            System.out.print("Enter start for interval " + (i + 1) + ": ");
            intervals[i][0] = scanner.nextInt();
            System.out.print("Enter end for interval " + (i + 1) + ": ");
            intervals[i][1] = scanner.nextInt();
        }

        // Close the scanner
        scanner.close();

        // Call the mergeIntervalsAndCount function to merge intervals and get the merged intervals
        List<int[]> mergedIntervals = mergeIntervalsAndCount(intervals);

        // Print the count of non-overlapping intervals
        System.out.println("Number of non-overlapping intervals: " + mergedIntervals.size());

        // Print the merged intervals
        System.out.println("Merged intervals:");
        for (int[] interval : mergedIntervals) {
            System.out.println(Arrays.toString(interval));
        }
    }
}
