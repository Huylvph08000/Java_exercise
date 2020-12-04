package Question;

public class Question1 {
    public static void main(String[] args) {
        System.out.println(addTwoDigits(29));
    }
    private  static int addTwoDigits(int n) {
        int sum;
        for (sum = 0; n > 0; sum += n % 10, n /= 10);
        return sum;
    }
}
