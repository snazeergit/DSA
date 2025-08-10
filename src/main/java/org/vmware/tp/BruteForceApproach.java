package org.vmware.tp;

/*
 * Find sum of any two numbers equals to K
 */
public class BruteForceApproach {

    public static void main(String[] args) {
        int[] ar = {1, 2, 4, 5, 7, 8};
        int k = 12;
        boolean flag = false;
        for (int i = 0; i < ar.length; i++) {
            for (int j = 1; j < ar.length; j++) {
                if (ar[i] + ar[j] == k & i != j) {
                    System.out.println("Exact match found !");
                    System.out.println(ar[i] + ", " + ar[j]);
                    flag = true;
                    return;
                }
            }
        }
        if (!flag)
            System.out.println("Oops! No match found!");
    }
}

//time complexity O(n^2)

//1,2 1,4 1,5 1,7 1,8
//2,4 2,5 2,7 2,8
//4,5 4,7 4,8
//5,7 5,8
//7,8

//broot force: 36 pairs
//better : 15 pairs