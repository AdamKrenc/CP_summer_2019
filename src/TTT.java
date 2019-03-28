public class TTT {
    public static void main(String[] args) {
        int[][] tictactoe = new int[3][3];

        int[] row1 = tictactoe[0];
        row1[0] = 1;
        row1[1] = -1;
        row1[2] = 1;

        int[] row2 = tictactoe[1];
        row2[0] = -1;
        row2[1] = 1;
        row2[2] = 1;

        int[] row3 = tictactoe[2];
        row3[0] = -1;
        row3[1] = 1;
        row3[2] = -1;

        boolean t1 = row1[0]==row1[1];
        boolean t2 = row1[0]==row1[2];
        boolean t3 = row1[1]==row1[2];
        boolean t4 = row1[0]==1;

        boolean T1 = t1 && t2 && t3 && t4;

        if (T1) {
            System.out.println("Player X wins");
        }

        boolean c1 = row1[0]==-1;

        boolean C1 = t1 && t2 && t3 && c1;

        if (C1) {
            System.out.println("Player O wins");
        }

        boolean t5 = row2[0]==row2[1];
        boolean t6 = row2[0]==row2[2];
        boolean t7 = row2[1]==row2[2];
        boolean t8 = row2[0]==1;
        boolean T2 = t5 && t6 && t7 && t8;

        if (T2) {
            System.out.println("Player X wins");
        }

        boolean c2 = row2[0]==-1;
        boolean C2 = t5 && t6 && t7 && c2;

        if (C2) {
            System.out.println("Player O wins");
        }

        boolean t9 = row3[0]==row3[1];
        boolean t10 = row3[0]==row3[2];
        boolean t11 = row3[1]==row3[2];
        boolean t12 = row3[0]==1;
        boolean T3 = t9 && t10 && t11 && t12;

        if (T3) {
            System.out.println("Player X wins");
        }

        boolean c3 = row3[0]==-1;
        boolean C3 = t9 && t10 && t11 && c3;

        if (C3) {
            System.out.println("Player O wins");
        }

        boolean w1 = row1[0]==row2[0];
        boolean w2 = row1[0]==row3[0];
        boolean w3 = row2[0]==row3[0];
        boolean w4 = row1[0]==1;
        boolean W1 = w1 && w2 && w3 && w4;

        if (W1) {
            System.out.println("Player X wins");
        }
        boolean v1 = row1[0]==-1;
        boolean V1 = w1 && w2 && w3 && v1;

        if (V1) {
            System.out.println("Player O wins");
        }

        boolean w5 = row1[1]==row2[1];
        boolean w6 = row1[1]==row3[1];
        boolean w7 = row2[1]==row3[1];
        boolean w8 = row1[1]==1;
        boolean W2 = w5 && w6 && w7 && w8;

        if (W2) {
            System.out.println("Player X wins");
        }
        boolean v2 = row1[1]==-1;
        boolean V2 = w5 && w6 && w7 && v2;

        if (V2) {
            System.out.println("Player O wins");
        }

        boolean w9 = row1[2]==row2[2];
        boolean w10 = row1[2]==row3[2];
        boolean w11 = row2[2]==row3[2];
        boolean w12 = row1[2]==1;
        boolean W3 = w9 && w10 && w11 && w12;

        if (W3) {
            System.out.println("Player X wins");
        }
        boolean v3 = row1[2]==-1;
        boolean V3 = w9 && w10 && w11 && v3;

        if (V3) {
            System.out.println("Player O wins");
        }

        boolean k1 = row1[0]==row2[1];
        boolean k2 = row1[0]==row3[2];
        boolean k3 = row2[1]==row3[2];
        boolean k4 = row1[0]==1;
        boolean K1 = k1 && k2 && k3 && k4;

        if (K1) {
            System.out.println("Player X wins");
        }

        boolean b1 = row1[0]==-1;
        boolean B1 = k1 && k2 && k3 && b1;

        if (B1) {
            System.out.println("Player O wins");
        }

        boolean k5 = row1[2]==row2[1];
        boolean k6 = row1[2]==row3[0];
        boolean k7 = row2[1]==row3[0];
        boolean k8 = row1[2]==1;
        boolean K2 = k5 && k6 && k7 && k8;

        if (K2) {
            System.out.println("Player X wins");
        }

        boolean b2 = row1[2]==-1;
        boolean B2 = k5 && k6 && k7 && b2;

        if (B2) {
            System.out.println("Player O wins");
        }

        boolean z1 = row1[0]==0;
        boolean z2 = row1[1]==0;
        boolean z3 = row1[2]==0;
        boolean z4 = row2[0]==0;
        boolean z5 = row2[1]==0;
        boolean z6 = row2[2]==0;
        boolean z7 = row3[0]==0;
        boolean z8 = row3[1]==0;
        boolean z9 = row3[2]==0;
        boolean Z = (z1 || z2 || z3 || z4 || z5 || z6 || z7 || z8 || z9) && !(T1 || T2 || T3 || C1 || C2 || C3 || W1 || W2 || W3 || V1 || V2 || V3 || K1 || K2 || B1 || B2);

        if (Z) {
            System.out.println("Game not yet finished");
        }

        boolean L = !Z && !(T1 || T2 || T3 || C1 || C2 || C3 || W1 || W2 || W3 || V1 || V2 || V3 || K1 || K2 || B1 || B2);

        if (L) {
            System.out.println("The game ended with a draw");
        }
        }


    }

