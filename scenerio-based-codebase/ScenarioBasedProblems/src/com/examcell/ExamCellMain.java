package com.examcell;

public class ExamCellMain {

	 // Merge Sort
    public static void mergeSort(Student[] students, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            mergeSort(students, left, mid);
            mergeSort(students, mid + 1, right);

            merge(students, left, mid, right);
        }
    }

    private static void merge(Student[] students, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        Student[] L = new Student[n1];
        Student[] R = new Student[n2];

        for (int i = 0; i < n1; i++)
            L[i] = students[left + i];

        for (int j = 0; j < n2; j++)
            R[j] = students[mid + 1 + j];

        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2) {
            if (L[i].score >= R[j].score) {
                students[k++] = L[i++];
            } else {
                students[k++] = R[j++];
            }
        }

        while (i < n1)
            students[k++] = L[i++];

        while (j < n2)
            students[k++] = R[j++];
    }

    public static void display(Student[] students) {
        int rank = 1;
        for (Student s : students) {
            System.out.println("Rank " + rank++ + " - Score: " + s.score);
        }
    }

    public static void main(String[] args) {

        Student[] students = {
            new Student(78),
            new Student(95),
            new Student(88),
            new Student(67),
            new Student(90)
        };

        System.out.println("Before Sorting:");
        display(students);

        mergeSort(students, 0, students.length - 1);

        System.out.println("\nAfter Sorting (Rank List):");
        display(students);
    }
}
