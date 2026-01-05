import java.util.*;

public class StudentAttendanceSystem {

    Queue<Integer> queue = new LinkedList<>();
    HashSet<Integer> set = new HashSet<>();
    Stack<Integer> stack = new Stack<>();

    void addAttendance(int studentId) {
        if (set.contains(studentId)) {
            System.out.println("Student already marked present.");
            return;
        }
        queue.add(studentId);
        set.add(studentId);
        stack.push(studentId);
        System.out.println("Attendance added for Student ID: " + studentId);
    }

    void checkAttendance(int studentId) {
        if (set.contains(studentId)) {
            System.out.println("Student " + studentId + " is present.");
        } else {
            System.out.println("Student " + studentId + " is absent.");
        }
    }

    void undoAttendance() {
        if (stack.isEmpty()) {
            System.out.println("No attendance to undo.");
            return;
        }
        int lastStudent = stack.pop();
        set.remove(lastStudent);
        queue.remove(lastStudent);
        System.out.println("Last attendance removed for Student ID: " + lastStudent);
    }

    void showAttendance() {
        if (queue.isEmpty()) {
            System.out.println("No students present.");
            return;
        }
        List<Integer> list = new ArrayList<>(queue);
        System.out.println("Attendance List:");
        for (int id : list) {
            System.out.println("Student ID: " + id);
        }
    }

    void showCount() {
        System.out.println("Total students present: " + set.size());
    }

    void viewLastAttendance() {
        if (stack.isEmpty()) {
            System.out.println("No attendance marked yet.");
        } else {
            System.out.println("Last marked Student ID: " + stack.peek());
        }
    }

    void clearAttendance() {
        queue.clear();
        set.clear();
        stack.clear();
        System.out.println("All attendance cleared.");
    }

    public static void main(String[] args) {

        StudentAttendanceSystem system = new StudentAttendanceSystem();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\nStudent Attendance Management System");
            System.out.println("1. Add Attendance");
            System.out.println("2. Check Attendance");
            System.out.println("3. Undo Last Attendance");
            System.out.println("4. Show Attendance");
            System.out.println("5. Show Present Count");
            System.out.println("6. View Last Attendance");
            System.out.println("7. Clear All Attendance");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Student ID: ");
                    system.addAttendance(sc.nextInt());
                    break;
                case 2:
                    System.out.print("Enter Student ID: ");
                    system.checkAttendance(sc.nextInt());
                    break;
                case 3:
                    system.undoAttendance();
                    break;
                case 4:
                    system.showAttendance();
                    break;
                case 5:
                    system.showCount();
                    break;
                case 6:
                    system.viewLastAttendance();
                    break;
                case 7:
                    system.clearAttendance();
                    break;
                case 8:
                    System.out.println("Exiting program...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
