// Creating PensDivision class to divide pens among students
class PensDivision {
    public static void main(String[] args) {

        // Creating variables and Calculations
        int totalPens = 14;
        int numberOfStudents = 3;
        int pensPerStudent = totalPens / numberOfStudents;
        int remainingPens = totalPens % numberOfStudents;

        // Printing pens per student and remaining pens
        System.out.println("The Pen Per Student is " + pensPerStudent +" and the remaining pen not distributed is " + remainingPens);
    }
}