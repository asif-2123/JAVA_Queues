import java.util.*;
import java.util.stream.Collectors;
public class Rope_Connect {
    public static int minCost(int ropes[],int n){
        Queue<Integer> q=new PriorityQueue<>();
        for(int i=0;i<n;i++){
            q.add(ropes[i]);
        }
        int cost=0;
        while(q.size()>1){
            int s1=q.poll();
            int s2=q.poll();
            cost+=s1+s2;
            q.add(s1+s2);
        }
        return cost;
    }
    public static void main(String arr[]){
        int ropes[]={1,2,3};
        int n=ropes.length;
        System.out.println(minCost(ropes,n));
    }
}
