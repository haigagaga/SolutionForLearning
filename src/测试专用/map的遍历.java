package 测试专用;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class map的遍历 {
    public static void main(String[] args) {
        Map<String,Integer> maps = new HashMap<>();
        maps.put("1",1);
        maps.put("2",2);
        maps.put("3",3);
        maps.put("4",4);
        maps.put("5",5);

        Iterator<Map.Entry<String,Integer>> it = maps.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String,Integer> entry = it.next();

        }

        for (Map.Entry<String,Integer> entry: maps.entrySet()   ){

        }

        //直接遍历map.entrySet
        for (Map.Entry<String,Integer> entry:
        maps.entrySet()){
            System.out.println(entry.getValue());
        }

        Iterator<Map.Entry<String,Integer>> its = maps.entrySet().iterator();
        while(its.hasNext()){
            Map.Entry<String,Integer> entry = its.next();
            System.out.println(entry.getKey());
        }

    }
}
