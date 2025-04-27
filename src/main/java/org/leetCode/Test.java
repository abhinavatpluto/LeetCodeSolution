package org.leetCode;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

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
        int[] arr = {0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1};

        String st = "aa adfd sdfsdf sfgsfg";
        Optional<String> str = Arrays.stream(st.split("\\s+")).max((a, b) -> Integer.compare(a.length(), b.length()));
        System.out.println();
//        System.out.println(;
        longestSub(arr, 3);
    }


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
//    Arrays.stream(str.split("\\s+)).max((a,b) -> Integer.compare(a.length , b.length))

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
        return null;
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

}

