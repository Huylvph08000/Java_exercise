package Question;

public class Question4 {
    public static void main(String[] args) {
seatsInTheater(16, 11, 5, 3);
    }
    private static int seatsInTheater(int nCols, int nRows, int col, int row) {
        int newCol = nCols  -  col  +  1;
        int rowNumber = nRows - row;
        int people = newCol * rowNumber;
        return people;
    }
}
