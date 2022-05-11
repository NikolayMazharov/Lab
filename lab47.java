import java.util.Scanner;

public class lab47 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final int m = 4;
		
		
		System.out.println("Vvedite dannie matrici: ");
		
		Scanner console = new Scanner(System.in);
		int[][] matrix = new int[m][m];
		int i, j;
		
		
		
		for(i=0;i<m;i++)
			for(j=0;j<m;j++)
				matrix[i][j]= console.nextInt();
		
		System.out.println("Dano matricu: ");
		
		for(i=0;i<m;i++)
		{
			for(j=0;j<m;j++)
				System.out.print(matrix[i][j] + "\t");

			System.out.println();
		}
		
		int k;
		for(k=0;k<m;k++)
		{
			for(j=0;j<m;j++)
				if(matrix[k][j]!=matrix[j][k])
					break;	
			
			if(j==m)
				System.out.println("k = "+k);
			else
				System.out.println("Net sovpadenii");
		}
		
	int sum;
		
		for(i=0;i<m;i++)
		{
			sum=0;
			
			for(j=0;j<m;j++)
				if(matrix[i][j]<0)
					break;
			if(j==m)
				System.out.println("Net otricatelnih chisel");
			else
			{
				for(j=0;j<m;j++)
					sum+=matrix[i][j];
				System.out.println("Summa chisel: "+sum);
			}
			
		}

	}

}
