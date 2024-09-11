import java.lang.reflect.Array;
import java.util.ArrayList;

public class ReverseInteger {
    public static void main(String[] args) {

        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        for(int i:arr){
            System.out.print(i+" ");
        }

        int o=arr.get(1);
        System.out.println();
        System.out.println(o);
        for(int i=0;i<arr.size()-1;i++){
            arr.set(i,arr.get(i+1));
        }
        arr.set(arr.size()-1,o);
        System.out.println();
        for(int i:arr){
            System.out.print(i+" ");
        }
       System.err.println();
        

    }
}
