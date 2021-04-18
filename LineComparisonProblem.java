import java.util.Scanner;

public class LineComparisonProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First lines co-ordinates.");
        System.out.println("Enter the Co-ordinates of Line First - First Point:- ");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();

        System.out.println("Enter the Co-ordinates of  Line First - Second Point:- ");
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        // Finding the lenght of First Line
        double length1 = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        System.out.println("Length of line 1 is:- " + length1);

        System.out.println("Enter the Second lines co-ordinates.");
        System.out.println("Enter the Co-ordinates of Line Second - First Point:- ");
        int x3 = sc.nextInt();
        int y3 = sc.nextInt();

        System.out.println("Enter the Co-ordinates of Line Second - Second Point:- ");
        int x4 = sc.nextInt();
        int y4 = sc.nextInt();

        // Finding the lenght of Second Line
        double length2 = Math.sqrt(Math.pow((x4 - x3), 2) + Math.pow((y4 - y3), 2));

        System.out.println("Length of line 2 is:- " + length2);

        // Finding if lenght is equal or not:-
        // First we have to create the object of Double by putting length in it.

        Double len1 = new Double(length1);
        Double len2 = new Double(length2);

        if (len1.equals(len2)) {
            System.out.println("Both lines are equals.");
        } else {
            System.out.println("Lines are not equals.");
        }
    }
}