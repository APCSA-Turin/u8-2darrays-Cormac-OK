package U8T2_Algorithms;

import java.util.ArrayList;

public class Algorithm2DArrays {
    public static void main(String[] args) {
        int[][] testArr1 = {{7, 2, 3}, {0, 4, 8}, {5, 6, 1}};
        int[][] testArr2 = {{4, 9, 2}, {3, 5, 7}, {8, 1, 6}};
        int[][] testArr3 = {{2, 16, 13, 3}, {11, 5, 8, 10}, {7, 9, 12, 6}, {14, 4, 1, 15}};
        int[][] testArr4 = {{1, 23, 16, 4, 21}, {15, 14, 7, 18, 11}, {24, 17, 13, 9, 2}, {20, 8, 19, 12, 6}, {5, 3, 10, 22, 25}};
        int[][] testArr5 = {{2, 16, 13, 3}, {11, 5, 8, 10}, {7, 9, 12, 15}, {14, 4, 1, 6}};
        int[][] testArr6 = {{2, 16, 13, 3}, {11, 5, 8, 10}, {7, 9, 12, 6}, {14, 4, 1, 8}};
        int[][] testArr7 = {{7, 3, 2}, {0, 4, 8}, {5, 6, 1}};
        int[][] testArr8 = {{3, 3, 3}, {3, 3, 3}, {3, 3, 3}};
        int[][] testArr9 = {{1, 2, 3}, {2, 3, 1}, {3, 1, 2}};
        int[][] testArr10 = {{0, 4, 8}, {7, 2, 3}, {5, 6, 1}};
        int[][] testArr11 = {{1, 23, 16, 4, 21}, {15, 14, 7, 18, 11}, {24, 26, 13, 9, 2}, {20, 8, 19, 12, 6}, {5, -6, 10, 22, 25}};
        int[][] testArr12 = {{1, 23, 16, 4, 21}, {15, 14, 7, 18, 11}, {24, 27, 13, -1, 2}, {20, 8, 19, 12, 6}, {5, 3, 10, 22, 25}};;
        int[][] testArr13 = {{1, 2, 9}, {4, 15, -7}, {7, -5, 10}};
        int[][] testArr14 = {{2, 7, 6}, {9, 5, 1}, {4, 3, 5}};
        
        
        
        boolean test1 = Algorithm2DArrays.magicSquare(testArr1);
        System.out.println(test1);
        boolean test2 = Algorithm2DArrays.magicSquare(testArr2);
        System.out.println(test2);
        boolean test3 = Algorithm2DArrays.magicSquare(testArr3);
        System.out.println(test3);
        boolean test4 = Algorithm2DArrays.magicSquare(testArr4);
        System.out.println(test4);
        boolean test5 = Algorithm2DArrays.magicSquare(testArr5);
        System.out.println(test5);
        boolean test6 = Algorithm2DArrays.magicSquare(testArr6);
        System.out.println(test6);
        boolean test7 = Algorithm2DArrays.magicSquare(testArr7);
        System.out.println(test7);
        boolean test8 = Algorithm2DArrays.magicSquare(testArr8);
        System.out.println(test8);
        boolean test9 = Algorithm2DArrays.magicSquare(testArr9);
        System.out.println(test9);
        boolean test10 = Algorithm2DArrays.magicSquare(testArr10);
        System.out.println(test10);
        boolean test11 = Algorithm2DArrays.magicSquare(testArr11);
        System.out.println(test11);
        boolean test12 = Algorithm2DArrays.magicSquare(testArr12);
        System.out.println(test12);
        boolean test13 = Algorithm2DArrays.magicSquare(testArr13);
        System.out.println(test13);
        boolean test14 = Algorithm2DArrays.magicSquare(testArr14);
        System.out.println(test14);
        if (test1 && test2 && test3 && test4 && !test5 && !test6 && !test7 && !test8 && !test9 && !test10 && !test11 && !test12 && !test13 && !test14) {
            System.out.println("\n--- ALL TESTS PASS! ---");
        } else {
            System.out.println("\n!!!!!! TEST FAIL!!!!!!!");
        }
        
        
        
    }

    /** Return the sum of all elements of arr that are in the one particular row, 
     *  specified by the row parameter
     *
     *  PRECONDITION:  0 <= row < arr.length (i.e. row is guaranteed to be valid)
     *
     *  @param arr  2D array of ints
     *  @param row  the row to add up
     *  @return  the sum of all elements in row
     
    */
    public static int sumForRow(int[][] arr, int row)
    {
        int sum = 0;
        for(int num: arr[row]){
            sum += num;
        }
        return sum;
    }

    /** Return the sum of all elements of arr that are in the one particular column 
     *
     *  PRECONDITION:  0 <= col < arr[0].length (i.e. col is valid)
     *
     *  @param arr  2D array of ints
     *  @param col  the column to add up
     *  @return  the sum of all elements in column
     */
    public static int sumForColumn(int[][] arr, int col){
        int sum = 0;
        for(int[] row: arr){
            sum += row[col];
        }
        return sum;
    }

    /** Replaces all even integers in arr with 0; all odd integers are unchanged.
     *  It then returns the number of changes that were made.
     *
     *  Example: if arr is {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {4, 6, 8, 3, 5}}
     *  then this method modifies arr to be:
     *           {{1, 0, 3, 0, 5}, {0, 7, 0, 9, 0}, {0, 0, 0, 3, 5}}
     *  and returns 8 (the number of even numbers replaced by 0)
     *
     * POSTCONDITION: this method modifies the original 2D array referenced by arr
     *
     *  @param arr  2D array of ints
     *  @return  the number of changes made
     */
    public static int replaceEvensWithZero(int[][] arr){
        int count = 0;
        for(int i = 0; i < arr.length; i ++){
            for (int j = 0; j < arr[i].length; j++){
                if(arr[i][j] % 2 == 0){
                    arr[i][j] = 0;
                    count ++;
                }
            }
        }
        return count;
    }

    /** Searches through the 2D array wordChart and finds all strings with
     *  length len; these strings are added to an ArrayList and returned.
     *  If no strings have that length, return an empty ArrayList
     *
     *  @param wordChart  2D array of Strings
     *  @param len  the length of strings to search for
     *  @return  an ArrayList containing all strings in wordChart with length len
     */
    public static ArrayList<String> findStringsOfLength(String[][] wordChart, int len){
        ArrayList<String> list = new ArrayList<>();
        for(String[] row : wordChart){
            for(String str: row){
                if(str.length() == len){
                    list.add(str);
                }
            }
        }
        return list;
    }

    /** calculates and returns the average class grade as a double for a
     *  all Students in the 2D array seatingChart
     *
     *  PRECONDITION:  seatingChart contains at least one element with at least
     *                 one student (i.e. no need to worry about division by 0)
     *  
     *  @param seatingChart  2D array of Student objects
     *  @return  the average grade of all Students in seatingChart, as a double
     */
    public static double classAverage(Student[][] seatingChart){
        int sum = 0;
        int count = 0;
        for (Student[] row: seatingChart){
            for(Student student: row){
                sum += student.getGrade();
                count ++;
            }
        }
        return (double) sum/count;
    }

    /** Returns true if any two consecutive elements, horizontally or vertically,
     *  are equal, false otherwise.  You do not need to check for "wrap around"
     *  consecutiveness, such as if the last element in a row is the same as
     *  the first:
     *  
     *  For example, if arr is:
     *      1, 2, 3, 4
     *      2, 7, 3, 5
     *      3, 4, 5, 6
     *
     *  then this method returns true because there is a pair of consecutive
     *  numbers (vertically)
     *
     *  As another example, if arr is:
     *      1, 2, 3, 4
     *      2, 7, 8, 5
     *      3, 4, 4, 6
     *
     *  then this method returns true because there is a pair of consecutive
     *  numbers (horizontally)
     *
     *  As another example, if arr is:
     *      1, 2, 3, 8
     *      2, 7, 8, 5
     *      3, 2, 5, 3
     *
     *  then this method returns false because there are not two consecutive
     *  numbers, vertically or horizontally, that are equal.
     *
     *  NOTE: do not consider "wrap around" consecutive numbers, in other words,
     *  the 3's and 6's below are not considered consecutive:
     *      1, 6, 3, 8
     *      2, 7, 8, 5
     *      3, 6, 5, 3
     *
     *  Similarly, equal numbers on a diagonal are not considered consecutive,
     *  so the 8's below are not consecutive:
     *      1, 2, 3, 8
     *      2, 7, 8, 5
     *      3, 2, 5, 3
     *
     *  @param arr  2D array of ints
     */
    public static boolean consecutive(int[][] arr){
        for(int y = 0; y < arr.length; y++){
            for(int x = 0; x < arr[y].length; x++){
                for(int i = 0; i < 4; i ++){
                    int checkX = x;
                    int checkY = y;
                    if(i == 0){
                        checkY --;
                    }
                    else if(i == 1){
                        checkX --;
                    }
                    else if(i == 2){
                        checkY ++;
                    }
                    else if(i == 3){
                        checkX ++;
                    }
                    if(checkX >= 0 && checkY >= 0 && checkY < arr.length && checkX < arr[checkY].length && arr[y][x] == arr[checkY][checkX]){
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /** A "magic square" is a square grid filled with distinct integers such
     *  that each element is a different integer, and the sum of the integers
     *  in each row, column and diagonal is equal.  This method should return true
     *  if arr is a magic square.
     *
     *  PRECONDITION: arr is a square 2D array with the same number of rows and
     *                columns
     *  
     *  For example, if arr is:
     *      7, 2, 3
     *      0, 4, 8
     *      5, 6, 1
     *
     *  then this method returns true because each row, column, and diagonal add
     *  up to the same sum (12) and all numbers are unique (i.e. no duplicate
     *  values appear)
     *
     *  As another example, if arr is (note the 3 and 2 swapped):
     *      7, 3, 2
     *      0, 4, 8
     *      5, 6, 1
     *
     *  then this method returns false because the column sums no longer add up to
     *  the same value
     *
     *  As another example, if arr is:
     *      1, 2, 3
     *      2, 3, 1
     *      3, 1, 2
     *
     *  then this method returns false because, one diagonal does not sum to 6 and there are duplicate numbers.
     *
     *  @param arr  2D array of ints
     */
    public static boolean magicSquare(int[][] arr){
        int sum = sumForRow(arr, 0);
        for(int i = 1; i < arr.length; i++){
            if(sumForRow(arr, i) != sum){
                return false;
            }
        }
        for(int i = 0; i < arr.length; i++){
            if(sumForColumn(arr, i) != sum){
                return false;
            }
        }
        int diagonalSum = 0;
        for(int i = 0; i < arr.length; i ++){
            diagonalSum += arr[i][i];
        }
        if(diagonalSum != sum){
            return false;
        }

        diagonalSum = 0;
        for(int i = 0; i < arr.length; i ++){
            diagonalSum += arr[i][arr.length - 1 - i];
        }
        if(diagonalSum != sum){
            return false;
        }

        ArrayList<Integer> unique = new ArrayList<>();
        for(int[] row: arr){
            for(int num: row){
                for(int check: unique){
                    if(check == num){
                        return false;
                    }
                }
                unique.add(num);
            }
        }
        return true;
    }

}