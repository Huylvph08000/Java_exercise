package Question;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
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

    //    QUESTION30
    int appleBoxes(int k) {
        int yellow = 0, red = 0;
        for (int i = 1; i <= k; i++) {
            if (i % 2 == 0) red = red + i * i;
            else yellow = yellow + i * i;
        }
        return red - yellow;
    }

    //    QUESTION31
    private static boolean increaseNumberRoundness(int n) {
        while (n % 10 == 0) {
            n = n / 10;
        }
        while (n % 10 != 0) {
            n = n / 10;
        }
        if (n != 0) return true;
        return false;
    }

    //    QUESTION31
    private static int rounders(int value) {
        int digit = 1;
        if (value < 10) {
            return value;
        }
        if (value % Math.pow(10, digit) >= 5) {
            value += Math.pow(10, digit);
            value -= (value % Math.pow(10, digit));
            digit += 1;
        }
        while (value > Math.pow(10, digit)) {
            if ((value % Math.pow(10, digit)) >= 5 * Math.pow(10, digit - 1)) {
                value += Math.pow(10, digit);
            }
            if (value >= Math.pow(10, digit)) {
                value -= (value % Math.pow(10, digit));
                digit += 1;
            }
        }
        return value;
    }

    //    QUESTION33
    int candles(int candlesNumber, int makeNew) {
        int total = 0;
        int leftover = 0;
        while (candlesNumber != 0) {
            total += candlesNumber;
            leftover += candlesNumber;
            candlesNumber = leftover / makeNew;
            leftover -= candlesNumber * makeNew;
        }
        return total;
    }

    //    QUESTION34
    int countBlackCells(int n, int m) {
        return n + m - 2 + gcd(n, m);
    }

    public static int gcd(int a, int b) {
        return a == 0 ? b : gcd(b % a, a);
    }

    //    QUESTION36
    int[] createArray(int size) {
        List<Integer> myList = new ArrayList<Integer>();
        for (int i = 0; i < size; i++) {
            myList.add(1);
        }
        int[] a = myList.stream().mapToInt(Integer::intValue).toArray();
        return a;
    }

    //    QUESTION37
    int[] arrayReplace(int[] inputArray, int elemToReplace, int substitutionElem) {
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] == elemToReplace) inputArray[i] = substitutionElem;
        }
        return inputArray;
    }

    //    QUESTION38
    int[] firstReverseTry(int[] arr) {
        if (arr.length == 0) return arr;
        int a = arr[0];
        arr[0] = arr[arr.length - 1];
        arr[arr.length - 1] = a;
        return arr;
    }

    //    QUESTION39
    int[] concatenateArrays(int[] a, int[] b) {
        List<Integer> myList = new ArrayList<Integer>();
        for (int i = 0; i < a.length; i++) {
            myList.add(a[i]);
        }
        for (int i = 0; i < b.length; i++) {
            myList.add(b[i]);
        }
        int[] c = myList.stream().mapToInt(Integer::intValue).toArray();
        return c;
    }

    //    QUESTION40
    int[] removeArrayPart(int[] inputArray, int l, int r) {
        List<Integer> myList = new ArrayList<Integer>();
        for (int i = 0; i < inputArray.length; i++) {
            if (l <= i && i <= r) {
            } else myList.add(inputArray[i]);
        }
        int[] a = myList.stream().mapToInt(Integer::intValue).toArray();
        return a;
    }

    //QUESTION41
    boolean isSmooth(int[] arr) {
        int a = arr.length, middle;
        middle = a % 2 != 0 ? arr[(a - 1) / 2] : arr[a / 2] + arr[a / 2 - 1];
        return (arr[0] == middle && middle == arr[a - 1]);
    }

    //    QUESTION42
    int makeArrayConsecutive2(int[] statues) {
        int m = statues.length;
        Arrays.sort(statues);
        int a = statues[0];
        int b = statues[m - 1];
        return (b - a + 1) - m;
    }

    //    QUESTION43
    boolean isPower(int n) {
        if (n == 1) return true;
        for (int a = 2; a <= Math.sqrt(n); a++) {
            for (int b = 2; b <= Math.sqrt(n); b++) {
                if (Math.pow(a, b) == n) return true;
            }
        }
        return false;
    }

    //    QUESTION44
    int isSumOfConsecutive2(int n) {
        int count = 0;
        for (int i = 1; i < n; i++) {
            int sum = i, j = 1;
            while (sum < n) {
                sum = sum + i + j;
                j++;
            }
            if (sum == n) count++;
        }
        return count;
    }

    //    QUESTION46
    int pagesNumberingWithInk(int current, int numberOfDigits) {
        int numberOfPages = 0;
        boolean outOfInk = false;
        int basePage = current;

        while (!outOfInk) {
            int digitsInCurrent = Integer.toString(current).length();
            numberOfDigits = numberOfDigits - digitsInCurrent;

            if (numberOfDigits < 0) outOfInk = true;
            else {
                current = current + 1;
                numberOfPages = numberOfPages + 1;
            }
        }

        return basePage + numberOfPages - 1;
    }

    //    QUESTION51
    String encloseInBrackets(String inputString) {
        return "(" + inputString + ")";
    }

    //    QUESTION52
    String properNounCorrection(String noun) {
        String output = noun.substring(0, 1).toUpperCase() + noun.substring(1).toLowerCase();
        return output;
    }

    //    QUESTION53
    boolean isTandemRepeat(String inputString) {
        return inputString.substring(0, inputString.length() / 2)
                + inputString.substring(0, inputString.length() / 2) == inputString;
    }

    //    QUESTION54
    boolean isCaseInsensitivePalindrome(String inputString) {
        inputString = inputString.toLowerCase();
        char[] arr = inputString.toCharArray();
        Collections.reverse(Arrays.asList(arr));
        String s = new String(arr);
        return inputString == s;
    }

    //    QUESTION55
    String findEmailDomain(String address) {
        return address.substring(address.lastIndexOf('@') + 1);
    }
//    QUESTION57
    boolean isMAC48Address(String inputString) {
        String[] parts = inputString.split("-");
        if(parts.length != 6) return false;
        for(String part : parts){
            char[] ch = part.toCharArray();
            if(ch.length != 2) return false;
            for(char c : ch){
                // !(A -> F)  && !(0 -> 9)
                if((c < 65 || c > 70) && (c < 48 || c > 57) )
                    return false;
            }
        }
        return true;
    }
}
