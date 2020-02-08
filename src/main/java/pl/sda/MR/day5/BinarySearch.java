package pl.sda.MR.day5;

public class BinarySearch {

    public static int search(int searchedElement, int[] arr, int lowIndex, int highIndex) {


        int middleIndex = (lowIndex + highIndex) / 2;
        int middleElement = arr[middleIndex];

        if (searchedElement == arr[middleIndex]) {
            return middleIndex;
        } else if (searchedElement < middleElement) {
            search(searchedElement, arr, lowIndex, middleIndex - 1);
        } else if (searchedElement > middleElement) {
            search(searchedElement, arr, middleIndex + 1, highIndex);

        }

            return -1;

    }
}
