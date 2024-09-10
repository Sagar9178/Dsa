import java.util.Scanner;

public class RangeAddQuery {
    // public static void adding(int[] arr, int l, int r) {
    //     for (int i = l; i <= r; i++) {
    //         arr[i]++;
    //     }
    // }

    public static void adding(int[] arr, int Q){
        Scanner sc=new Scanner(System.in);
        for(int i=1;i<=Q;i++){
            System.out.println("Enter the Query range:");
            int l=sc.nextInt();
            int r=sc.nextInt();

                arr[l]+=1;
            
            if(r+1<arr.length)
                arr[r+1]-=1; 
        }
        for(int i=1;i<arr.length;i++){
            arr[i]+=arr[i-1];
        }
        sc.close();
        
    }

    public static void main(String[] args) {
        // 0 1 2 4 4 4 3 1 1 0 
        int[] arr = new int[10];
    //    adding(arr,4);
        for (int i : arr) {
            System.out.print(i + " ");
        }
        int[] f={1,2,3};
        System.out.println(f.length);
    }

}
