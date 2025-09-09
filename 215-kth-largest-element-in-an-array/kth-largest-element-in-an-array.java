import java.util.*;

class Solution {
    public int findKthLargest(int[] nums, int k) {
        int n = nums.length;
        return quickselect(nums, 0, n - 1, n - k);
    }

    private int quickselect(int[] nums, int left, int right, int kSmallest) {
        if (left == right) return nums[left];

        // Random pivot selection
        Random rand = new Random();
        int pivotIndex = left + rand.nextInt(right - left + 1);

        pivotIndex = partition(nums, left, right, pivotIndex);

        if (pivotIndex == kSmallest) {
            return nums[pivotIndex];
        } else if (pivotIndex < kSmallest) {
            return quickselect(nums, pivotIndex + 1, right, kSmallest);
        } else {
            return quickselect(nums, left, pivotIndex - 1, kSmallest);
        }
    }

    private int partition(int[] nums, int left, int right, int pivotIndex) {
        int pivot = nums[pivotIndex];
        swap(nums, pivotIndex, right); // move pivot to end
        int storeIndex = left;

        for (int i = left; i < right; i++) {
            if (nums[i] < pivot) {  // strictly < for kth largest
                swap(nums, storeIndex, i);
                storeIndex++;
            }
        }
        swap(nums, storeIndex, right); // move pivot to final place
        return storeIndex;
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
