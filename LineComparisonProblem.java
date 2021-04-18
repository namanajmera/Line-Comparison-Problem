import java.util.Scanner;

public class LineComparisonProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Co-ordinates of First Point:- ");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();

        System.out.println("Enter the Co-ordinates of Second Point:- ");
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        double length = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));

        System.out.println("Length of line is:- " + length);
    }
}