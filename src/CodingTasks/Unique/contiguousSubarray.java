package CodingTasks.Unique;

import java.util.Arrays;

public class contiguousSubarray {
    /**
     * Write an efficient program to find the sum of contiguous subarray within a one-dimensional array of numbers that has the largest sum.
     */
    public static void main(String[] args) {
        int [] a = {-2, -3, 4, -1, -2, 1, 5, -3};
//        System.out.println("Maximum contiguous sum is " +
//                maxSubArraySum(a));
        maxSubArraySum(a);
    }

    private static int [] maxSubArraySum(int[] arr) {
        int[][][] allSubArrs = allPossibleSubArrays(arr);
        int sum;
        int maxsum = Integer.MIN_VALUE;
        int [] maxSumArr = allSubArrs[0][0];
        for (int [][] outer : allSubArrs){
            for (int [] inner : outer){
                sum = 0;
                for (int each : inner){
                    sum += each;
                }
                System.out.println(Arrays.toString(inner) + " = " + sum);
                if (sum >= maxsum){
                    maxsum = sum;
                    maxSumArr = inner;
                }
            }
        }
        System.out.println("maxsum = " + maxsum);
        System.out.println("maxSumArr = " + Arrays.toString(maxSumArr));

        return null;
    }

    public static int [][][] allPossibleSubArrays(int[] arr){
        System.out.println(Arrays.toString(arr));
        int [] temp;
        int [][] result;
        int [][][] finalResult = new int[arr.length][][];
        int index;

        for (int x = 0; x < finalResult.length; x++) {
            int tempIndex = 1;
            result = new int[arr.length-x][];
            for (int i = 0; i < result.length; i++){
                temp = new int[tempIndex];
                index = x;
                for (int j = 0; j <= i; j++) {
                    temp[j] = arr[index];
                    index++;
                }
                result[i] = temp;
                tempIndex++;
            }
            finalResult[x] = result;
        }

        for (int[][] each : finalResult) {
            System.out.println(Arrays.deepToString(each));
        }

//        int tempIndex = 1;
//        for (int i = 0; i < result.length; i++){
//            temp = new int[tempIndex];
//            index = 0;
//            for (int j = 0; j <= i; j++) {
//                temp[j] = arr[index];
//                index++;
//            }
//            result[i] = temp;
//            tempIndex++;
//        }
//        System.out.println(Arrays.deepToString(result));
//
//
//        tempIndex = 1;
//        result = new int[arr.length-1][];
//        for (int i = 0; i < result.length; i++){
//            temp = new int[tempIndex];
//            index = 1;
//            for (int j = 0; j <= i; j++) {
//                temp[j] = arr[index];
//                index++;
//            }
//            result[i] = temp;
//            tempIndex++;
//        }
//        System.out.println(Arrays.deepToString(result));

//        tempIndex = 1;
//        result = new int[arr.length-2][];
//        for (int i = 0; i < result.length; i++){
//            temp = new int[tempIndex];
//            index = 2;
//            for (int j = 0; j <= i; j++) {
//                temp[j] = arr[index];
//                index++;
//            }
//            result[i] = temp;
//            tempIndex++;
//        }
//        System.out.println(Arrays.deepToString(result));

        return finalResult;
    }

}
