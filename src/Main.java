import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] array = new int[][]{{7, 2, 4, 5}, {6, 9, 8, 65, 87}};
        for (int i = 0; i < array.length; i++) {
            Arrays.sort(array[i]);
            for (int j = 0; j < array[i].length; j++){

                System.out.println(String.format("Ellement with index i [%d] and j [%d] is %d", i, j, array[i][j]));
        }
    }

}
}