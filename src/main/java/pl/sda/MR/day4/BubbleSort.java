package pl.sda.MR.day4;

public class BubbleSort {


    public static void sort(int[] tableOfInts) {
        boolean swapped;
        do {
            swapped = false;
            for (int i = 1; i < tableOfInts.length; i++) {



                if (tableOfInts[i - 1]>tableOfInts[i]){
                    int temp = tableOfInts[i - 1];
                    tableOfInts[i-1]=tableOfInts[i];
                    tableOfInts[i] = temp;
                    swapped = true;
                }
            }
        }
        while (swapped);
    }
}

