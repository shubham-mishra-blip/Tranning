/*
*
* There is an array with every element repeated twice except one. find that element
*
* i/p - 1,1,2,3,3,4,4,5,5
*
* o/p - 2
*
* */

public class FindUnrepeatedNum {

    public static void Unrepeated(int[] a){
        int n = a.length;
        int temp = 0;

        for (int i = 0; i < n; i ++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] == a[j]){
                    ++i;
                    break;
                }
                else
                    temp = a[i];
            }
        }
        System.out.println(temp);
    }
    public static void main(String[] args) {
        int[] arr = {1,1,2,3,3,4,4,5,5,6,6,7,7,9,9};

        Unrepeated(arr);
    }
}
