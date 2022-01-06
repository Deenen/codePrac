package CodingTasks.String;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class s9_sumTheDigits {
    /**
     *  (Sum the digits in an integer) Write a program that reads an integer
     *  between 0 and 1000 and adds all the digits in the integer. For example, if an
     *  integer is 932, the sum of all its digits is 14.
     *
     *  NOTE: We will need to solve this without using loops.
     *
     *  Hint: Use the % operator to extract digits, and use the / operator to remove
     *  the extracted digit. For instance, 932 % 10 = 2 and 932 / 10 = 93.
     *
     *  Here is a sample run: Enter a number between 0 and 1000: 999 The sum of the
     *  digits is 27
     *
     * @param args
     */

    public static void main(String[] args) {
        System.out.println("enter a number");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        System.out.println(num);

        int result = -1;

        if (num < 10){
            result = num;
        } else if ( num >= 10 && num < 100){
            result = (num/10)%10 + num%10;
        } else if ( num >= 100 && num < 1000){
            result = (num/100)%10 + (num/10)%10 + num%10;
        }
        System.out.println("result = " + result);
        System.out.println();

        splitNums(num);
    }

    /**
     *
     * @return split and store the numbers based on their digit
     *
     * ToDO: will work on it later
     */
    public static int [] splitNums(int num) {
        int [] result = new int[("" + num).length()];
        System.out.println(Arrays.toString(result));
        return result;
    }
}
