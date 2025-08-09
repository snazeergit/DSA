package org.vmware;

/*
 * Find sum of any two numbers equals to K
 */
public class Find_sum_of_any_two_elements_in_an_array_near_to_K {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int n = arr.length;
        int l = 0, r = n - 1, k = 11, max=Integer.MAX_VALUE;
        while (l < r) {
            if (arr[l] + arr[r] - k < max) {
                max=arr[l]+arr[r]-k;
            }
            if (arr[l] + arr[r] > k)  {
                r--;
            }else {
                l++;
            }
        }
        System.out.println("Nearest Pair: "+ arr[l-1]+", "+arr[r]);
       }
}

/*Array must be in sorted order preferably ascending*/