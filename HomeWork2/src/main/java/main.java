public class main {
    public static void main (String[] args) {

        int[] arrOne = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arrOne.length; i++) {
            arrOne[i] = arrOne[i] == 1 ? 0 : 1;
            System.out.print(arrOne[i] + " ");
        }

        System.out.print("\n");
        int[] arrTwo = new int[8];
        for (int i = 1, j = 0; i < arrTwo.length; i++) arrTwo[i] = j += 3;
        for (int x : arrTwo) System.out.print(x + " ");

        System.out.print("\n");
        int[] arrThree = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arrThree.length; i++) {
            if (arrThree[i] < 6) arrThree[i] *= 2;
            System.out.print(arrThree[i] + " ");
        }

        System.out.print("\r\n");
        int[][] arrFour = new int[5][5];
        for (int i = 0; i < arrFour.length; i++) {
            for (int j = 0, j2 = arrFour[i].length; j < arrFour[i].length; j++, j2--) {
                if (i == j || i == (j2 - 1)) arrFour[i][j] = 1;
                System.out.print(arrFour[i][j] + " ");
            }
            System.out.print("\n");
        }

    }

}