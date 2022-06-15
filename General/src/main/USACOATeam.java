package main;

import java.util.Scanner;

public class USACOATeam {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int ans = 0;
		int n = in.nextInt();
		for(int i = 0; i < n; i++)
		{
			int a = in.nextInt();
			int b = in.nextInt();
			int c = in.nextInt();
			if(a+b+c >= 2)
			{
				ans += 1;
			}
		}
		System.out.println(ans);
	}

}
