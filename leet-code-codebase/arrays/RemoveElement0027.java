import java.util.Scanner;

class RemoveElement0027 {

    //Method to remove all occurrences of a given value and return new length
    public static int removeElement(int[] nums, int val) {
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[count] = nums[i];
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        for (int i = 0; i < nums.length; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            nums[i] = sc.nextInt();
        }

        System.out.print("Enter value to remove: ");
        int val = sc.nextInt();

        int length = removeElement(nums, val);

        System.out.println("New length after removing element: " + length);
        System.out.print("Updated array: ");

        for (int i = 0; i < length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
