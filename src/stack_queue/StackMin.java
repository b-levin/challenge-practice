package stack_queue;

import java.util.*;


/*stack with pop(), push(), and min()
    - all O(1)
    - min returns minimum value in stack
*/
public class StackMin<E> {

    private Node<E> top;
    private Node<E> min;

    public StackMin() {
        this.top = null;
        this.min = null;
    }

    //pushes item to stackmin
    public void push(E item) {
        Node<E> newNode = new Node<>(item);
        if (this.top == null) {
            this.top = newNode;
            this.min = newNode;
        } else {
            newNode.nextItem = this.top;
            this.top = newNode;

            Node<E> curMin = this.min;
            
        }
    }

    //returns value of minimum item
    public E min() {
        return (min.item);
    }

    //pops item off of stack
    public E pop() {
        E out = top.item;
        top = top.nextItem;
        min = min.nextMin;
        return out;
    }

    private static class Node<E> {
        E item;
        Node<E> nextItem;
        Node<E> nextMin;

        public Node(E item) {
            this.item = item;
        }
    }
    
}