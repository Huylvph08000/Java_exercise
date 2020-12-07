package Question;

public class At_the_Crossroads {
    public static void main(String[] args) {

    }

    //    QUESTION9
    boolean reachNextLevel(int experience, int threshold, int reward) {
        return (experience + reward >= threshold);
    }

    //   QUESTION10
    private static int knapsackLight(int value1, int weight1, int value2, int weight2, int maxW) {
        if (weight1 + weight2 <= maxW) {
            return value1 + value2;
        }

        if (Math.min(weight1, weight2) > maxW) {
            return 0;
        }
        if (weight1 <= maxW && (value1 >= value2 || weight2 > maxW)) {
            return value1;
        }
        return value2;
    }

    //    QUESTION11
    private static int extraNumber(int a, int b, int c) {
        int thirdNumber = 0;
        if (a != b && a != c) {
            thirdNumber = a;
        }
        if (b != a && b != c) {
            thirdNumber = b;
        }
        if (c != a && c != b) {
            thirdNumber = c;
        }
        return thirdNumber;
    }

}
