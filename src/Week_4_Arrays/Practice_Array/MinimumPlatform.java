// Minimum Platforms
// Given arrival and departure times of all trains that reach a railway station. Find the minimum number
// of platforms required for the railway station so that no train is kept waiting.
// Consider that all the trains arrive at the same day and leave on the same day. Arrival and departure
// time can never be the same for a train, but we can have arrival time of one train equal to departure time
// of the other. At any given instance of time, same platform can not be used for both departure of a train
// and arrival of another train. In such cases, we need different platforms
package Week_4_Arrays.Practice_Array;

import java.util.Arrays;

public class MinimumPlatform {
    public static void main(String[] args) {
        int arr[] = {900, 940, 950, 1100, 1500, 1800};
        int dep[] = {910, 1200, 1120, 1130, 1900, 2000};

        Arrays.sort(arr);
        Arrays.sort(dep);

        int count = 0;
        int max = 0;
        int i = 0, j = 0;
        while (i<arr.length){
            if (arr[i] <= dep[j]){
                count++;
                max = Math.max(max, count);
                i++;
            }
            else if (arr[i] > dep[j]){
                count--;
                j++;
            }
        }
        System.out.println("Maximum number of platforms: "+max);
    }
}
