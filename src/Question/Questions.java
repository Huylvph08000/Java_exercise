package Question;

import java.util.ArrayList;
import java.util.List;

public class Questions {
    public static void main(String[] args) {

    }

    //    QUESTION1
    private static int addTwoDigits(int n) {
        int sum;
        for (sum = 0; n > 0; sum += n % 10, n /= 10) ;
        return sum;
    }

    //    QUESTION2
    private static int largestNumber(int n) {
        return ((int) Math.pow(10, n) - 1);
    }

    //    QUESTION3
    private static int candies(int n, int m) {
        int result = m / n;
        int finalResult = m - (m - (n * result));
        return finalResult;
    }

    //    QUESTION4
    private static int seatsInTheater(int nCols, int nRows, int col, int row) {
        int newCol = nCols - col + 1;
        int rowNumber = nRows - row;
        int people = newCol * rowNumber;
        return people;
    }

    //    QUESTION5
    private static int maxMultiple(int divisor, int bound) {
        var n = bound % divisor;
        return bound - n;
    }

    //    QUESTION6
    private static int circleOfNumbers(int n, int firstNumber) {
        if (n / 2 > firstNumber) return n / 2 + firstNumber;
        else return n / 2 - (n - firstNumber);
    }

    //    QUESTION7
    private static int lateRide(int n) {
        return n % 60 % 10 + n % 60 / 10 + n / 60 % 10 + n / 60 / 10 % 10;
    }

    //    QUESTION8
    private static int phoneCall(int min1, int min2_10, int min11, int s) {
        int result = 0;
        if (s - min1 < 0) return result;
        else {
            s = s - min1;
            result++;
            if (s / min2_10 <= 9) return result + s / min2_10;
            else {
                s = s - 9 * min2_10;
                return result + 9 + s / min11;
            }
        }
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

    //    QUESTION12
    private static boolean isInfiniteProcess(int a, int b) {
        if (b >= a && ((b - a) % 2 == 0)) {
            return false;
        } else return true;
    }

    //    QUESTION13
    private static boolean arithmeticExpression(int a, int b, int c) {
        if (a + b == c || a - b == c || a * b == c || (a % b == 0 && a / b == c)) return true;
        return false;
    }

    //QUESTION14
    boolean tennisSet(int score1, int score2) {
        boolean result = false;
        if ((Math.max(score1, score2) == 6 &&
                Math.max(score1, score2) - Math.min(score1, score2) >= 2) ||
                (Math.max(score1, score2) == 7 &&
                        Math.min(score1, score2) >= 5 &&
                        Math.min(score1, score2) < 7))
            result = true;
        else result = false;
        return result;
    }

    //QUESTION15
    private static boolean willYou(boolean young, boolean beautiful, boolean loved) {
        boolean result = true;
        if (young == true && beautiful == true && loved == false || loved == true && beautiful == false || loved == true && young == false) {
            result = true;
        } else result = false;

        return result;
    }
//    QUESTION16

    private static int[] metroCard(int lastNumberOfDays) {
        List<Integer> myList = new ArrayList<Integer>();
        if (lastNumberOfDays == 30 || lastNumberOfDays == 28) myList.add(31);
        if (lastNumberOfDays == 31) {
            myList.add(28);
            myList.add(30);
            myList.add(31);
        }
        int[] ints = myList.stream().mapToInt(Integer::intValue).toArray();
        return ints;
    }

    //    QUESTION25
    private static int leastFactorial(int n) {
        int gt = 1, i = 1;
        while (gt < n) {
            gt = gt * i;
            i++;
        }
        return gt;
    }

    //QUESTION26
    private static int countSumOfTwoRepresentations2(int n, int l, int r) {
        int a = 0, b = 0, count = 0;
        if (n - l > r) {
            a = n - r;
            b = r;
        } else {
            a = l;
            b = n - a;
        }
        while (a <= b && b <= r) {
            count++;
            a++;
            b--;
        }
        return count;
    }

    //QUESTION27
    private static int magicalWell(int a, int b, int n) {
        int result = 0;
        for (int i = 1; i <= n; i++) {
            result = result + a * b;
            a++;
            b++;
        }
        return result;
    }
}
