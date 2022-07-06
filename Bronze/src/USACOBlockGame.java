import java.io.*;
import java.util.*;
public class USACOBlockGame {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new FileReader("blocks.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("blocks.out")));
		
		StringTokenizer st = new StringTokenizer(in.readLine());
		int N = Integer.parseInt(st.nextToken());
		int[] ret = new int[26];
		
		for(int i = 0; i < N; i ++) {
			st = new StringTokenizer(in.readLine());
			int[] count1 = new int[26];
			int[] count2 = new int[26];
			String word1 = st.nextToken();
			
			//count frequencies in each word
			for(int j = 0; j < word1.length(); j++) {
				count1[(int) word1.charAt(j) - 97] ++;
			}
			
			String word2 = st.nextToken();
			
			for(int j = 0; j < word2.length(); j++) {
				count2[(int) word2.charAt(j) - 97] ++;
			}
			
			//find max of each letter
			for(int j = 0; j < 26; j++) {
				ret[j] += Math.max(count1[j], count2[j]);
			}
		
		
		}
		
		for(int i : ret){ 
			out.println(i);
		}
		
		in.close();
		out.close();
	}

}
