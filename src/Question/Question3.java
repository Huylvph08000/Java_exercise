package Question;

public class Question3 {
    public static void main(String[] args) {

    }
  private static int candies(int n, int m) {
        int result = m / n;
        int finalResult = m - (m -(n * result));
        return finalResult;
    }
}
