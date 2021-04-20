public class LineEqualsCompare {
    void checkEqualsLine(double diff) {
        if (diff < 0) {
            System.out.println("length1 is less than length2 ");
        } else if (diff == 0) {
            System.out.println("length1 is equal to length2");
        } else if (diff > 0) {
            System.out.println("length1 is greater than length2");
        }
    }

}
