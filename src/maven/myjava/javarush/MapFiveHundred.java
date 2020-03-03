package javarush;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapFiveHundred {
    public static Map<String, Integer> createMap() {
        Map<String, Integer> map = new HashMap<String,Integer>();
        map.put("ivanov", 25);                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   
        map.put("petrov", 14);                                                                                                                                                                                                                                                                                                                                                              
        map.put("sidorov", 7487);                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   
        map.put("kravchuk", 583658);                                                                                                                                                                                                                                                                                                                                                                
        map.put("petrenko", 858);                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   
        map.put("svanidze", 856857);                                                                                                                                                                                                                                                                                                                                                               
        map.put("serduchka", 8556);                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   
        map.put("petrosan", 7585);                                                                                                                                                                                                                                                                                                                                                               
        map.put("kravec", 8587);                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   
        map.put("vola", 7575); 
        return map;
  
    }

    public static void removeItemFromMap(Map<String, Integer> map) {
        Iterator<Map.Entry<String, Integer>> itr = map.entrySet().iterator();
        while(itr.hasNext()){
            if (itr.next().getValue()<500){
                itr.remove();
            }
        }
    }

    public static void main(String[] args) {

    }
}