
import org.jetbrains.annotations.NotNull;
import java.util.*;


public class DoubleLinkedList implements Collection<LinkedList<String>> {

    public LinkedList<LinkedList<String>> data;


    public DoubleLinkedList() {
        data = new LinkedList<>();
    }

    public class DoubleIterator implements Iterator {

        Iterator<LinkedList<String>> outIterator;
        Iterator<String> inIterator;

        public DoubleIterator() {
            outIterator = data.iterator();
            inIterator = outIterator.next().iterator();
        }

        @Override
        public boolean hasNext() {
            return outIterator.hasNext() || inIterator.hasNext();

        }

        @Override
        public String next() {

            if (inIterator.hasNext()) {
                return inIterator.next();
            }
            if (outIterator.hasNext()) {
                LinkedList<String> lL = outIterator.next();
                inIterator = lL.iterator();
                return inIterator.next();
            }
            return null;

        }
    }

    public DoubleIterator getIterator() {
        return new DoubleIterator();
    }

    @Override
    public int size() {
        Integer count = 0;
        for (LinkedList<String> linkedList : data) {
            count = count + linkedList.size();
        }
        return count;
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }


    @Override
    public Iterator iterator() {
        return getIterator();
    }

    @Override
    public boolean add(LinkedList o) {
        return data.add(o);

    }

    @Override
    public boolean contains(Object o) {
        return data.contains(o);
    }


    @Override
    public boolean remove(Object o) {

        return data.remove(o);
    }

    @Override
    public boolean addAll(Collection c) {
        return data.addAll(c);
    }

    @Override
    public void clear() {
        data.clear();
    }

    @Override
    public boolean retainAll(Collection c) {
        return data.retainAll(c);
    }

    @Override
    public boolean removeAll(Collection c) {
        return data.removeAll(c);
    }

    @Override
    public boolean containsAll(Collection c) {
        return data.containsAll(c);
    }

    @Override
    public Object[] toArray() {

        return data.toArray();
    }

    @NotNull
    @Override
    public <T> T @NotNull [] toArray(@NotNull T @NotNull [] a) {
        return data.toArray(a);
    }

}


