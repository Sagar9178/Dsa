public class Merge {
    public static void main(String[] args) {
        int[] arr = { 2, 1, 3, 5, 4, 5, 7, 6 };

        int[] pre = new int[arr.length];
        pre[0] = arr[0];
        int[] suf = new int[arr.length];
        suf[arr.length - 1] = arr[arr.length - 1];
        
        for (int i = 1; i < arr.length; i++) {
            pre[i]=(i==0)?arr[i]:Math.max(arr[i], pre[i-1]);
            // if (arr[i] >= pre[i - 1]) {
            //     pre[i] = arr[i];
            // } else {
            //     pre[i] = pre[i - 1];
            // }
        }


        for (int i = arr.length - 2; i >= 0; i--) {
            suf[i]= i==arr.length-1?arr[arr.length-1]:Math.max(arr[i], suf[i+1]);
            // if (arr[i] >= suf[i + 1]) {
            //     suf[i] = arr[i];
            // } else {
            //     suf[i] = suf[i + 1];
            // }
        }
        int q = 6;
        System.out.println(Math.max(pre[q - 1], suf[q + 1]));
    }
}
