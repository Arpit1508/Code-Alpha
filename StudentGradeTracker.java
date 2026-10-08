import java.util.*;

class Student {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
}

public class StudentGradeTracker {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Student> students = new ArrayList<>();

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            System.out.print("Enter student name: ");
            String name = sc.next();

            System.out.print("Enter marks: ");
            int marks = sc.nextInt();

            students.add(new Student(name, marks));
        }

        int highest = students.get(0).marks;
        int lowest = students.get(0).marks;
        int total = 0;

        for (Student s : students) {

            total = total + s.marks;

            if (s.marks > highest) {
                highest = s.marks;
            }

            if (s.marks < lowest) {
                lowest = s.marks;
            }
        }

        double average = (double) total / n;

        System.out.println("\nStudent Report");

        for (Student s : students) {
            System.out.println(s.name + " : " + s.marks);
        }

        System.out.println("Average Marks = " + average);
        System.out.println("Highest Marks = " + highest);
        System.out.println("Lowest Marks = " + lowest);

        sc.close();
    }
}