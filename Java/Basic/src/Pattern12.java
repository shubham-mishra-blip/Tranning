//Temple

public class Pattern12 {

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

        for (int i=1; i<=3; i++){
            System.out.print(" ");
            for (int j=1; j<= 9; j++){
                if (j==4||j==5||j==6){
                    System.out.print(" ");
                }
                else
                    System.out.print("*");
            }
            System.out.println();
        }
    }
}
