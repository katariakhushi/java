class NegativeValueException extends Exception {
    public NegativeValueException(String message) {
        super(message);
    }
}

class OutOfRangeException extends Exception {
    public OutOfRangeException(String message) {
        super(message);
    }
}

public class AverageMarksCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.println("Enter the name of student 1:");
            String student1Name = scanner.nextLine();

            int[] student1Marks = getStudentMarks(scanner);

            System.out.println("Enter the name of student 2:");
            String student2Name = scanner.nextLine();

            int[] student2Marks = getStudentMarks(scanner);

            double student1Average = calculateAverage(student1Marks);
            double student2Average = calculateAverage(student2Marks);

            System.out.println(student1Name + "'s average marks: " + student1Average);
            System.out.println(student2Name + "'s average marks: " + student2Average);
        } catch (NegativeValueException | OutOfRangeException | NumberFormatException e) {
            System.out.println("Invalid input: " + e.getMessage());
        }
        System.out.println(" ");
        System.out.println("Mudit Gupta 4C9");
    }

    private static int[] getStudentMarks(Scanner scanner) throws NegativeValueException, OutOfRangeException {
        int[] marks = new int[3];

        for (int i = 0; i < marks.length; i++) {
            System.out.println("Enter the marks for subject " + (i + 1) + ":");
            int mark = Integer.parseInt(scanner.nextLine());

            if (mark < 0) {
                throw new NegativeValueException("Negative marks are not allowed.");
            } else if (mark < 0 || mark > 100) {
                throw new OutOfRangeException("Marks should be in the range of 0-100.");
            }

            marks[i] = mark;
        }

        return marks;
    }

    private static double calculateAverage(int[] marks) {
        int sum = 0;

        for (int mark : marks) {
            sum += mark;
        }

        return (double) sum / marks.length;
    }
}


