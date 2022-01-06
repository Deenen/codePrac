package CodingTasks.String;

public class s5_SortingString {
    /**
     * sort the characters of a string without using any predefined methods of String class in Java
     * Ex: Reverse("CBDA"); ==> ABCD
     */

    public static void main(String[] args) {
        String str = "CBDAFZAE";
        System.out.println("original\t " + str);
        System.out.println("ascending\t " + sortedByAscendingOrder(str));
        System.out.println("descending\t " + sortedByDescendingOrder(str));
    }

    /**
     *
     * @param str           original Given String
     * @param indexNum      index number of the character that to be replaced
     * @param newChar       new character that replacing the old character
     * @return              a new string that replaced the old charcter in the given index with the new character
     */
    public static String replaceCharInGivenIndex (String str, int indexNum, char newChar){
        return str.substring(0,indexNum) + newChar + str.substring(indexNum+1);
    }

    /**
     *
     * @param str               original given String
     * @param indexOfChar1      index of the first character that is to be swapped
     * @param indexOfChar2      index of the second character that is to be swapped
     * @return                  returns a new string that swapped with two characters
     */
    public static String swapTwoCharInString(String str, int indexOfChar1, int indexOfChar2 ){
        char temp = str.charAt(indexOfChar1);
        str = replaceCharInGivenIndex(str,indexOfChar1, str.charAt(indexOfChar2));
        str = replaceCharInGivenIndex(str,indexOfChar2,temp);
        return str;
    }

    public static String sortedByAscendingOrder (String str){
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) < str.charAt(j)) {
                    str = swapTwoCharInString(str, i, j);
                }
            }
        }
        return str;
    }

    public static String sortedByDescendingOrder (String str){
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) > str.charAt(j)) {
                    str = swapTwoCharInString(str, i, j);
                }
            }
        }
        return str;
    }

}
