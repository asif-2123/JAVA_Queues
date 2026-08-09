import java.util.*;
public class Deque_Queue {
    static class Queue{
        static Deque<Integer> deque=new ArrayDeque<>();

        public static void add(int data){
            deque.addLast(data);
        }
        public static int remove(){
            return deque.removeFirst();
        }
        public static int peek(){
            return deque.getFirst();
        }
    }
    public static void main(String args[]){
        Queue s=new Queue();
        s.add(1);
        s.add(2);
        s.add(3);
        s.add(4);
        System.out.println(s.remove());
        System.out.println(s.peek());
    }
}
