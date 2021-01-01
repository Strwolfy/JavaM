package djenerics;

import java.util.Collection;
import java.util.Iterator;
import java.util.Optional;

public class TreeNode { // двоичное дерево поиска

    public <X> void check(Object obj){
        X x1 = (X)obj;
        X x2;
        Optional<X> x3 = Optional.empty();
        X x4[];
        //boolean b5 = (obj instanceof X);
        //boolean b6 = (obj instanceof Optional<X>);
    }


    public <X> void main4() {

    }

    public static void main(String[] args) {


        Collection<?> collection = new Collection<Object>() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator<Object> iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T> T[] toArray(T[] a) {
                return null;
            }

            @Override
            public boolean add(Object o) {
                return false;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean addAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean retainAll(Collection<?> c) {
                return false;
            }

            @Override
            public void clear() {

            }

            @Override
            public boolean equals(Object o) {
                return false;
            }

            @Override
            public int hashCode() {
                return 0;
            }
        };

        Object object = new Object();
        collection.toArray();
        collection.size();
        collection.remove(object);
        collection.contains(object);

        collection.clear();
      //  collection.add(object);
        collection.iterator();
    }

}
