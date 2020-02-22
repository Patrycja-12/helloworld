package tech.barny.sda;

import java.util.ArrayList;

public class CiagFibonacciego {
    public static void main(String[] args) {
        int n = 20;
        ArrayList<Integer> ciagFibon = new ArrayList<>();
        ciagFibon.add(0);
        ciagFibon.add(1);
        for (int k = 2; k < n; k++) {
            ciagFibon.add(ciagFibon.get(k - 1) + ciagFibon.get(k - 2));
        }
        System.out.println(ciagFibon);
    }
}