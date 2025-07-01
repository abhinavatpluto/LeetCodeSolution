package org.leetCode.starDust;

import java.util.Arrays;

public class Main {


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