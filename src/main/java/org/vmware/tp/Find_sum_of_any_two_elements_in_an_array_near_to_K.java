package org.vmware.tp;

/*
 * Find sum of any two numbers close to K
 */
public class Find_sum_of_any_two_elements_in_an_array_near_to_K {
    public static void main(String[] args) {

        int[] ar = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int l = 0, r = ar.length - 1, k = 21, sum = 0, dif = 0;
        int closestL = -1, closestR = -1, closestDif = Integer.MAX_VALUE;

        while (l < r) {
            sum = ar[l] + ar[r];
            dif = Math.abs(sum - k);
            if (sum == k) {
                System.out.println("Exact match found :" + ar[l] + ", " + ar[r]);
                break;
            }
            if (dif < closestDif) {
                closestDif = dif;
                closestL = l;
                closestR = r;
            }
            if (sum > k) {
                r--;
            } else {
                l++;
            }
        }
        System.out.println("Nearest Pair: " + ar[closestL] + ", " + ar[closestR]);
    }
}

/*Array must be in sorted order preferably ascending*/