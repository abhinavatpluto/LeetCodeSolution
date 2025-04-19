package org.leetCode;

import java.util.PriorityQueue;

public class Solution {

    public static int BFS(int[] arr, int target) {

        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                // 123456 5
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;

    }


    // Kth largerst element
    public static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int num : nums) {
            minHeap.add(num);
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }
        return minHeap.peek();
    }

    public void occuranceOfStr(String str) {

    }


}
