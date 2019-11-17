/*
*
* Find coomon element in given sorted array
*
* i/p - 1,5,10,20,40,80
*        6,7,20,80,100
*        3,4,15,20,30,70,80,120
*
* o/p -  20,80*/

public class Find_Common_Element_in_3_SortedArray {

    public static void commonNum(int[] b1,int[] b2,int[] b3){
        int res =0;
        for (int i = 0; i < b1.length; i ++){
            for (int j = 0; j < b2.length; j ++){
                for(int k = 0; k < b3.length; k ++){
                    if (b1[i] == b2[j]){
                        if (b2[j] == b3[k]) {
                            res = b3[k];
                            System.out.println(res);
                        }
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] a1 = {1,5,10,20,40,80};
        int[] a2 = {6,7,20,80,100};
        int[] a3 = {3,4,15,20,30,70,80,120};

        commonNum(a1,a2,a3);
    }
}
