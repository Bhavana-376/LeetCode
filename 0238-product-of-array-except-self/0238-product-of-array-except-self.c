/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* productExceptSelf(int* nums, int numsSize, int* returnSize) {
    int prod = 1,zeroCount = 0;
    for(int i=0;i<=numsSize-1;i++)
    {
        if (nums[i] != 0) {
            prod = prod * nums[i];
        } else {
            zeroCount++;
        }
    }
    for(int i=0;i<=numsSize-1;i++)
    {
        if (zeroCount > 1) {
            nums[i] = 0;  // More than one zero, all products are zero
        } else if (zeroCount == 1) {
            nums[i] = (nums[i] == 0) ? prod : 0;  // Single zero
        } else {
            nums[i] = prod / nums[i];  // No zeros, safe to divide
        }
    }
    *returnSize = numsSize; // Set returnSize
    return nums;
}