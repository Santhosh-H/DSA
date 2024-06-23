/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);

        // Read number of test cases
        int T = sc.nextInt();

        // Process each test case
        for (int t = 0; t < T; t++) {
            // Read size of array
            int N = sc.nextInt();
            int[] array = new int[N];

            // Read array elements
            for (int i = 0; i < N; i++) {
                array[i] = sc.nextInt();
            }

            // Calculate frequencies
            Map<Integer, Integer> frequencyMap = new HashMap<>();
            for (int num : array) {
                frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
            }

            // Create a max-heap (priority queue) with custom comparator
            PriorityQueue<Map.Entry<Integer, Integer>> maxHeap = new PriorityQueue<>(
                    (a, b) -> {
                        if (!a.getValue().equals(b.getValue())) {
                            return b.getValue() - a.getValue();
                        } else {
                            return a.getKey() - b.getKey();
                        }
                    }
            );

            // Add all entries from the frequency map to the heap
            maxHeap.addAll(frequencyMap.entrySet());

            // Create a list to store the elements according to their frequencies
            List<Integer> result = new ArrayList<>();

            // Extract elements from the heap and add them to the list based on their frequencies
            while (!maxHeap.isEmpty()) {
                Map.Entry<Integer, Integer> entry = maxHeap.poll();
                int element = entry.getKey();
                int frequency = entry.getValue();

                for (int i = 0; i < frequency; i++) {
                    result.add(element);
                }
            }

            // Print the result for the current test case
            for (int element : result) {
                System.out.print(element + " ");
            }
            System.out.println();
        }

	}
}