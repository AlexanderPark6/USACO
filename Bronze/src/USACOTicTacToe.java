import java.io.*;
import java.util.*;
public class USACOTicTacToe {

	static char [][] gameboard = new char[3][3];
	static Set<Character> singleCow = new TreeSet<>();
	static Set<String> teams = new TreeSet<>();
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(new FileReader("tttt.in"));
		PrintWriter out = new PrintWriter("tttt.out");
		
		
		for(int i = 0; i < gameboard.length; i++)
		{
			String line = in.next();
			gameboard[i][0] = line.charAt(0);
			gameboard[i][1] = line.charAt(1);
			gameboard[i][2] = line.charAt(2);
			
		}
		
		//rows
		for(int i = 0; i < gameboard.length; i++)
		{
			check(gameboard[i][0], gameboard[i][1], gameboard[i][2]);
		}
		
		//columns
		for(int i = 0; i < gameboard.length; i++)
		{
			check(gameboard[0][i], gameboard[1][i], gameboard[2][i]);
		}
		
		//diagonals
		check(gameboard[0][0], gameboard[1][1], gameboard[2][2]);
		check(gameboard[0][2], gameboard[1][1], gameboard[2][0]);
		
		out.println(singleCow.size());
		out.println(teams.size());
		
		in.close();
		out.close();
	}
	
	public static void check(char first, char second, char third)
	{
		TreeSet<Character> contained = new TreeSet<>();
		contained.add(first);
		contained.add(second);
		contained.add(third);
		if(contained.size() == 1)
		{
			singleCow.add(contained.first());
		}
		else if(contained.size() == 1)
		{
			teams.add(contained.first() + "" + contained.last());
		}
	}

}
