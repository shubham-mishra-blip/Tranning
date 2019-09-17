//Temple

public class Pattern11 {

    public static void  main(String ...args){

        for (int i=1; i<=5; i++){
            for (int k=5; k>=i; k--){
                System.out.print(" ");
            }
            for (int j=1; j<= 2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i=1; i<=5; i++){
            System.out.print(" ");
            for (int j=1; j<= 9; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
