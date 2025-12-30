class FindDisappearedNumbers0448 {

    //Method to find missing numbers from 1 to n
    public static int[] findDisappearedNumbers(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int index = 0;

        for (int i = 1; i <= n; i++) {
            boolean found = false;

            for (int j = 0; j < n; j++) {
                if (nums[j] == i) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                result[index++] = i;
            }
        }

        int[] finalResult = new int[index];
        for (int i = 0; i < index; i++) {
            finalResult[i] = result[i];
        }

        return finalResult;
    }

    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        int[] ans = findDisappearedNumbers(nums);

        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}
