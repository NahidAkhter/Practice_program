package golman;

import java.util.HashMap;
import java.util.Map;

public class MaximumAverage {

    //String student[][] = {{"jerry","65"}, {"bob","1"}, {"jerry","23"},{"jerry","23"}, {"jerry","100"},{"Eric","83"}};

    public static void main(String[] args) {
        String student[][] = {{"jerry","65"}, {"bob","1"}, {"jerry","23"},{"max","23"}, {"jerry","100"},{"Eric","83"}};
        System.out.println(findMaximumAverage(student));
    }

   private static String findMaximumAverage(String[][] students){
       HashMap<String, Float> map = new HashMap<>();

       for(int i=0; i< students.length; i++){
               if(map.containsKey(students[i][0])){
                   float sum = Integer.valueOf(students[i][1]) + map.get(students[i][0]);
                   float average = sum / 2;
                   map.put(students[i][0], average);
               } else {
                   map.put(students[i][0], Float.valueOf(students[i][1]));
               }
       }

       float result = Integer.MIN_VALUE;
       String name = "";
       for (Map.Entry<String, Float> entrySet: map.entrySet()){

          if(entrySet.getValue() > result){
              result = entrySet.getValue();
              name = entrySet.getKey();
          }

       }
       return name + ": " + result;
    }

}
