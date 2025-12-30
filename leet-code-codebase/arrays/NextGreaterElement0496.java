class NextGreaterElement0496 {

    //Method to find next greater element
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length];

        for (int i = 0; i < nums1.length; i++) {
            int j;
            boolean found = false;

            for (j = 0; j < nums2.length; j++) {
                if (nums2[j] == nums1[i]) {
                    break;
                }
            }

            for (j = j + 1; j < nums2.length; j++) {
                if (nums2[j] > nums1[i]) {
                    result[i] = nums2[j];
                    found = true;
                    break;
                }
            }

            if (!found) {
                result[i] = -1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = {4,1,2};
        int[] nums2 = {1,3,4,2};

        int[] ans = nextGreaterElement(nums1, nums2);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}
