import java.util.HashMap;

public class Hashmapexp {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Aji", 03);
        map.put("Suresh", 43);
        System.out.println("Size: " + map.size());
        System.out.printf("Test: " + map.containsKey("Aji"));

        for(String key : map.keySet()) {
            System.out.println("Key: " + key + "Value: " + map.get(key));
        }
    }
}
