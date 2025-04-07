package org.leetCode;

import java.util.*;

public class Main {


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
        }else{
            for(int i =0 ; i < arr.size(); i+=k){
                int end = Math.min(i+k, arr.size());
                Collections.reverse(list.subList(i, end));

            }
        }
    }

    public static boolean isSubset(int a[], int b[]) {
       Set<Integer> set = new HashSet<>();
       for(int  i :  a){
           set.add(i);
       }

       for(int i : b){

           if( !set.contains(b)){
               return false;
           }
       }
         return true;
    }


    public void immediateSmaller(int arr[]) {
        for(int i = 0; i < arr.length -1 ; i++){
            if(arr[i] > arr[i+1]){
                System.out.print(arr[i+1] + " ");
            }else{
                System.out.print("-1 ");
            }
        }
    }

    public int[] minAnd2ndMin(int arr[]) {

        int n = arr.length;
        if(n<2) return new int[]{-1};
        Arrays.sort(arr);
        for(int i = 1;i<n;i++){
            if(arr[i]!=arr[0]){
                return new int[]{arr[0],arr[i]};
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

        return result ;
    }

    int convertfive(int num) {
        String numStr = String.valueOf(num);
        numStr = numStr.replace("0","5");

           return Integer.parseInt(numStr);
    }

    public void countFreq(int[] arr){
        HashMap<Integer,Integer> count = new HashMap<>();
        for(int i : arr){
            count.put(i,count.getOrDefault(i,0));
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

    public static void main(String[] args) {
        int[] a = {9, 1, 30, 40, 5, 6, 7};
        int k = 2;
        int lastK = a.length - k;
        int firstK = k - 1;

       int temp = a[lastK];
       a[lastK] = a[firstK];
        a[firstK] = temp;
        System.out.println(Arrays.toString(a)); // Output: "15400"




    }


}