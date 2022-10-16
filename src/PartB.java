public class PartB {
    public static void main(String[] args) {
        int rows = 5, i = 1, j = 1;

        while (i <= rows) {
            j = 1;
        while (j <= i) {
            System.out.print("*");
            j++;

        }
            System.out.print("\n");
        i++;
        j = 1;
        }
        int row = 7;
        for (int a = rows -1; a >= 0; a--) {
            for (int b = 0; b <= a; b++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
        final int maxrow = 5;
        final int col = 5;

        for (int c = 1; c <= maxrow; c++) {
            for (int d = 1; d <= col; d++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
