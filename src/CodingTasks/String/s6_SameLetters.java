package CodingTasks.String;

public class s6_SameLetters {
    /**
     * Write a return method that check if a string is build out of the same letters as another string.
     * Ex:  same("abc",  "cab"); -> true
     * same("abc",  "abb"); -> false:
     */
    public static void main(String[] args) {

        String s1 = "abcadzf";
        String s2= "cab";

//        s1 = s5_SortingString.sortedByAscendingOrder(s1);
//        s2 = s5_SortingString.sortedByAscendingOrder(s2);
//
//        System.out.println((s1.equalsIgnoreCase(s2)) ? true : false);

        System.out.println(sameLetters(s1,s2));

    }

    public static boolean sameLetters(String str1, String str2){
        str1 = removeDuplicates(str1);
        str2 = removeDuplicates(str2);

        str1 = s5_SortingString.sortedByAscendingOrder(str1);
        str2 = s5_SortingString.sortedByAscendingOrder(str2);

        if (str1.length() == str2.length()){
            return str1.equalsIgnoreCase(str2);
        } else if (str1.length() > str2.length()){
            return str1.contains(str2);
        } else
            return str2.contains(str1);
    }

    public static String removeDuplicates(String str1){
        String nonDup = "";
        for (int i = 0; i < str1.length();i++){
            if (!nonDup.contains(""+str1.charAt(i))){
                nonDup+= "" + str1.charAt(i);
            }
        }
        return nonDup;
    }

}
