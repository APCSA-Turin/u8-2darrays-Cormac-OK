package U8T2;

public class FunWith2DArrays {
    public static double average(int[][] arr){
        int sum = 0;
        int count = 0;
        for(int[] row : arr){
            for(int num : row){
                sum += num;
                count ++;
            }
        }
        return ((double)sum) / count;
    }

    public static int edgeSum(int[][] arr){
        int sum = 0;
        for(int num : arr[0]){
            sum += num;
        }
        for(int num : arr[arr.length - 1]){
            sum += num;
        }
        for(int i = 1; i < arr.length - 1; i ++){
            sum += arr[i][0];
            sum += arr[i][arr[i].length - 1];
        }
        return sum;
    }

    public static int[] indexFound(String[][] arr, String target){
        for (int j = 0; j < arr[0].length; j ++){
            for (int i = 0; i < arr.length; i ++){
                if(arr[i][j].equals(target)){
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }

    public static int[][] split(int[][] arr, int row, int column){
        if(row >= arr.length || column >= arr[0].length){
            return new int[][]{{}};
        }
        else{
        int[][] newArr = new int[row + 1][column + 1];
        for(int i = 0; i <= row; i ++){
            for (int j = 0; j <= column; j ++){
                System.out.println("Row: " + i + " Column: " + j);
                newArr[i][j] = arr[i][j];
            }
        }
        return newArr;
        }
    }

    public static int[][] invert(int[][] arr){
        int[][] newArr = new int[arr[0].length][arr.length];
        for(int i = 0; i < arr.length; i ++){
            for (int j = 0; j < arr[0].length; j ++){
                newArr[j][i] = arr[i][j];
            }
        }
        return newArr;
    }
}
