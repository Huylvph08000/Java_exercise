package Question;

public class Question2 {
    public static void main(String[] args) {
        System.out.println(largestNumber(2));
    }
   private static int largestNumber(int n) {
        return ((int)Math.pow(10, n)-1);
    }
}
