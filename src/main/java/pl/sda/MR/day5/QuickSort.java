package pl.sda.MR.day5;

public class QuickSort {


    public static void sort(int[] arr) {
        quickSort(arr, 0, arr.length - 1);
    }

    private static void quickSort(int[] arr, int lowerIndex, int higherIndex) {
        int pivot = arr[(lowerIndex + higherIndex) / 2];
        int leftSearch = lowerIndex;
        int rightSearch = higherIndex;
        while (leftSearch <= rightSearch) {
            while (arr[leftSearch] < pivot) { // do momentu gdy lewy marker jest mniejszy od pivota pęta podbija licznik
                leftSearch++;
            }
            while (arr[rightSearch] > pivot) {
                rightSearch--;
            }
            if (leftSearch <= rightSearch) {            // w momencie gdy markry sie miną
                int temp = arr[leftSearch];
                arr[leftSearch] = arr[rightSearch];
                arr[rightSearch] = temp;
                leftSearch++;
                rightSearch--;
            }
        }
        if (lowerIndex < rightSearch) {
            quickSort(arr, lowerIndex, rightSearch);
        }
        if (leftSearch < higherIndex) {
            quickSort(arr, leftSearch, higherIndex);
        }
    }
}

