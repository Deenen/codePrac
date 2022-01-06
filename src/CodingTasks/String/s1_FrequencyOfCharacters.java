package CodingTasks.String;

public class s1_FrequencyOfCharacters {
    /**
     * S1 -- Frequency of Characters
     * Write a return method that can find the frequency of characters
     * Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
     */

    public static void main(String[] args) {
        String str = "AaabBcccCDdE".toUpperCase(); // to determine Case sensitivity
        String nonDup = "";
        String result = "";

        for (int i = 0; i < str.length(); i++){
            if (!nonDup.contains(""+str.charAt(i))){
                nonDup += str.charAt(i);
            }
        }
        System.out.println("nonDup = " + nonDup);

        for (int i = 0; i < nonDup.length(); i++) {
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if ((""+nonDup.charAt(i)).equals(""+str.charAt(j))){
                    count++;
                }
            }
            result+=""+nonDup.charAt(i)+count;
        }
        System.out.println("result = " + result);

    }

}
