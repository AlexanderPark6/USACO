package main;
import java.io.*;
public class USACOTeleportation {

	public static void main(String[] args) throws IOException {


		BufferedReader in = new BufferedReader(new FileReader("teleport.in"));
		PrintWriter out = new PrintWriter("teleport.out");
		
		String[] input = in.readLine().split(" ");
		int a = Integer.parseInt(input[0]);
		int b = Integer.parseInt(input[1]);
		int x = Integer.parseInt(input[2]);
		int y = Integer.parseInt(input[3]);
		
		
		int answer = Math.abs(a-b);
		answer = Math.min(answer, Math.abs(a-x) + Math.abs(b-y));
		answer = Math.min(answer, Math.abs(a-y) + Math.abs(b-x));
		
		out.println(answer);
		in.close();
		out.close();
		
	
	}

}
