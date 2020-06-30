package 杂;

import java.util.*;

public class Test {

    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map.put("a", 2);
        map.put("b", 1);
        map.put("c", 8);
        List<String> list = new ArrayList<>();
        Iterator<Map.Entry<String, Integer>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, Integer> entry = it.next();
            System.out.println("key= " + entry.getKey() + " and value= " + entry.getValue());
            list.add(entry.getKey());
        }
        List<String> newlist = new ArrayList<>(list);
        for (int i = 0; i < list.size() ; i++) {
            String key = list.get(i);
            int num = map.get(key);
            if (num > 1){
                for (int j = 0; j < num - 1; j++) {
                    newlist.add(key);
                }
            }
        }
        System.out.println("newlist.size()"+newlist.size());
        for (int i = 0; i < newlist.size() - 1; i++) {
            System.out.println(newlist.get(i)+ "");
        }
    }

}
