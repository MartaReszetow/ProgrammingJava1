package pl.sda.MR.lesson1;

//Stwórz interfejs StackInterface z metodami: pop(), push() , peek(). Argumenty
//funkcji oraz zwracane wartości powinny być klasy Object.
public interface StackInterface {

    void push(Object obj);
    Object pop();
    Object peek();

}
