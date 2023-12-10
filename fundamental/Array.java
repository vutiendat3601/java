package fundamental;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        // Array is a object type, so it could be assigned to null
        int[] nums = null;
        nums = new int[] {}; // Empty array

        int[] nums2 = { 1, 2, 3, 4 }; // This initialization only be used in initializers;
        nums2 = new int[] { 1, 2, 3 };

        int[] nums2Copy = nums2; // This is not copy the nums2 array
        nums2[0] = -1;
        System.out.println(nums2[0]); // -1
        System.out.println(nums2Copy[0]); // -1

        nums2Copy = Arrays.copyOf(nums2, nums2.length); // Copy array
        nums2[0] = 1;
        System.out.println(nums2[0]); // 1
        System.out.println(nums2Copy[0]); // -1

        System.out.println("Length: " + nums.length);
        System.out.println(Arrays.toString(nums2));
        System.out.println(Arrays.toString(nums2Copy));
    }
}
