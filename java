import java.util.Scanner;

 class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get student name
        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        // Get number of subjects
        int n;
        while (true) {
            System.out.print("Enter number of subjects: ");
            n = sc.nextInt();
            if (n > 0) break;
            System.out.println("❌ Number of subjects must be greater than 0.");
        }

        int totalMarks = 0;
        int maxMarksPerSubject = 100;

        // Input marks
        for (int i = 0; i < n; i++) {
            int marks;
            while (true) {
                System.out.print("Enter marks for Subject " + (i + 1) + ": ");
                marks = sc.nextInt();
                if (marks >= 0 && marks <= maxMarksPerSubject) break;
                System.out.println("Invalid marks! Please enter between 0 and " + maxMarksPerSubject);
            }
            totalMarks += marks;
        }

        // Calculations
        int maxTotalMarks = n * maxMarksPerSubject;
        double percentage = (double) totalMarks / maxTotalMarks * 100;
        double cgpa = percentage / 9.5;

        // Grade logic (optional but cool)
        String grade;
        if (percentage >= 90) grade = "O";
        else if (percentage >= 80) grade = "A+";
        else if (percentage >= 70) grade = "A";
        else if (percentage >= 60) grade = "B+";
        else if (percentage >= 50) grade = "B";
        else grade = "F";

        // Output
        System.out.println("\n🎓 === Result Summary ===");
        System.out.println("Name            : " + name);
        System.out.println("Total Marks     : " + totalMarks + " out of " + maxTotalMarks);
        System.out.printf("Percentage      : %.2f%%\n", percentage);
        System.out.printf("Estimated CGPA  : %.2f / 10\n", cgpa);
        System.out.println("Grade           : " + grade);

        sc.close();
    }
}
