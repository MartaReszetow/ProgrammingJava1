package pl.sda.MR.lesson1;

public class MyNode {

    Integer value;
    MyNode nextNode;

    public MyNode(Integer value, MyNode nextNode) {
        this.value = value;
        this.nextNode = nextNode;
        System.out.println("new node value" + value);
    }

}
