package org.leetCode;

import java.util.*;

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

    public static void occuranceOfStr(String str) {
        Map<Character, Integer> map = new HashMap<>();
        for (char i : str.toCharArray()) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

    //3415
    public static int maxProfit(int[] prices) {
        int maxP = 0;
        int minPr = Integer.MAX_VALUE;
        for (int price : prices) {
            // update the min price
            minPr = Math.min(price, minPr);
            maxP = Math.max(maxP, price - minPr);

        }


        return maxP;
    }

    public static int maxProduct(int[] arr) {
        // 1 2 3 4 5
        Arrays.sort(arr);

        int hig = arr[arr.length - 1];
        int secHigh = arr[arr.length - 2];
        int prod = hig * secHigh;

        return prod;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 5, 6, 7, 8, 8, 7};
        int count = 1;
        int maxCount = Integer.MIN_VALUE;
        int ele = 1;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                count++;
                maxCount = Math.max(maxCount, count);

            } else {
                count = 0;
            }
        }
        System.out.println(maxCount);
    }

    public static int lenOfLongIncSubArr(List<Integer> arr) {
        int count = 1;
        int maxCount = Integer.MIN_VALUE;
        int ele = 1;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) < arr.get(i + 1)) {
                count++;
                maxCount = Math.max(maxCount, count);

            } else {
                count = 1;
            }
        }

        return maxCount;
    }

    public static ArrayList<Integer> arranged(ArrayList<Integer> arr) {
//        Input: arr[] = [-1, 2, -3, 4, -5, 6]
//        Output: [2, -1, 4, -3, 6, -5]
        List<Integer> posNum = new ArrayList<>();
        List<Integer> negative = new ArrayList<>();
//        for (int i = 0; i < ; i++) {
//
//        }

        return new ArrayList<>();
    }

    public static int longestSub(int[] nums, int k) {
        int left = 0;
        int maxLen = 0;
        int zeroCount = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == 0) {
                zeroCount++;
            }

            while (zeroCount > k) {
                if (nums[left] == 0) {
                    zeroCount--;
                }
                left++;
            }
            maxLen = Math.max(maxLen, i - left + 1);
        }

        return maxLen;

    }

}




























