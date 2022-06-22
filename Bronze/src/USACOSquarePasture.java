
import java.io.*;
import java.util.*;
public class USACOSquarePasture {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(new FileReader("square.in"));
		PrintWriter out = new PrintWriter("square.out");
		
		int x1 = in.nextInt();
		int y1 = in.nextInt();
		int x2 = in.nextInt();
		int y2 = in.nextInt();
		int x3 = in.nextInt();
		int y3 = in.nextInt();
		int x4 = in.nextInt();
		int y4 = in.nextInt();
		
		int left = Math.min(x1, x3);
		int right = Math.max(x2, x4);
		int bottom = Math.min(y1, y3);
		int top = Math.max(y2, y4);
		
		int side = Math.max(right-left, top-bottom);
		out.println(side * side);
		in.close();
		out.close();
	}

}
