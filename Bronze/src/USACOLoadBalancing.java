import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class USACOLoadBalancing {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	    BufferedReader in = new BufferedReader(new FileReader("balancing.in"));
	    PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("balancing.out")));
	    
	    StringTokenizer numberOfCows = new StringTokenizer(in.readLine());
	    int n = Integer.parseInt(numberOfCows.nextToken()); //maximum distance a cow could go
	    
	    int[] xCoord = new int[n];
	    int[] yCoord = new int[n];
	    
	    for(int i = 0; i < n; i++)
	    {
	    	numberOfCows = new StringTokenizer(in.readLine());
	    	xCoord[i] = Integer.parseInt(numberOfCows.nextToken());
	    	yCoord[i] = Integer.parseInt(numberOfCows.nextToken());
	    }
	 // in the absolute worst case, N cows will be in one quadrant
	    int ans = n;
	    
	    for(int xIndex = 0; xIndex < n; xIndex++) {
			for(int yIndex = 0; yIndex < n; yIndex++) {
				// identify the fence location
				// vertical fence at x=xDiv
				// horizontal fence at y=yDiv
				int xDiv = xCoord[xIndex]+1;
				int yDiv = yCoord[yIndex]+1;
				int upperLeft = 0;
				int upperRight = 0;
				int lowerLeft = 0;
				int lowerRight = 0;
				// identify which quadrant each cows lands in
				for(int i = 0; i < n; i++) {
					if(xCoord[i] < xDiv && yCoord[i] < yDiv) {
						lowerLeft++;
					}
					if(xCoord[i] < xDiv && yCoord[i] > yDiv) {
						upperLeft++;
					}
					if(xCoord[i] > xDiv && yCoord[i] < yDiv) {
						lowerRight++;
					}
					if(xCoord[i] > xDiv && yCoord[i] > yDiv) {
						upperRight++;
					}
				}
				// figure out which region has the most cows
				int worstRegion = 0;
				if(upperLeft > worstRegion) {
					worstRegion = upperLeft;
				}
				if(upperRight > worstRegion) {
					worstRegion = upperRight;
				}
				if(lowerLeft > worstRegion) {
					worstRegion = lowerLeft;
				}
				if(lowerRight > worstRegion) {
					worstRegion = lowerRight;
				}
				// determine if we have found a better pair of fences
				if(worstRegion < ans) {
					ans = worstRegion;
				}
			}
		}
	    out.println(ans);
	    out.close();
	}

}
