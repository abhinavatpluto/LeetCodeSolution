package org.leetCode;

import java.util.*;

public class Test {


//    int longestSubstring()
//
//for(int i =0 ; i < nums.length ; i++){
//        if(nums[i] == 1){
//            count++;
//            maxVal = Math.max(maxVal, count);
//        }else{
//            count = 0;
//        }
//        maxVal = maxVal
//    }

//count the zero
// if no of zeros  > k
// maxVal + k ;

    public static int longestSub(int[] nums, int k) {
        int left = 0;
        int maxLen = 0;
        int zeroCount = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == 0) {
                zeroCount++;
            }

            maxLen = Math.max(maxLen, i - left + 1);
        }
        System.out.println(maxLen);
        return maxLen;

    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static String revString(String str) {
        char[] ch = str.toCharArray();
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            char temp = ch[left];
            ch[left] = ch[right];
            ch[right] = ch[temp];

            left++;
            right--;
        }

        return new String(ch);

    }


//    Arrays.stream(str.split("\\s+)).max((a,b) -> Integer.compare(a.length , b.length))

    public boolean increasingTriplet(int[] nums) {

        int first = Integer.MAX_VALUE;
        int sec = Integer.MAX_VALUE;
        for (int i : nums) { // i =1  i = 2
            if (i <= first) { // true false
                first = i; // first = 1
            } else if (i <= sec) { //
                sec = i; // sec = 1
            } else {
                return true;
            }
        }

        return false;
    }

    public int missingNumber(int[] nums) {
        int expected = 0;
        Arrays.sort(nums);
        for (int num : nums) {
            if (num == expected) {
                expected++;

            } else {
                return expected;
            }
        }

        return expected;
    }

    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> missingNum = new ArrayList<>();
        int expected = 1;
        Arrays.sort(nums);
        for (int num : nums) {
            if (num == expected) {
                expected++;

            } else {
                missingNum.add(expected);
                expected++;

            }
        }
        return missingNum;
    }

    public long zeroFilledSubarray(int[] nums) {
        long result = 0;
        long count = 0;

        for (int num : nums) {
            if (num == 0) {
                count++;
                result += count;
            } else {
                count = 0;
            }
        }

        return result;
    }

    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int max = Integer.MIN_VALUE;

        Map<Integer, Integer> count = new HashMap<>();
        for (int num : nums) {
            count.put(num, count.getOrDefault(num, 0) + 1);
        }

        int majority = nums.length / 2;
        for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
            if (entry.getValue() > majority) {
                return entry.getKey();
            }
        }

        return -1;
    }

    public int[] productExceptSelf(int[] nums) {
        return nums;
    }

}

