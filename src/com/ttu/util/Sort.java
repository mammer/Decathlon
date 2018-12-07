package com.ttu.util;

import java.util.*;

/**
 * Created by Oskar on 17/02/16.
 * com.ttu.util.Sort map values for sequencing the athletes in descending order.
 */
public class Sort {

    public static Map sortByValue(Map pointsList) {
        int position = 0;

        List list = new LinkedList(pointsList.entrySet());
        Collections.sort(list, new Comparator() {
            public int compare(Object o1, Object o2) {
                return ((Comparable) ((Map.Entry) (o2)).getValue())
                        .compareTo(((Map.Entry) (o1)).getValue());
            }
        });

        Map result = new LinkedHashMap();
        for (Object o : list) {
            Map.Entry entry = (Map.Entry) o;
            position++;
            Integer.toString(position);
            result.put(position + ". " + entry.getKey(), " (" + entry.getValue() + ")" + "\n");
        }
        return result;
    }
}
