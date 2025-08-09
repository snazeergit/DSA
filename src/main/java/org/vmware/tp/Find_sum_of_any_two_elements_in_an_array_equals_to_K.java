package org.vmware.tp;

/*
 * Find sum of any two numbers equals to K
 */
public class Find_sum_of_any_two_elements_in_an_array_equals_to_K {
    public static void main(String[] args) {

        int[] ar = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int l = 0, r = ar.length - 1, k = 17;
        boolean flag=false;
        while (l < r) {
            if (ar[l] + ar[r] == k) {
                System.out.println("Match found");
                flag=true;
                System.out.println(ar[l]+" + "+ar[r]+" = " + k);
                break;
            } else if (ar[l] + ar[r] < k) {
                l++;
            }else {
                r--;
            }
        }
        if (!flag)
            System.out.println("Match not found");
    }
}

/*Array must be in sorted order preferably ascending*/