package org.leetCode;

import java.util.*;
import java.util.stream.Collectors;

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

    static int search(int arr[], int x) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x)
                return i;
        }
        return -1;
    }

    void reverseInGroups(ArrayList<Long> arr, int k) {
        List<Long> list = new ArrayList<>(arr);
        if (list.size() < k) {
            Collections.reverse(list);
        } else {
            for (int i = 0; i < arr.size(); i += k) {
                int end = Math.min(i + k, arr.size());
                Collections.reverse(list.subList(i, end));

            }
        }
    }

    public static boolean isSubset(int a[], int b[]) {
        Set<Integer> set = new HashSet<>();
        for (int i : a) {
            set.add(i);
        }

        for (int i : b) {

            if (!set.contains(b)) {
                return false;
            }
        }
        return true;
    }


    public void immediateSmaller(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                System.out.print(arr[i + 1] + " ");
            } else {
                System.out.print("-1 ");
            }
        }
    }

    public int[] minAnd2ndMin(int arr[]) {

        int n = arr.length;
        if (n < 2) return new int[]{-1};
        Arrays.sort(arr);
        for (int i = 1; i < n; i++) {
            if (arr[i] != arr[0]) {
                return new int[]{arr[0], arr[i]};
            }
        }
        return new int[]{-1};
    }

    public List<Integer> valueEqualToIndex(List<Integer> nums) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) == i + 1) {
                result.add(nums.get(i));
            }
        }

        return result;
    }

    public void countFreq(int[] arr) {
        HashMap<Integer, Integer> count = new HashMap<>();
        for (int i : arr) {
            count.put(i, count.getOrDefault(i, 0));
        }
    }

    public void swapKth(List<Integer> arr, int k) {
        int n = arr.size();
        if (k > n) {
            throw new IllegalArgumentException("k is larger than the size of the list");
        }
        int temp = arr.get(k - 1);
        arr.set(k - 1, arr.get(n - k));
        arr.set(n - k, temp);
    }

    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int[] right = new int[n];
        int[] left = new int[n];
        left[0] = 1;
        for (int i = 1; i < n; i++) {
            left[i] = left[i - 1] * nums[i - 1];
        }
        //  1 2 3 4 5 6  n = 6
        right[n - 1] = 1; // right[5] = 1
        for (int i = n - 2; i >= 0; i--) {             //  i = 4 ;
            right[i] = right[i + 1] * nums[i + 1]; // right[4] = right[5] * 5 = 5 ,

        }

        return nums;
    }

    public int firstMissingPositive(int[] nums) {
        int expected = 1;
        int n = nums.length;
        Arrays.sort(nums);
        for (int i = 0; i < n; i++) {
            if (nums[i] < expected) {
                continue;
            }
            if (nums[i] == expected) {
                expected++;
            } else if (nums[i] > expected) {
                return expected;
            }
        }
        return expected;
    }

    public static boolean isSubsequence(String s, String t) {
        int i = 0, j = 0;
        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
            j++;
        }
        return i == s.length();
    }

    public String reverseWords(String s) {
        int r = 0;
        String[] str = s.split("\\s+");
        String[] rev = new String[str.length];
        for (int i = str.length - 1; i >= 0; i--) {
            rev[i] = str[i];
        }
        return rev.toString();
    }


    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums); // Sort the array

        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue; // Skip duplicates for the first element
            }

            int left = i + 1, right = nums.length - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;

                    // Skip duplicates for the second and third elements
                    while (left < right && nums[left] == nums[left - 1]) {
                        left++;
                    }
                    while (left < right && nums[right] == nums[right + 1]) {
                        right--;
                    }
                } else if (sum < 0) {
                    left++; // Move the left pointer to increase the sum
                } else {
                    right--; // Move the right pointer to decrease the sum
                }
            }
        }

        return result;
    }

    public String longestPalindrome(String s) {
        char[] ch = s.toCharArray();
        return "";

    }

    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int left = 0, maxlen = 0;
        for (int right = 0; right < s.length(); right++) {
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            maxlen = Math.max(maxlen, right - left + 1);
        }

        return maxlen;
    }


    public static String compressString(String s) {

        StringBuilder result = new StringBuilder();
        int count = 1;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                count++;
            } else {
                result.append(s.charAt(i - 1)).append(count);
                count = 1;
            }
        }
        result.append(s.charAt(s.length() - 1)).append(count);
        return result.toString();


    }

    public static Character firstNonRepeatingChar(String s) {

        Map<Character, Integer> count = new HashMap<>();
        for (char ch : s.toCharArray()) {
            count.put(ch, count.getOrDefault(ch, 0) + 1);
        }
        System.out.println(count);

        for (Map.Entry<Character, Integer> entry : count.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return null;
    }


    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> mapS = new HashMap<>();
        Map<Character, Character> mapT = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            if (mapS.containsKey(c1)) {
                if (mapS.get(c1) != c2) return false;
            } else {
                mapS.put(c1, c2);
            }

            if (mapT.containsKey(c2)) {
                if (mapT.get(c2) != c1) return false;
            } else {
                mapT.put(c2, c1);
            }

        }

        return true;
    }

    public boolean containsNearbyDuplicate(int[] nums, int k) {

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i]) && i - map.get(nums[i]) <= k) {
                return true;
            }
            map.put(nums[i], i);
        }

        return false;
    }


    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            map.computeIfAbsent(key, k -> new ArrayList<>()).add(s);
        }
        return new ArrayList<>(map.values());
    }

    public static final String BASE_URL = "http://sort.url/";
    Map<String, String> urlMap = new HashMap<>();

    public String encode(String longUrl) {
        String key = String.valueOf(longUrl.hashCode());
        urlMap.put(key, longUrl);
        return BASE_URL + key;

    }

    public static void employee() {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("HR", 50000.0, "Alice", 1));
        employees.add(new Employee("IT", 60000.0, "Bob", 2));
        employees.add(new Employee("Finance", 55000.0, "Charlie", 3));
        employees.add(new Employee("Marketing", 52000.0, "Diana", 4));
        employees.add(new Employee("Sales", 58000.0, "Eve", 5));
        employees.add(new Employee("IT", 61000.0, "Frank", 6));
        employees.add(new Employee("HR", 53000.0, "Grace", 7));
        employees.add(new Employee("Finance", 57000.0, "Hank", 8));

        Map<String, Double> highSalary = employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.collectingAndThen(
                                Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)),
                                emp -> emp.map(Employee::getSalary).orElse(0.0)
                        )
                ));

        double maxSal = employees.stream().mapToDouble(Employee::getSalary).max().orElse(0.0);
    }


//    while(i < n){
//        if (Character.isDigit(st.charAt(i))){
//            int nums = 0;
//            while(i < n && Character.isDigit(st.charAt(i))){
//                nums = nums * 10 + (st.charAt(i) - '0');
//                i++;
//            }
//
//        }
//    }


    public static int secLarg(String st) {
//        Set<Integer> digit = new TreeSet<>(Collections.reverseOrder());
//        int n = st.length();
//        int i = 0;
//        for (char ch : st.toCharArray()) {
//            if (Character.isDigit(ch)) {
//                digit.add(ch - '0');
//            }
//        }
        TreeSet<Integer> digit = st.chars()
                .filter(Character::isDigit)
                .map(c -> c - '0')
                .boxed()
                .collect(Collectors.toCollection(
                        () -> new TreeSet<>(Collections.reverseOrder())
                ));

        Iterator<Integer> it = digit.iterator();
        if (digit.size() < 2) {
            return -1;
        }
        it.next();
        return it.next();
    }

    public int search1(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        int mid = left + (right - left) / 2;
        while (left <= right) {
            if (target == nums[mid]) return mid;

            //Check for left half if target is at left ?
            if (nums[left] <= nums[mid]) {
                if (nums[left] < target && target < nums[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else {
                // right is sorted
                if (nums[mid] < target && target < nums[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }
        return -1;
    }

    public static void rotate(int[] nums, int k) {
        k %= nums.length;
    }

    public static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

//    Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
//    Output: [1,2,2,3,5,6]
//    Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
//    The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;
        int[] num3 = new int[k];
        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j];
            }

        }
        while (j > 0) {
            nums1[k--] = nums2[j--];
        }

    }

    public int[] twoSum(int[] numbers, int target) {        //        numbers = [2,7,11,15], target = 9


        for (int i = 0; i < numbers.length - 1; i++) {
            int diff = target - numbers[i];
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] == diff) {
                    return new int[]{i + 1, j + 1};
                }
            }
        }
        return new int[]{};

    }

    public int[] twoSumTwoPointer(int[] numbers, int target) {        //        numbers = [2,7,11,15], target = 9
        int left = 0;
        int right = numbers.length - 1;
        while (left < right) {
            int sum = numbers[left] + numbers[right];
            if (sum == target) {
                return new int[]{left + 1, right};
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        return new int[]{};
    }


    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int t = 3;
//        twoSum(arr, t);
        

    }


}

























