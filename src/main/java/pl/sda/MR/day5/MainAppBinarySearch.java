package pl.sda.MR.day5;

public class MainAppBinarySearch {
    public static void main(String[] args) {

        int [] arr = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        int searchedVaue = 14;
        int index = BinarySearch.search(searchedVaue, arr, 0, arr.length);
        System.out.println("Searched value:" + searchedVaue + " is located on the place number:" + index);
    }
}
