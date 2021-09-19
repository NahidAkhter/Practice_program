package primitiveSorting;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        String str = "uid1:12, uid2:10, uid3:20, uid2:10, uid3:10, uid1:100";
        String[] strArray = str.split(",");

        HashMap<String, Integer> map = new HashMap<>();

        for (String value : strArray) {
            String[] keyValue = value.split(":");
            String uuidKey = keyValue[0].trim();
            String uuidValue = keyValue[1].trim();

            if (map.containsKey(uuidKey)) {
                if(null != uuidValue && !uuidValue.isEmpty() && uuidValue.equalsIgnoreCase("null"))
                map.put(uuidKey, map.get(uuidKey) + Integer.parseInt(uuidValue));
            } else{
                map.put(uuidKey, Integer.parseInt(uuidValue));
            }
        }

        for (Map.Entry<String, Integer> entrySet : map.entrySet())
            System.out.println(entrySet);

    }
}
