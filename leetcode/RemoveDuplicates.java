public class RemoveDuplicates {
    public int removeDupes(int[] nums) {
        if (nums.length == 0) return 0;
        int uniqueIndex = 1;
        for (int i=1; i < nums.length; i++) {
            if (nums[i] != nums[uniqueIndex - 1]) {
                nums[uniqueIndex] = nums[i];
                uniqueIndex++;
            }
        }
        return uniqueIndex;
    }
    public static void main(String[] args) {
        RemoveDuplicates sol = new RemoveDuplicates();
        int[] nums = {1,1,2};
        int length = sol.removeDupes(nums);
        System.out.print("Length: " + length + ", Array: ");
        for (int i = 0; i < length; i++){
            System.out.print(nums[i] + " ");
        }
    }
}