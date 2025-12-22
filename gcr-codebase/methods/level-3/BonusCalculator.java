class BonusCalculator {

    //Method to generate salary and years of service for employees
    public static int[][] generateSalaryAndService(int employees) {

        int[][] data = new int[employees][2];

        for (int i = 0; i < employees; i++) {
            data[i][0] = (int) (Math.random() * 90000) + 10000;
            data[i][1] = (int) (Math.random() * 10) + 1;
        }
        return data;
    }

    //Method to calculate bonus and new salary of employees
    public static double[][] calculateBonusAndNewSalary(int[][] oldData) {

        double[][] newData = new double[oldData.length][2];

        for (int i = 0; i < oldData.length; i++) {

            int salary = oldData[i][0];
            int years = oldData[i][1];
            double bonus;

            if (years > 5)
                bonus = salary * 0.05;
            else
                bonus = salary * 0.02;

            newData[i][0] = bonus;
            newData[i][1] = salary + bonus;
        }
        return newData;
    }

    //Method to calculate and display total old salary, total bonus and total new salary
    public static void displayValues(int[][] oldData, double[][] newData) {

        double totalOldSalary = 0;
        double totalNewSalary = 0;
        double totalBonus = 0;

        System.out.println("No.\tOldSalary\tYears\tBonus\t\tNewSalary");

        for (int i = 0; i < oldData.length; i++) {

            totalOldSalary += oldData[i][0];
            totalBonus += newData[i][0];
            totalNewSalary += newData[i][1];

            System.out.println((i + 1) + "\t" +
                    oldData[i][0] + "\t\t" +
                    oldData[i][1] + "\t" +
                    newData[i][0] + "\t" +
                    newData[i][1]);
        }

        System.out.println("\nTotal Old Salary : " + totalOldSalary);
        System.out.println("Total Bonus Paid : " + totalBonus);
        System.out.println("Total New Salary : " + totalNewSalary);
    }

    public static void main(String[] args) {

        int employees = 10;

        int[][] salaryAndService = generateSalaryAndService(employees);
        double[][] bonusAndNewSalary = calculateBonusAndNewSalary(salaryAndService);

        displayValues(salaryAndService, bonusAndNewSalary);
    }
}
