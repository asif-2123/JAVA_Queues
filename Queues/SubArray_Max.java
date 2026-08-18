import java.util.*;
public class SubArray_Max {
    public static void maxArr(int arr[], int n, int k){
        Deque<Integer> q=new ArrayDeque<>();
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            q.addLast(arr[i]);
            if(q.size()==k){             
                max=Math.max(Math.max(max,q.peekFirst()),Math.max(q.peekLast(),arr[i-1]));    
                System.out.print(max+" ");
                q.removeFirst();
            }    
        }
    }
    public static void main(String args[]){
        int arr[]={1,2,3,1,4,5,2,3,6};
        int n=arr.length;
        int k=3;
        maxArr(arr,n,k);
    }    
}
