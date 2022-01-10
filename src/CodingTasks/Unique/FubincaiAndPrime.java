package CodingTasks.Unique;

import java.lang.reflect.Array;
import java.util.Arrays;

public class FubincaiAndPrime {
    /**
     *
     * 1 2 3 5 8 13 21
     */
    public static void main(String[] args) {
        int n = 9;
        System.out.println(isPrime(30));
        primeAndFibonacci(generateFubinaciNums(n));
    }

    public static int [] generateFubinaciNums(int givenNum){

        int [] finalResult = new int[givenNum+1];
        int firstNum = 0;
        finalResult[0] = firstNum;
        int secondNum = 1;
        int temp;
        int count = 0;
        int index = 1;
        while (count < givenNum){
            temp = secondNum;
            secondNum = firstNum + secondNum;;
            firstNum = temp;
            finalResult[index] = temp;
            count++;
            index++;
        }
        System.out.println(Arrays.toString(finalResult));
        return finalResult;
    }

    public static boolean isPrime(int num){
        for (double i = 2 ; i <  num; i++){
            if ( num % i == 0){
                return false;
            }
        }
        return true;
    }

    public static int [] primeAndFibonacci(int [] intArrs){
        String result = "";
        for (int each : intArrs){
            if (isPrime(each)){
                result += each + " ";
            }
        }
        System.out.println("result = " + result);
        int count = 0;
        int [] finalFinalResult = new int[result.split(" ").length];
        for (String each : result.split(" ") ) {
            finalFinalResult[count++] = Integer.parseInt(each);
        }
        return finalFinalResult;
    }

//    static int fib(int n)
//    {
//        /* Declare an array to store Fibonacci numbers. */
//        int f[] = new int[n+2]; // 1 extra to handle case, n = 0
//        int i;
//
//        /* 0th and 1st number of the series are 0 and 1*/
//        f[0] = 0;
//        f[1] = 1;
//
//        for (i = 2; i <= n; i++)
//        {
//       /* Add the previous 2 numbers in the series
//         and store it */
//            f[i] = f[i-1] + f[i-2];
//        }
//
//        return f[n];
//    }


}
