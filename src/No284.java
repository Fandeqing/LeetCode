import scala.Int;

import java.util.Arrays;
import java.util.Iterator;

/**
 * Created by wqlin on 18-1-21 10:38.
 */
public class No284 {
    class PeekingIterator implements Iterator<Integer> {
        Iterator<Integer> iterator;
        Integer next;

        public PeekingIterator(Iterator<Integer> iterator) {
            this.iterator = iterator;
        }

        // Returns the next element in the iteration without advancing the iterator.
        public Integer peek() {
            if (next == null)
                next = iterator.next();
            return next;
        }

        // hasNext() and next() should behave the same as in the Iterator interface.
        // Override them if needed.
        @Override
        public Integer next() {
            Integer result;
            if (next == null)
                result = iterator.next();
            else {
                result = next;
                next = null;
            }
            return result;
        }

        @Override
        public boolean hasNext() {
            return next!=null||iterator.hasNext();
        }
    }
}
