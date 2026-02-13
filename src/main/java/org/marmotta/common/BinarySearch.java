package org.marmotta.common;

public class BinarySearch {


    public static int biSearch(int[] array, int search) {
        int from = 0;
        int to = array.length - 1;
        if (array[to] < search) {
            return to;
        }

        while (from != to) {
            if (array[to] == search) {
                return to;
            }
            int newIndex = (from + to) / 2;
            if (to == newIndex) {
                return to;
            }
            int val = array[newIndex];
            if (val < search) {
                if (from == newIndex) {
                    return from;
                }
                from = newIndex;
            } else {
                to = newIndex;
            }
//            System.out.println("from = " + from + ", to = " + to);
        }
        return to;

    }

}
