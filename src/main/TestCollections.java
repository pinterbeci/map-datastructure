package main;

import javax.lang.model.element.Element;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class TestCollections {

    public static void main(String[] args) {

        Map<String, Integer> firstmap = new HashMap<>();

        firstmap.put("Janéé", 25);
        firstmap.put("Karesz", 45);
        firstmap.put("Sándor", 96);
        firstmap.put("Pista", 56);
        firstmap.put("Kevin", 17);
        firstmap.put("Janéé", 26);

        System.out.println(firstmap);


        Iterator it = firstmap.entrySet().iterator();

        while (it.hasNext()) {

            Map.Entry currentMapElement = (Map.Entry) it.next();
            String key = (String) currentMapElement.getKey();
            Integer value = (Integer) currentMapElement.getValue();

            System.out.println( key + " : " + value);
        }

        for(Map.Entry<String, Integer> currentElement: firstmap.entrySet()){

            System.out.println( currentElement.getKey() + " : " + currentElement.getValue());

        }

    }
}
