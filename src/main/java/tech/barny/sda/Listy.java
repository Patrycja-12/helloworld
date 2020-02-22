package tech.barny.sda;



import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class Listy {
    public static void main(String[] args) {
        ArrayList<String> lista1 = new ArrayList<>();
        LinkedList<String> lista2 = new LinkedList<>();

        List<String> lista = lista1;
        lista = lista2;

        lista.add("A"); // dodaje liste
        lista.add(0, "B");
        lista.set(0, "C"); // podmieniam wartość
        System.out.println(lista);

        lista.addAll(lista);
        System.out.println(lista);

        System.out.println(lista.contains("X")); // czy lista zawiera X - false
        System.out.println(lista.containsAll(lista)); // lista zawiera siebie sama

        lista.add("F");
        lista.remove("C");
        // UWAGA!
        //int i = 0;
       // Integer y = i; -- jest obiektem

        lista.remove(0);
        System.out.println(lista);

        lista.removeAll(lista1);
        System.out.println(lista);

        System.out.println(lista.get(0));
        System.out.println(lista.get(1)); // wyjatek


        int[] ints = new int[1];
        int length = ints.length;
        String str = "sdgf";
        int strLenght = str.length();

        int size = lista.size();
        System.out.println(size);


        ArrayList<Integer> liczby = new ArrayList<>();
        liczby.add(5);
        liczby.add(4);
        liczby.add(3);
        liczby.add(2);
        liczby.add(1);
        liczby.add(0);

        System.out.println(liczby);
        liczby.sort(null);
        System.out.println(liczby);
        liczby.sort(Comparator.reverseOrder()); // lub Comparator.naturalOrder
        System.out.println(liczby);


        // ciąg Fibonacciego
        int n=20;
        ArrayList<Integer> ciagFibon = new ArrayList<>();
        ciagFibon.add(0);
        ciagFibon.add(1);
        for (int k = 2; k < n; k++) {
            ciagFibon.add(ciagFibon.get(k-1)+ciagFibon.get(k-2));
        }
        System.out.println(ciagFibon);


    }
}
