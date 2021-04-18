import java.util.Scanner;

public class LineComparisonProblem {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // Line 1
        double length1 = Line1();

        // Line 2
        double length2 = Line2();

        Double len1 = new Double(length1);
        Double len2 = new Double(length2);

        System.out.println("Java compareTo method result = " + len1.compareTo(len2));
        System.out.println("Java equals method result = " + len1.equals(len2));

    }

    public static double Line1() {
        System.out.println("First line Configuration");
        System.out.println("Enter the co-ordinates of First Point x1 y1");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();

        System.out.println("Enter the co-ordinates of Second Point x2 y2");
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }

    public static double Line2() {
        System.out.println("Second line Configuration");
        System.out.println("Enter the co-ordinates of First Point x3 y3");
        int x3 = sc.nextInt();
        int y3 = sc.nextInt();

        System.out.println("Enter the co-ordinates of Second Point x4 y4");
        int x4 = sc.nextInt();
        int y4 = sc.nextInt();

        return Math.sqrt(Math.pow((x4 - x3), 2) + Math.pow((y4 - y3), 2));

    }
}