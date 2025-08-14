package org.vmware.rw;

/*
 * Total Rain water trapped using 2 Pointers
 * */
public class RainWaterTrapped {
    public static void main(String[] args) {
        int[] height = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};

        int left = 0, right = height.length - 1;
        int leftMax = 0, rightMax = 0;
        int waterTrapped = 0;

        while (left < right) {
            if (height[left] < height[right]) {
                if (height[left] >= leftMax) {
                    leftMax = height[left];
                } else {
                    waterTrapped += leftMax - height[left];
                }
                left++;
            } else {
                if (height[right] >= rightMax) {
                    rightMax = height[right];
                } else {
                    waterTrapped += rightMax - height[right];
                }
                right--;
            }
        }
        System.out.println("Total water trapped : " + waterTrapped + " units");
    }
}

/*
Now let’s solve it using the most optimized approach

✅ Two Pointer Technique

We use two pointers (left, right) from both ends and two variables – leftMax, rightMax

📌 While left < right:

🔹 If height[left] is smaller:
    If it’s greater than leftMax, update it
    Else, water = leftMax - height[left]
    Move left++

🔹 Else:
    If height[right] is greater than rightMax, update it
    Else, water = rightMax - height[right]
    Move right—

That’s how we can solve it in one single pass, and without using extra space.
*/