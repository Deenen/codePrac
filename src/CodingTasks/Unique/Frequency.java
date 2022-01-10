package CodingTasks.Unique;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Frequency {

    public static void main(String[] args) {
        String str = "hellllo";
//        System.out.println(ifUnique(str));

        List<String> list =  Arrays.asList(str.split(""));
        System.out.println("list = " + list);
    }

    public static Boolean ifUnique(String str){
        List<String> list =  Arrays.asList(str.split(""));
        for (String each : list){
            if (Collections.frequency(list,each) > 1){
                return false;
            }
        }
        return true;
    }
}
