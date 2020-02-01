package pl.sda.MR.day4;

import java.util.ArrayList;
import java.util.List;


// Stwórz nową klasę MyQueue<T>. T będzie tzw. typem generycznym. Powinna zawierać metody offer(T t) dodającą
// do  kolejki nowy obiekt i metodę pool() która będzie zwracać obiekt klasy T. Kolejka powinna działać na zasadzie FIFO.
// Obiekty wewnątrz tej klasy przechowuj w ArrayList<T>. Dodaj metodę printAll() która będzie drukować do konsoli efekt
// wywołania toString() na każdym obiekcie pozostałym w kolejce.


public class MyQueue<T> {           // przy deklaracji oklasy określamy na jakim typie danych bedzie operować

    private List<T> underlyingList = new ArrayList<>();

    public void offer(T someObject) {   //  powinna dodać do listy
        underlyingList.add(someObject);

    }

    public T pool() {   // powinna zwrócic i usunąć
        T toRemove = underlyingList.get(0);
        underlyingList.remove(0);
        return toRemove;
    }

    public void printAll() {
        for (T object : underlyingList) {
            System.out.println(object);
        }

    }

}
