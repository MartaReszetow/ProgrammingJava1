package pl.sda.MR.lesson1;

public class MyLinkedList {

    private MyNode startNode;

    public void add(Integer newValue) {

        if (startNode == null) {
            startNode = new MyNode(newValue, null);
        } else {
            MyNode currentNode = startNode;
            while (currentNode.nextNode != null) {
                currentNode = currentNode.nextNode; // wykona się od prawej
            }
            currentNode.nextNode = new MyNode(newValue, null);

        }

    }

    public void printAll() {
        MyNode currentNode = startNode;

        if (startNode == null) {
            System.out.println("no data");
        } else {

            System.out.print(currentNode.value);
            while (currentNode.nextNode != null) {
                currentNode = currentNode.nextNode; // wykona się od prawej
                System.out.print("-" + currentNode.value);
            }
        }
    }
}
// zad dom - size
