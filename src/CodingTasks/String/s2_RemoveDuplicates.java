package CodingTasks.String;

public class s2_RemoveDuplicates {
    /**
     * Write a return method that can remove the duplicated values from String
     * Ex:  removeDup("AAABBBCCC")  ==> ABC
     */
    public static void main(String[] args) {
       // Case Sensitive
       String str = "AaaBBccCDdeF";
       String nonDup = "";
        for (int i = 0; i < str.length(); i++) {
            if (!nonDup.contains(""+str.charAt(i))){
                nonDup += str.charAt(i);
            }
        }
        System.out.println("Case Sensitive nonDup = " + nonDup);

        // Case Insensitive
        str = str.toUpperCase();
        nonDup="";
        for (int i = 0; i < str.length(); i++) {
            if (!nonDup.contains(""+str.charAt(i))){
                nonDup += str.charAt(i);
            }
        }
        System.out.println("Case Insensitive nonDup = " + nonDup);

    }
}
