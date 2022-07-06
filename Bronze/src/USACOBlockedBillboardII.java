import java.io.*;
import java.util.*;
public class USACOBlockedBillboardII {

	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new FileReader("billboard.in"));
		PrintWriter out = new PrintWriter("billboard.out");
		StringTokenizer badBoard = new StringTokenizer(in.readLine());
		int x1 = Integer.parseInt(badBoard.nextToken());
		int y1 = Integer.parseInt(badBoard.nextToken());
		int x2 = Integer.parseInt(badBoard.nextToken());
		int y2 = Integer.parseInt(badBoard.nextToken());
		
		StringTokenizer goodBoard = new StringTokenizer(in.readLine());
		int x3 = Integer.parseInt(goodBoard.nextToken());
		int y3 = Integer.parseInt(goodBoard.nextToken());
		int x4 = Integer.parseInt(goodBoard.nextToken());
		int y4 = Integer.parseInt(goodBoard.nextToken());
		
		//Count how many corners of the billboard are currently covered
		int numCorners = 0;
		if(covered(x1,y1,x3,y3,x4,y4))
			numCorners += 1;
		if(covered(x1,y2,x3,y3,x4,y4))
			numCorners += 1;
		if(covered(x2,y1,x3,y3,x4,y4))
			numCorners += 1;
		if(covered(x2,y2,x3,y3,x4,y4))
			numCorners += 1;
		
		if(numCorners < 2) {
			out.println((x2-x1)*(y2-y1));
		}
		else if(numCorners == 4) {
			out.println(0);
		}
		else {
			int xl = Math.max(x1, x3);
			int xr = Math.min(x2, x4);
			int yl = Math.max(y1, y3);
			int yr = Math.min(y2, y4);
			
			out.println((x2-x1)*(y2-y1) - (xr-xl)*(yr-yl));
		}
		in.close();
		out.close();

	}
	
	public static boolean covered(int x, int y, int x1, int y1, int x2, int y2) {
		/*
		 * returns true if (x,y) is covered by the rectangle bounded
		 * by (x1,y1) and (x2,y2)
		 * 
		 * returns false otherwise
		 */
		
		return x >= x1 && x <= x2 && y >= y1 && y <= y2;
		
	}

}
