import java.util.*;
public class Reverse_Kel {
    public static void reverse(Deque<Integer> q,int k){
        Deque<Integer> s=new ArrayDeque<>();
        for(int i=0;i<k;i++){
            s.addLast(q.removeFirst());
        }
        while(!s.isEmpty()){
            q.addFirst(s.removeFirst());
        }
    }
    public static void main(String args[]){
        Deque<Integer> q=new ArrayDeque<>();
        q.addLast(10);
        q.addLast(20);
        q.addLast(30);
        q.addLast(40);
        q.addLast(50);
        q.addLast(60);
        q.addLast(70);
        q.addLast(80);
        q.addLast(90);
        q.addLast(100);
        int k=5;
        reverse(q,k);
        while(!q.isEmpty()){
            System.out.print(q.remove()+" ");
        }
    }
}
