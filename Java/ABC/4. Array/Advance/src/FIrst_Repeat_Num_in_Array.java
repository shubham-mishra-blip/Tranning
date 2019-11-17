public class FIrst_Repeat_Num_in_Array {
    static void repeatNo(int[] a){
        int n = a.length;

        for (int i = 0; i < n; i ++)
            for (int j = i+1; j < n; j ++)
                if (a[i] == a[j]) {
                    System.out.println(a[i]);
                    System.exit(0);
                }

    }

    public static void main(String[] args) {
        int[] num = {1,2,3,4,5,5,6,6,7,8,9,9};

        repeatNo(num);
    }
}
