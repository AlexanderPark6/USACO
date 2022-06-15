package main;

public class USACOATeam {

	public static void main(String[] args) {
		int n = Integer.parseInt(System.console().readLine());
		int takenProblems = 0;
		for(int i = 0; i < n; i++)
		{
			int ans = 0;
			int[] problem = new int[3];
			problem[i] = Integer.parseInt(System.console().readLine());
			for(int j = 0; j < problem.length; j++)
			{
				if(problem[i] == 1)
				{
					ans++;
				}
			}
			if(ans >= 2)
			{
				takenProblems++;
			}
		}
		System.out.println(takenProblems);

	}

}
