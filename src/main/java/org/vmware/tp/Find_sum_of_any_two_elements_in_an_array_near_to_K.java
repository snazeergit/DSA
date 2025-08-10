package org.vmware.tp;

import java.util.Arrays;

/*
 * Find sum of any two numbers close to K
 */
public class Find_sum_of_any_two_elements_in_an_array_near_to_K {
    public static void main(String[] args) {

        int[] ar = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int l = 0, r = ar.length - 1, k = 7;
        int closestL = l, closestR = r, closestDif = Arrays.stream(ar).max().getAsInt();

        while (l < r) {
            int sum = ar[l] + ar[r];
            int dif = Math.abs(sum - k);
            if (sum == k) {
                System.out.println("Exact match found :" + ar[l] + ", " + ar[r]);
                return;
            }
            if (dif < closestDif) {
                closestDif = dif;
                closestL = l;
                closestR = r;
            } else if (sum < k) {
                l++;
            } else {
                r--;
            }
        }
        System.out.println("Nearest Pair: " + ar[closestL] + ", " + ar[closestR]);
    }
}

/*Array must be in sorted order preferably ascending*/