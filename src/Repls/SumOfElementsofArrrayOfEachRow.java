package Repls;

public class SumOfElementsofArrrayOfEachRow {
    public static void main(String[] args)
    {
        int[][] a = {
                {1,1,2}, //sum = 4
                {3,1,2}, //sum = 6
                {3,5,3}, //sum = 11
                {0,1,2}  //sum = 3
        };
        int sum;
        int[] sumOfRow = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            sum = 0;
            for (int j = 0; j < a[i].length; j++) {
                sum = sum + a[i][j];
            }
            sumOfRow[i] = sum;
            System.out.println(sumOfRow[i]);
        }
    }
}

