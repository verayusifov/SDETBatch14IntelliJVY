package Repls;

public class PrintMaxNoFromArray {
    public static void main(String[] args)
    {
        int[][] arr = {
                {5,2,3,7},
                {1,5,1,1},
                {8,3,1,2}
        };
        // Initialize maximum element
        int max = arr[0][0];
        // Traverse array elements from second and
        // compare every element with current max
        for (int [] arr1:arr ) {
            for (int element:arr1) {
                if(element>max){
                    max=element;
                }
            }
        }
        System.out.print(max);
    }
}

