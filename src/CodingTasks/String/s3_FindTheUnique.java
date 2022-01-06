package CodingTasks.String;

public class s3_FindTheUnique {
    /**
     * Write a return  method that can find the unique characters from the String
     * Ex:  unique("AAABBBCCCDEF")  ==>  "DEF";
     */

    public static void main(String[] args) {
        String str = "AAABBBCCCDEF";
        String result = "";
        for (int i = 0; i < str.length(); i++){
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == str.charAt(i)){
                    count++;
                }
            }
            if (count == 1){
                result += str.charAt(i);
            }
        }
        System.out.println("result = " + result);

    }
}
