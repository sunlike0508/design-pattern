package iterator;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println(" Iterator");

        Item[] items = {
                new Item("CPU", 1000),
                new Item("Keyboard", 2000),
                new Item("Mouse", 3000),
                new Item("HDD", 500),
        };

        Array array = new Array(items);
        Iterator selfIterator = array.iterator();

        while(selfIterator.next()) {
            Item item = (Item) selfIterator.current();
            System.out.println(item);
        }

        // 아래는 자바에서 제공하는 iterator
        System.out.println("자바에서 제공하는 Iterator");

        java.util.Iterator<Item> javaIterator = Arrays.stream(items).iterator();

        while(javaIterator.hasNext()) {
            Item item = javaIterator.next();

            System.out.println(item);
        }
    }
}