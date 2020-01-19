package pl.sda.MR.lesson1;

//Zaimplementuj interfejs w nowo stworzonej klasie StackImpl.
// Do przechowywania danych użyj tablicy (zainicjuj ją z dużym rozmiarem na zapas).
public class StackImp implements StackInterface {

    private Object[] stackData = new Object[10];
    private int currentFreeIndex = 0;

    public void push(Object obj) {
        stackData[currentFreeIndex] = obj;
        currentFreeIndex++;
    }

    public Object pop() {
        Object obj = stackData[currentFreeIndex - 1];
        stackData[currentFreeIndex - 1] = null;
        currentFreeIndex--;
        return obj;
    }

    public Object peek() {
        return stackData[currentFreeIndex - 1];
    }
}
