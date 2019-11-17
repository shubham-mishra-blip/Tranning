import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


class Difference {
    private int[] elements;
    public int maximumDifference;

    Difference(int[] elements){
        this.elements = elements;
    }

    void computeDifference(){
        int a[] = new int[elements.length*elements.length];
        int k = 0;
        int n = elements.length;
        for(int i = 0; i < elements.length; i ++){
            for(int j = i+1; j < elements.length; j ++){
                a[k] = Math.abs(elements[i] - elements[j]);
                k++;
            }
        }
        Arrays.sort(a);
        maximumDifference = a[a.length-1];
    }


} // End of Difference class

public class HackerRankScope {

    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}