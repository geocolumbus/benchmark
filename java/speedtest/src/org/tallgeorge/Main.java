package org.tallgeorge;

import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Double> ll = new LinkedList<>();

        long start = System.currentTimeMillis();
        for (int i=0; i<5e6; i++) {
            ll.add(i/3.1415);
        }
        long stop = System.currentTimeMillis();

        long diff = stop - start;
        System.out.println(diff + "ms");
    }
}

