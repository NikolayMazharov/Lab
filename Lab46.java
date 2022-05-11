import java.util.Scanner;

public class Lab46 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final int m = 4;
		final int n = 3;
		
		System.out.println("Vvedite dannie matrici: ");
		
		Scanner console = new Scanner(System.in);
		int[][] matrix = new int[m][n];
		int i, j;
		
		
		
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
		int sum;
		
		for(i=0;i<m;i++)
		{
			sum=0;
			
			for(j=0;j<n;j++)
				if(matrix[i][j]<0)
					break;
			if(j==n)
				System.out.println("Net otricatelnih chisel");
			else
			{
				for(j=0;j<n;j++)
					sum+=matrix[i][j];
				System.out.println("Summa chisel: "+sum);
			}
			
		}
		
		int sedlo;
		int sedlo_i=0;
		int sedlo_j=0;
		
		for(i=0;i<m;i++)
		{
			sedlo=Integer.MAX_VALUE;
			for(j=0;j<n;j++)
				if(matrix[i][j]<sedlo)
				{
					sedlo=matrix[i][j];
					sedlo_i=i;
					sedlo_j=j;
				}
			
			for(i=0;i<m;i++)
				if(matrix[sedlo_i][sedlo_j]<matrix[i][sedlo_j])
					break;
			
				if(i==m)
				{
				System.out.println("Sedlo i: "+ sedlo_i);
				System.out.println("Sedlo j: "+ sedlo_j);
				}
		}	
		
						
	}
}
