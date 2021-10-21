package ItsIntheBag;

public interface Container <T> extends Iterable<T>{

    boolean isEmpty();


    T peek();


    int size();

    int add(T item);



}
