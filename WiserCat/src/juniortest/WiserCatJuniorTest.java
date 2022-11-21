package juniortest;

public class WiserCatJuniorTest {
    public String makeMatrix(int[][] arr, int n, int m) {
        int row;
        int columns;
        int counter = 0;  // for correct rows drawing

        if (m != 0 && n != 0) { // check for the existence of a matrix
            for (int i = 0; i < n * m; i++) {
                row = i / m;
                columns = i % m;
                arr[row][columns] = row * columns; // filling the list
                if (counter != m) { // for correct rows drawing. If counter == columns, the program moves to a new row
                    counter++;
                    System.out.print(arr[row][columns] + "\t");
                } else {
                    counter = 1;
                    System.out.println();
                    System.out.print(arr[row][columns] + "\t");
                }

            }
        } else {
            throw new IllegalArgumentException("We can't make a matrix, due to one parameter equals 0");
        }
        return "";
    }

    public static void main(String[] args) {
        WiserCatJuniorTest test = new WiserCatJuniorTest();
        int[][] array = new int[100][100];
        System.out.println("Matrix with rows: 2 and columns 3: ");
        System.out.println(test.makeMatrix(array, 2, 3));
        System.out.println();

        System.out.println("Matrix with rows: 5 and columns 5: ");
        System.out.println(test.makeMatrix(array, 5, 5));
        System.out.println();

        System.out.println("Matrix with rows: 10 and columns 10: ");
        System.out.println(test.makeMatrix(array, 10, 10));
        System.out.println();

        System.out.println("Matrix with row: 0 and column 0: ");
        System.out.println(test.makeMatrix(array, 0, 0));
    }


}
