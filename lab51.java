import java.util.Scanner;

public class lab51 {
	
	public static int dlinaMassiva(String v)
	{
		System.out.print("Dlina massiva " + v);
		Scanner console = new Scanner(System.in);
		final int dlina = console.nextInt();
		return dlina;
	}
	
	public static int[] dannieMassiva(int dlina)
	{	
		int[] arr= new int[dlina];
		int i;
		Scanner console = new Scanner(System.in);
		for (i=0; i<arr.length; i++)
		{
			System.out.print("Parametr "+(i+1)+"-go danogo = ");
			arr [i] = console.nextInt();
		}
		return arr;
	}
	
	public static int[] vivodMassiva(int[] arr, String v)
	{
		System.out.print("Massiv " + v);
		int i;
		for (i=0; i<arr.length; i++)
			System.out.print(" "+arr[i]);
		System.out.println();
		return arr;
	}
	
	public static int dlinaVektora(int[] arr, String v)
	{
		int i;
		int L_v=0;
		for (i=0; i<arr.length; i++)
			L_v+=arr[i]*arr[i];
		System.out.println("Dlina vektora "+v +L_v);
		return L_v;
	}

	public static void main(String[] args) {
		
		System.out.println("Vvedite vhodnie massivi: ");
		int[] arr_v1 = dannieMassiva(dlinaMassiva("v1(m): "));
		int[] arr_v2 = dannieMassiva(dlinaMassiva("v2(n): "));
		int[] arr_v3 = dannieMassiva(dlinaMassiva("v3(k): "));
		
		int L_v1=dlinaVektora(vivodMassiva(arr_v1,"v1(m): "),"v1(m)= ");
		int L_v2=dlinaVektora(vivodMassiva(arr_v2,"v2(n): "),"v2(n)= ");
		int L_v3=dlinaVektora(vivodMassiva(arr_v3,"v3(k): "),"v3(k)= ");
		
		
		
		if(L_v1>=L_v2 && L_v1>=L_v3)
			System.out.println("Vektor c max dlinoi v1(m): "+L_v1);
		else if(L_v2>=L_v1 && L_v2>=L_v3)
			System.out.println("Vektor c max dlinoi v2(n): "+L_v2);
		else
			System.out.println("Vektor c max dlinoi v3(k): "+L_v3);
		
	
	}

}
