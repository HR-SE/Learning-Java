public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1; //pointer for nums1
        int p2 = n - 1; //pointer for nums2
        int p = m + n - 1; // pointer for merged array
        while (p2 >= 0 && p1 >= 0) {
            if (nums1[p1] > nums2[p2]) {
                nums1[p] = nums1[p1];
                p1--;
            } else {
                nums1[p] = nums2[p2];
                p2--;
            }
            p--;
        }
        while (p2 >= 0) {
            nums1[p] = nums2[p2];
            p2--;
            p--;
        }
    }
    public static void main (String[] args) {
        MergeSortedArray merge = new MergeSortedArray();
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;
        merge.merge(nums1, m, nums2, n);
        System.out.print("Merged: ");
        for (int num : nums1) {
            System.out.print(num + " ");
        }
    }
}