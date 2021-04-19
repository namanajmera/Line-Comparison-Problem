import java.util.Scanner;

public class LineComparisonProblem {
    double x1, x2, y1, y2, p1, p2, t1, t2;; // line1 and line 2 points
    double line1_length, line2_length;
    public static Scanner sc = new Scanner(System.in);

    // for line1
    public double line1_point(double x1, double x2, double y1, double y2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;

        line1_length = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)); // formula for length find
        return line1_length;
    }

    // for line2
    public double line2_point(double p1, double p2, double t1, double t2) {
        this.p1 = p1;
        this.p2 = p2;
        this.t1 = t1;
        this.t2 = t2;

        line2_length = Math.sqrt(Math.pow(p2 - p1, 2) + Math.pow(t2 - t1, 2)); // formula for length find
        return line2_length;
    }

    public static void main(String[] args) {
        System.out.println("Welcome To Line Comparison Computation");
        LineComparisonProblem ob = new LineComparisonProblem();

        System.out.println("First line Configuration");
        System.out.println("Enter the co-ordinates of First Point x1 y1");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();

        System.out.println("Enter the co-ordinates of Second Point x2 y2");
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        double l1 = ob.line1_point(x1, x2, y1, y2); // paasing arguments
        System.out.println("lenght1 length: " + l1);

        System.out.println("Second line Configuration");
        System.out.println("Enter the co-ordinates of First Point x3 y3");
        int x3 = sc.nextInt();
        int y3 = sc.nextInt();

        System.out.println("Enter the co-ordinates of Second Point x4 y4");
        int x4 = sc.nextInt();
        int y4 = sc.nextInt();

        double l2 = ob.line2_point(x3, x4, y3, y4); // passing arguments
        System.out.println("lenth2 length: " + l2);

        // convert double to string for used compareTo java method
        String length1 = String.valueOf(l1);
        String length2 = String.valueOf(l2);

        double diff = length1.compareTo(length2); // java compareTo method used

        if (diff < 0) {
            System.out.println("length1 is less than length2 ");
        } else if (diff == 0) {
            System.out.println("length1 is equal to length2");
        } else if (diff > 0) {
            System.out.println("length1 is greater than length2");
        }
    }
}