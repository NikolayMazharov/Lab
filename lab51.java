import java.util.Scanner;

public class lab51 {
	
	
	public static int[] dannie_massiva()
	{
		System.out.println("Dlina: ");
		Scanner console = new Scanner(System.in);
		final int m = console.nextInt();
		System.out.println("Dannie: ");
		int[] arr_v= new int[m];
		int i;
		for (i=0; i<m; i++)
			arr_v [i] = console.nextInt();
		return arr_v;
	}
	
	public static int dlina_vektora()
	{
		int[] arr_v= dannie_massiva();
		int i;
		int L_v=0;
		for (i=0; i<arr_v.length; i++)
			L_v+=arr_v[i]*arr_v[i];
		return L_v;
	}

	public static void main(String[] args) {
		
		System.out.println("Vvedite vhodnie dannie: ");
		System.out.println("Parametri massiva v1: ");
		int L_v1=dlina_vektora();
		System.out.println("Parametri massiva v2: ");
		int L_v2=dlina_vektora();
		System.out.println("Parametri massiva v3: ");
		int L_v3=dlina_vektora();
		
		if(L_v1>=L_v2 && L_v1>=L_v3)
			System.out.println("Vektor c max dlinoi v1: "+L_v1);
		else if(L_v2>=L_v1 && L_v2>=L_v3)
			System.out.println("Vektor c max dlinoi v2: "+L_v2);
		else
			System.out.println("Vektor c max dlinoi v3: "+L_v3);
		
	
	}

}
