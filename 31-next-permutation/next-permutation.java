import java.util.Arrays;

class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int pivot = -1;
        
        // Step 1: Find the pivot where nums[i] < nums[i+1] (rightmost such index)
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                pivot = i;
                break;
            }
        }

        if (pivot != -1) {
            // Step 2: Find the smallest number greater than nums[pivot] from the right
            for (int i = n - 1; i > pivot; i--) {
                if (nums[i] > nums[pivot]) {
                    // Swap the pivot with this number
                    swap(nums, i, pivot);
                    break;
                }
            }
        }

        // Step 3: Reverse the elements to the right of the pivot
        reverse(nums, pivot + 1, n - 1);
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }
}
