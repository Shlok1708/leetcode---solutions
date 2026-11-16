// Java Iterator interface reference:
// https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html

import java.util.Iterator;

class PeekingIterator implements Iterator<Integer> {
    private Iterator<Integer> iterator;
    private Integer nextElement;

    public PeekingIterator(Iterator<Integer> iterator) {
        this.iterator = iterator;
        // Initialize the cache with the first element if available
        if (this.iterator.hasNext()) {
            this.nextElement = this.iterator.next();
        } else {
            this.nextElement = null;
        }
    }
    
    // Returns the next element in the iteration without advancing the iterator.
    public Integer peek() {
        return nextElement;
    }
    
    // hasNext() and next() should behave the same as in the Iterator interface.
    @Override
    public Integer next() {
        Integer res = nextElement;
        // Advance and cache the next element
        if (iterator.hasNext()) {
            nextElement = iterator.next();
        } else {
            nextElement = null;
        }
        return res;
    }
    
    @Override
    public boolean hasNext() {
        return nextElement != null;
    }
}