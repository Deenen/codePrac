package CodingTasks.String;

public class strUtil {

    public static void main(String[] args) {
        String str = "AABBCDDDAF";
        System.out.println("original = " + str);
        String result = removeDuplicates(str);
        System.out.println("nonDup = " + result);
        result = findTheUnique(str);
        System.out.println("unique = " + result);
        result = findFrequencyOfChars(str);
        System.out.println("frequency = " + result);
        result = reverseStr(str);
        System.out.println("reverse = " + result);

    }

    public static String removeDuplicates(String str){
        String nonDup="";
        for (int i = 0; i < str.length(); i++) {
            if (!nonDup.contains(""+str.charAt(i))){
                nonDup += str.charAt(i);
            }
        }
        return nonDup;
    }

    public static String findTheUnique(String str){
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
        return result;
    }

    public static String findFrequencyOfChars(String str){
        String nonDup = removeDuplicates(str);
        String result = "";
        for (int i = 0; i < nonDup.length(); i++) {
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if ((""+nonDup.charAt(i)).equals(""+str.charAt(j))){
                    count++;
                }
            }
            result+=""+nonDup.charAt(i)+count;
        }
        return result;
    }

    public static String reverseStr (String str1){
        String result = "";
        for (int i = str1.length()-1; i >= 0; i--){
            result += "" + str1.charAt(i);
        }
        return result;
    }

    // TO DO: Add Sorting method






}
