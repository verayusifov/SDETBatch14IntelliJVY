package Repls;

public class Repl132 {
    public static void main(String[] args) {
        int[][] a = {
                {1,2,3,4},
                {4,5,6,7},
                {1,3,5,7}
        };
        reduce10(a);
        for (int[] arr:a){
            for(int number:arr){
                System.out.print(number+" ");
            }
            System.out.println();
        }
    }
    //create method reduce10 here
    static int[][]reduce10(int[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;i<arr[i].length;j++){
                arr[i][j]=arr[i][j]-10;
            }
        }
        return arr;
    }
}
