import java.util.Scanner;

public class Lab45 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final int m = 4;
		final int n = 4;
		
		System.out.println("Vvedite dannie matrici: ");
		
		Scanner console = new Scanner(System.in);
		int[][] matrix = new int[m][n];
		int i, j,k, sum;
		
		
		
		for(i=0;i<m;i++)
			for(j=0;j<n;j++)
				matrix[i][j]= console.nextInt();
		
		System.out.println("Dano matricu: ");
		
		for(i=0;i<m;i++)
		{
			for(j=0;j<n;j++)
				System.out.print(matrix[i][j] + "\t");

			System.out.println();
		}
		
	

		
		
		for(j=0;j<n;j++)
		{	
			int s = 0;
			for(i=0;i<m;i++)
			{
				if(matrix[i][j]>=0)
					s+=matrix[i][j];
				else
					break;
				}
			if(i==n)
			System.out.println("Summa: "+s);
			else
			System.out.println("Ect otricatelnie chisla");
		}
		
		
	    int min = Integer.MAX_VALUE;
		
		
		for(k=0;k<=m/2;k++)
		{
			sum=0;																
			for(i=1+k;i<m;i++)
				sum+=matrix[i][m-i+k];
			if(min>sum)
				min=sum;
				
			sum=0;
			for(i=0;i<m-1-k;i++)
				sum+=matrix[i][m-2-i-k];
			if(min>sum)
				min=sum;
			}
			System.out.println("Minimum sum diagonalei: "+min);

	}

}
