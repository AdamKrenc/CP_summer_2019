public class TicTacToe {

    public static void main(String[] args) {
        int[][] ticktacktoe = new int[3][3];

        int[] row1 = ticktacktoe[0];
        row1[0] = 1;
        // 2nd row 3 col
        ticktacktoe[1][2] = -1;
        int[] row2 = ticktacktoe[1];
        //
        System.out.println(row2[2]);

        int[][] ticktack = new int[][] {
                new int[] { 1, 0, 0 },
                new int[] { 0, 1, 0 },
                new int[] { 1, 0, 0 },
        };


    }
}
