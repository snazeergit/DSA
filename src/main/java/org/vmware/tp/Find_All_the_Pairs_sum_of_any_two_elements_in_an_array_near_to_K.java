package org.vmware.tp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * Find all the pairs whose sum is close to K
 */
public class Find_All_the_Pairs_sum_of_any_two_elements_in_an_array_near_to_K {
    public static void main(String[] args) {
        int[] ar = {1, 4, 5, 7, 8, 11, 14};

        int l = 0, r = ar.length - 1, k = 20;
        int closestL = l, closestR = r, closestDif = Arrays.stream(ar).max().getAsInt();
        List<int[]> nearestPairs = new ArrayList<int[]>();

        while (l < r) {
            int sum = ar[l] + ar[r];
            int dif = Math.abs(sum - k);
            if (dif == 0) {
                System.out.println("Exact match found: " + ar[l] + ", " + ar[r]);
                return;
            }
            if (dif < closestDif) {
                nearestPairs.clear();
                nearestPairs.add(new int[]{ar[l], ar[r]});
                closestDif = dif;
            } else if (dif == closestDif) {
                nearestPairs.add(new int[]{ar[l], ar[r]});
            }
            if (sum > k) {
                r--;
            } else {
                l++;
            }
        }
        if (!nearestPairs.isEmpty()) {
            System.out.println("Nearest Pairs: ");
            for (int[] pair : nearestPairs) {
                System.out.println(pair[0] + ", " + pair[1]);
            }
        } else {
            System.out.println("No nearestPairs found !");
        }
    }
}

/*Array must be in sorted order preferably ascending*/