package org.vmware.tp;

/*
 * Find sum of any two numbers equals to K
 */
public class BruteForceApproach {

    public static void main(String[] args) {
        int[] ar = {1, 2, 4, 5, 7, 8};
        int k = 12;
        for (int i = 0; i < ar.length; i++) {
            for (int j = 1; j < ar.length; j++) {
                if (ar[i] + ar[j] == k & i != j) {
                    System.out.println("Match Found !");
                    System.out.println(ar[i] + ", " + ar[j]);
                    return;
                }
            }
        }
    }
}
