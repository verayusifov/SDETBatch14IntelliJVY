package Repls;

public class SumofNumsofEvenIndexEvenRow {
    public static void main(String[] args)
    {
        int[][] a={
                {-5,-2,-3,7},
                {1,-5,-3,2},
                {1,-2,3,-4}
        };
        int sum = 0;
        for (int i = 0; i < a.length; i+=2) {
            for (int j = 0; j < a[i].length; j+=2) {
                sum = sum + a[i][j];
            }
        }
        System.out.println(sum);
    }
}
