import java.util.*;
public class Binary {
    public static void getBinary(int n){
        Queue<String> q=new ArrayDeque<>();
            String str="1";
            q.add(str);
            for(int i=0;i<n;i++){
                str=q.remove();
                System.out.print(str+" ");
                q.add(str+"0");
                q.add(str+"1");
            }
    }
    public static void main(String args[]){
        getBinary(5);
    }
}
