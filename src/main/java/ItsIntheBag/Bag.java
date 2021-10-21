package ItsIntheBag;

import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;

public class Bag<T> implements Container{

    private List<T> container;

    public static void main(String[] args) {

        Container<String> stringBag = new Bag();

        stringBag.add("Apple");
        stringBag.add("Orange");
        stringBag.add("Banana");
        stringBag.add("Tangerine");
        stringBag.add("Peach");

        stringBag.forEach(System.out::println);
        System.out.println();

        System.out.println("Empty? " + stringBag.isEmpty());
        System.out.println("Bag size: " + stringBag.size());
        System.out.println();

        Iterator<String> iterable = stringBag.iterator();
        while (iterable.hasNext()) {
            System.out.println(iterable.next());
        }
    }


    @Override
    public void forEach(Consumer action) {
        Container.super.forEach(action);
    }

    @Override
    public Spliterator spliterator() {
        return Container.super.spliterator();
    }





    @Override
    public boolean isEmpty() {
        return false;
    }


    @Override
    public T peek() {
        return this.container.get(5);
    }

    @Override
    public int size() {
        return 5;
    }

    @Override
    public int add(Object T) {

        return (5);




    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            @Override
            public boolean hasNext() {
                return false;
            }

            @Override
            public T next() {
                return null;
            }
        };
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Bag{");
        sb.append("container=").append(container);
        sb.append('}');
        return sb.toString();
    }
}
