package CodingTasks.String;

public class s4_RevereString {
    /**
     * Write a return method that can reverse  String
     * Ex: Reverse("ABCD"); ==> DCBA
     */

    public static void main(String[] args) {
        String str = "ABCD1234";
        String result = "";
        for (int i = str.length()-1; i >= 0; i--){
            result += "" + str.charAt(i);
        }
        System.out.println("result = " + result);
        System.out.println("reverseStr() = " + reverseStr(str));
    }

    public static String reverseStr (String str1){
        String result = "";
        for (int i = str1.length()-1; i >= 0; i--){
            result += "" + str1.charAt(i);
        }
        return result;
    }
}
