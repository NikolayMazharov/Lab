import java.util.Scanner;

public class Lab46 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final int m = 3;
		final int n = 4;
		
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
		int[] arr = new int[m*n*2];
		int k=0;
		int length=0;
		
		
		for(i=0;i<m;i++)
		{
			sedlo=Integer.MAX_VALUE;
			for(j=0;j<n;j++)
				if(matrix[i][j]<sedlo)
					sedlo=matrix[i][j];
				
			for(j=0;j<n;j++)
				if(matrix[i][j]==sedlo)
				{
					sedlo=matrix[i][j];
					arr[k]=i;  
					arr[k+1]=j;
					k+=2;
					length+=2;
				}
		}
		for(k=0;k<length;k+=2)
		{
			for(i=0;i<m;i++)
				if(matrix[arr[k]][arr[k+1]]<matrix[i][arr[k+1]])
					break;
			
			if(i==m)
			{
				System.out.println("Sedlo i: "+ arr[k]);
				System.out.println("Sedlo j: "+ arr[k+1]);
			}
		}
		
		
						
	}
}
