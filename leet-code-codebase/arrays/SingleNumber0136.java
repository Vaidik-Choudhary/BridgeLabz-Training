class SingleNumber0136 {

    //Method to find the single number
    public static int singleNumber(int[] nums) {
        int res = 0;
        for (int x : nums) {
            res = res ^ x;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {4, 1, 2, 1, 2};
        System.out.println(singleNumber(nums));
    }
}
