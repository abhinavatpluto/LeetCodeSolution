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

//    static int convertfive(int num) {
//      Char [] arr = String.valueOf(num).toCharArray();
//
//        for(int i = 0; i < arr.length; i++){
//            if(arr[i] == '0'){
//                arr[i] = '5';
//            }
//        }
//      return 0;
//    }

    public int[] minAnd2ndMin(int arr[]) {
       int min = Integer.MAX_VALUE;
         int secondMin = Integer.MAX_VALUE;
       for(int i = 0 ; i < arr.length; i++){
           if(arr[i] < min){
               min = arr[i];
           }
       }
       for(int i = 0;  i < arr.length; i++){
           if(arr[i] < secondMin && arr[i] != min){
               secondMin = arr[i];

           }
       }
        return new int[]{min, secondMin};
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

    public static void main(String[] args) {
        int[] a = {9, 1, 30, 40, 5, 6, 7};
        for (int i = 0; i< a.length; i++){
//            System.out.print(a[i] + " ");
            if(i == a[i]){
                System.out.print(a[i] + " ");
            }
        }

    }


}