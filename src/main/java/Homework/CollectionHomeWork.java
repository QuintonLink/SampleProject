package Homework;
import java.util.*;
public class CollectionHomeWork {
    public static void deleteLong(int max, List<String> a) {
        for (int i = 0; i < a.size(); i++) {
            if(a.get(i).length() > max){
                a.remove(i);
            }
        }
    }
    public static Set<Integer> symmetricDifference(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> set3 = new HashSet<>();
        set3.addAll(set1);
        set3.addAll(set2);
        set3.retainAll(set1);
        set3.retainAll(set2);
        return set3;
    }
    public static Map<String,Integer> countList(List<String> list){
        Map<String,Integer> map = new HashMap<>();
        for (String x : list){
            if(map.containsValue(x)){
                map.put(x,map.get(x)+1);
            } else{
                map.put(x,1);
            }
        }
        return map;
    }
}