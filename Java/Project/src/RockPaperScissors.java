import java.util.*;

class RockPaperScissors 
{
	static String winner(String p1, String p2){
		if(p1 == p2) return "Draw!";

		int p = (p1 + p2).equals("rockscissors") || (p1 + p2).equals("scissorspaper") || (p1 + p2).equals("paperrock")? 1:2;
		return "Player "+p+" Won";
	}
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Player1! Choose any Rock, Paper, Scissors");
		String s1 = scan.nextLine();
		System.out.println("Player2! Choose any option Rock, Paper, Scissors");
		String s2 = scan.nextLine();
	

		String win = winner(s1,s2);
		System.out.println(win);

	}
}
