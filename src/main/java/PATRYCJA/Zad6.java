package PATRYCJA;

public class Zad6 {
    public static void insertionSort(int array[]) {
        int n = array.length;
        for (int j = 1; j < n; j++) {
            int key = array[j];
            int i = j-1;
            while ( (i > -1) && ( array [i] > key ) ) {
                array [i+1] = array [i];
                i--;
            }
            array[i+1] = key;
        }
    }

    public static void main(String a[]){
        int[] arr1 = {2,16,6,10,50,19,88,1};
        System.out.println("Przed Sortowaniem");
        for(int i:arr1){
            System.out.print(i+" ");
        }
        System.out.println();

        insertionSort(arr1);

        System.out.println("Po sortowaniu");
        for(int i:arr1){
            System.out.print(i+" ");
        }
    }
}
