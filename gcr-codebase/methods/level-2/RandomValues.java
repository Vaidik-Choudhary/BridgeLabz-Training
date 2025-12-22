class RandomValues {

    //Method to generate array of 4 digit random numbers
    public static int[] generateRandomArray(int size) {
        int[] numbers = new int[size];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int)(Math.random() * 9000) + 1000;
        }
        return numbers;
    }

    //Method to find average, minimum and maximum of array
    public static double[] findAverageMinMax(int[] numbers) {
        int min = numbers[0];
        int max = numbers[0];
        int sum = 0;

        for (int num : numbers) {
            sum += num;
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        double average = (double) sum / numbers.length;
        return new double[]{average, min, max};
    }

    public static void main(String[] args) {

        int[] numbers = generateRandomArray(5);

        System.out.println("Generated Numbers:");
        for (int num : numbers) {
            System.out.println(num);
        }

        double[] result = findAverageMinMax(numbers);

        System.out.println("Average: " + result[0]);
        System.out.println("Minimum: " + result[1]);
        System.out.println("Maximum: " + result[2]);
    }
}
