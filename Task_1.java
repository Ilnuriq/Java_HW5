import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Task_1{
    
    public static void addNumber(String key, int value, Map<String, ArrayList<Integer>> map){
        if (map.containsKey(key)) {
            map.get(key).add(value);
        } else {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(value);
            map.put(key, list);
        }

    }

    public static void printBook(Map<String, ArrayList<Integer>> map){
        for (var item : map.entrySet()) {
            String phones = "";
            for(int el: item.getValue()){
                phones = phones + el + ", ";
            }
            System.out.printf("%s: %s \n", item.getKey(), phones);
        }
    }
    public static void main(String[] args) {
        Map<String, ArrayList<Integer>> bookPhone = new HashMap<>();
        addNumber("Javov", 010101, bookPhone);
        addNumber("Javov", 567900, bookPhone);
        addNumber("Pythonov", 4555, bookPhone);
        addNumber("Sharpov", 756756, bookPhone);
        addNumber("Pythonov", 675767, bookPhone);
        printBook(bookPhone);
       }
}