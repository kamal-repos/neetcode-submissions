class Solution {
    public int[] getConcatenation(int[] nums) {
        int length = nums.length;
        int[] newNums = new int[length * 2];
        for (int i = 0; i < length; i++) {
            newNums[i] = nums[i];
            newNums[i + length] = nums[i];
        }
        return newNums;
    }
}