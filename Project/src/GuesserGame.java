import java.util.Scanner;
//There are 4 Player and 1 Umpire. One player is guesser he/she give a number to umpair and left 3 player tell which number guess he/she was and all
//player give it to umpire and umpire check it which answer is correct. Thatsall.


//Guesser Object
class Guesser{
    int gnum;
    int guessNum(){
        System.out.println("Enter any Number");
        Scanner scan = new Scanner(System.in);
        gnum = scan.nextInt();
        return gnum;
    }
}

//Player Object
class Player{
    int pnum;
    int guessNum(){
       System.out.println("Enter Guess number");
       Scanner scan = new Scanner(System.in);
       pnum = scan.nextInt();
       return pnum;
    }
}

//Umpire Object
class Umpire{
    int no_from_guesser;
    int no_from_p1;
    int no_from_p2;
    int no_from_p3;

    void addUmpire(){
        Guesser g = new Guesser();
        no_from_guesser = g.guessNum();
    }
    void addPlayer1(){
        Player p1 = new Player();
        no_from_p1 = p1.guessNum();
    }
    void addPlayer2(){
        Player p2 = new Player();
        no_from_p2 = p2.guessNum();
    }
    void addPlayer3(){
        Player p3 = new Player();
        no_from_p3 = p3.guessNum();
    }
    void compare(){
        if(no_from_p1 == no_from_guesser){
            System.out.println("Player 1 won the MaTcH, COngo");
        }
        else if (no_from_p2 == no_from_guesser){
            System.out.println("Player 2 won the MaTcH, Congo");
        }
        else if (no_from_p3 == no_from_guesser){
            System.out.println("Player 3 Won the MaTcH, COngo");
        }
        else
            System.out.println("Match Fails, Try Again");
    }

}

public class GuesserGame {

    public static void main(String ...args){                               //Second Way :)
        Umpire ump = new Umpire();
        ump.addUmpire();
        ump.addPlayer1();
        ump.addPlayer2();
        ump.addPlayer3();
        ump.compare();
    }
}
