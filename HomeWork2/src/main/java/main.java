public class main {
    public static void main (String[] args) {

        int[] one = {1, 1, 0, 0, 0, 1, 1, 1, 0, 1};
        for (int i = 0; i < one.length; i++) {
            if (one[i] == 1) {
                one[i] = 0;
            } else {
                one[i] = 1;
            }
            System.out.print(one[i] + " ");
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

        System.out.println("\r\n");
        int[] arrFive = {10, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int min = arrFive[0], max = arrFive[0], indexMax = 0, indexMin = 0;
        for (int i = 0; i < arrFive.length; i++) {
            if (arrFive[i] > max) {
                max = arrFive[i];
                indexMax = i;
            }
            if (arrFive[i] < min) {
                min = arrFive[i];
                indexMin = i;
            }
            System.out.println("Max i " + indexMax + " value  = " + max);
            System.out.println("Мin i " + indexMin + " value  = " + min);
        }

        int[] arrSix = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("\r\nQuestion Six = " + checkBalance(arrSix));
        System.out.println("\r\n shift +3"); shift(arrSix, +3);
        System.out.println("\r\n shift -3"); shift(arrSix, -3);

    }

    private static boolean checkBalance(int[] arrParameter) {
        int leftSum, rightSum;
        for (int i = 0; i < arrParameter.length + 1; i++) {
            leftSum = 0;
            rightSum = 0;
            for (int j = 0; j < i; j++) {
                leftSum += arrParameter[j];
            }
            for (int j = i; j < arrParameter.length; j++) {
                rightSum += arrParameter[j];
            }
            if (leftSum == rightSum) return true;
        }
        return false;
    }
    private static void shift(int[] arrPref, int n) {
        for (int i : arrPref) System.out.print(i + " ");
        System.out.println("\r\n");
        if (n > 0) {
            for (int x = 0; x < n; x++) {
                int addShift = arrPref[arrPref.length - 1];
                if (arrPref.length - 1 >= 0) System.arraycopy(arrPref, 0, arrPref, 1, arrPref.length - 1);
                arrPref[0] = addShift;
                for (int i : arrPref) System.out.print(i + " ");
                System.out.println();
            }
        }
        if (n < 0) {
            for (int x = 0; x > n; x--) {
                int addShift = arrPref[0];
                System.arraycopy(arrPref, 1, arrPref, 0, arrPref.length - 1);
                arrPref[arrPref.length - 1] = addShift;
                for (int i : arrPref) System.out.print(i + " ");
                System.out.print("\r\n");
            }
        }
    }

}