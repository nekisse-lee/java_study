package java8_3.chap11.map;

import java.util.*;

public class TreeMapExx {
    public static void main(String[] args) {

        String[] arr = { "A","K","A","K","D","K","A","K","K","K","Z","D" };

        Map map = new TreeMap();

        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                int tmp = (int) map.get(arr[i]);
                map.put(arr[i], tmp + 1);
            } else {
                map.put(arr[i], 1);
            }
        }

        System.out.println("map = " + map);

        Iterator iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry entry = (Map.Entry) iterator.next();
            System.out.println("entry.getKey() + entry.getValue() = " + entry.getKey() + entry.getValue());
//            System.out.println("iterator.next() = " + iterator.next());
        }


        Set set = map.entrySet();
        ArrayList arrayList = new ArrayList<>(set);


        System.out.println("set = " + set);
        System.out.println("arrayList = " + arrayList);
        Collections.sort(arrayList, new sortKeyDesc());

//        arrayList.sort(new sortKeyDesc());
        System.out.println("arrayList = " + arrayList);


        Set set1 = map.entrySet();
        ArrayList arrayList1 = new ArrayList<>(set1);

        System.out.println("arrayList1 = " + arrayList1);
        ArrayList sortArrayList1 = arrayList1;
        sortArrayList1.sort(new sortKeyDesc());
        System.out.println("sortArrayList1 = " + sortArrayList1);

    }

    private static class sortKeyDesc implements Comparator {
        @Override
        public int compare(Object o1, Object o2) {
            Map.Entry o11 = (Map.Entry) o1;
            Map.Entry o22 = (Map.Entry) o2;
            Integer  o1Int = (Integer) o11.getValue();
            Integer  o2Int = (Integer) o22.getValue();

            return o2Int - o1Int;
        }
    }
}
