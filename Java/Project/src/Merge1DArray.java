import java.util.Arrays;

/**
 *
 * Wap to merge 1D Array in one array and avoiding repearting number with sorted form
 *
 * i/p - 4,5,6,7,8
 *       2,3,4,5,6,7,8,9,10
 *
 * o/p - 2,3,4,5,6,7,8,9,10
 **/

public class Merge1DArray {

    public static void mergeArray(int[] arr1 , int[] arr2){
        int n = arr1.length + arr2.length;
        int[] res = new int[n];

        System.out.println(n);
        int k = 0;
        for(int i = 0; i < n; i ++){
            if(i < arr1.length){
                res[i] = arr1[i];
            }
            else{
                res[i] = arr2[k];
                k++;
            }

        }
        Arrays.sort(res);

        for (int i = 0; i < n; i ++){
            System.out.print(res[i]+ " , ");
        }
        System.out.println();

        int j = 0;
        int[] t = new int[n];
        for(int i = 0; i < n-1; i ++)
            if (res[i] != res[i+1])
                t[j++] = res[i];

        t[j++] = res[n-1];

        for (int i = 0; i < j-1; i ++)
            System.out.print(t[i]+" , ");

        System.out.println(t[j-1]);

        System.out.println();
    }

    public static void main(String[] args) {
        int[] a1 = {4,5,6,7,8};
        int[] a2 = {2,3,4,5,6,7,8,9,10};

        mergeArray(a1,a2);
    }
}
