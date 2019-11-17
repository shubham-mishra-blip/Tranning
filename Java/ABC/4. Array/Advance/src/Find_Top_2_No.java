import java.util.Arrays;

public class Find_Top_2_No {
    static void topNo(int[] a){
        int n = a.length;
        Arrays.sort(a);

        //Removing Dublicate element
        int k = 0;
        int[] res = new int[n];
        for (int i = 0; i < n-1; i ++)
            if (a[i] != a[i+1])
                res[k++] = a[i];

            res[k++] = a[n-1];

        System.out.println(res[k-1]+" , "+res[k-2]);
    }

    public static void main(String[] args) {
        int[] num = {1,4,2,8,5,9,7,8,3,2,9};

        topNo(num);
    }
}
