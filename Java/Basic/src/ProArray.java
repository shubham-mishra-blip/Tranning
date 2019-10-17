public class ProArray {

    static int MissNum(int a[], int n){
        int ans = (n+1)*(n+2)/2;
        for (int i =0; i < n; i++){
            ans -= a[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 5};

        int op = MissNum(arr, 4);
        System.out.println(op);
    }
}
