import java.util.Scanner;

class StudentMarks {

    public static String determineGrade(double percentage) {
        if (percentage >= 90) {
            return "A+";
        } else if (percentage >= 80) {
            return "A";
        } else if (percentage >= 70) {
            return "B";
        } else if (percentage >= 60) {
            return "C";
        } else if (percentage >= 50) {
            return "D";
        } else {
            return "F";
        }
    }

    public static void studentMarks() {
        Scanner sc = new Scanner(System.in);
        int n;

        do {
            System.out.print("Enter number of subjects (0 to exit): ");
            n = sc.nextInt();

            if (n == 0) {
                System.out.println("Exiting program.");
                break;
            }

            double[] marks = new double[n];
            double total = 0.0;

            for (int i = 0; i < n; i++) {
                System.out.print("Enter marks for subject " + (i + 1) + ": ");
                marks[i] = sc.nextDouble();
                total += marks[i];
            }

            double percentage = total / n;

            System.out.println("Total Marks: " + total);
            System.out.println("Percentage: " + percentage + "%");
            System.out.println("Grade: " + determineGrade(percentage));

        } while (n != 0);

        sc.close();
    }

    public static void main(String[] args) {
        studentMarks();
    }
}
