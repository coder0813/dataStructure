package org.dataStructure.sparseArray;

public class SparseArray {

    public static void main(String[] args) {
        int[][] chessArray = creatChessArray();
        output2DArray(chessArray);

        int[][] spareArray = creatSpareArray(chessArray);
        output2DArray(spareArray);
        int[][] recoverySpareArrayTo2DArray = recoverySpareArrayTo2DArray(spareArray);
        output2DArray(recoverySpareArrayTo2DArray);
    }


    public static int[][] creatChessArray() {
        int[][] chessArray = new int[11][11];
        chessArray[1][1] = 1;
        chessArray[3][4] = 2;
        chessArray[8][7] = 1;
        return chessArray;

    }

    public static void output2DArray(int[][] chessArray) {
        for (int[] innerArray : chessArray) {
            for (int inner : innerArray) {
                System.out.printf("%d\t", inner);
            }
            System.out.println();
        }
    }

    public static int[][] creatSpareArray(int[][] chessArray) {
        int sum = 0;
        for (int[] innerArray : chessArray) {
            for (int inner : innerArray) {
                if (inner != 0) {
                    sum++;
                }
            }
        }
        int[][] spareArray = new int[sum + 1][3];
        spareArray[0][0] = 11;
        spareArray[0][1] = 11;
        spareArray[0][2] = sum;

        int count = 0;
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                if (chessArray[i][j] != 0) {
                    count++;
                    spareArray[count][0] = i;
                    spareArray[count][1] = j;
                    spareArray[count][2] = chessArray[i][j];
                }
            }
        }
        return spareArray;
    }

    public static int[][] recoverySpareArrayTo2DArray(int[][] spareArray) {
        int[][] array = new int[spareArray[0][0]][spareArray[0][1]];
        for (int i = 1; i < spareArray.length; i++) {
            array[spareArray[i][0]][spareArray[i][1]] = spareArray[i][2];
        }
        return array;
    }
}


