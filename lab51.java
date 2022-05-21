/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.util.Scanner;

public class Main {
	
	public static int readArrayLength(String v)
	{
		System.out.print("Dlina massiva " + v);
		Scanner console = new Scanner(System.in);
		final int dlina = console.nextInt();
		return dlina;
	}
	
	public static int[] readArray(final int dlina)
	{	
		int[] arr= new int[dlina];
	//	int i; 
		Scanner console = new Scanner(System.in);
		for (int i=0; i<arr.length; i++) // можно инициализировать сразу в форе
		{
			System.out.print("Parametr "+(i+1)+"-go danogo = ");
			arr [i] = console.nextInt();
		}
		return arr;
	}
	
//	public static int[] vivodMassiva(int[] arr, String v)
    public static void showArray(final int[] arr, final String v) // ф-ция вывода массива может ничего не возвращать 
    // тип возвращаемого значения void. так как она массив не изменяет. кроме єтого, роскольку в данной ф-ции
    // массив меняться не будет, он может посілаться в ф-цию как final параметр. почитай про єто!
	{
		System.out.print("Massiv " + v); // test comment
	//	int i;
		for (int i=0; i<arr.length; i++) // можно инициализировать сразу в форе
			System.out.print(" "+arr[i]);
		System.out.println();
	//	return arr; void-ф-ции ничего не возвращают
	}
	
	public static double calculateVectorLength(final int[] arr, final String v)
	{
	//	int i;
		double L_v=0;
		for (int i=0; i<arr.length; i++)
			L_v+=arr[i]*arr[i];
		L_v=Math.sqrt(L_v);
		// єто не длина вектора. длина вектора -- єто корень квадратній из суммі квадратов всех координат. переделать!
		System.out.println("Dlina vektora "+v +L_v);
		return L_v;
	}


	public static void main(String[] args) {
		
		System.out.println("Vvedite vhodnie massivi: ");
		int[] arr_v1 = readArray(readArrayLength("v1(m): "));
		int[] arr_v2 = readArray(readArrayLength("v2(n): "));
		int[] arr_v3 = readArray(readArrayLength("v3(k): "));
		
		// вівод отдельно, расчет длині отдельно
		
		showArray(arr_v1,"v1(m): ");
		showArray(arr_v2,"v2(n): ");
		showArray(arr_v3,"v3(k): ");
		
		double L_v1=calculateVectorLength(arr_v1, "v1(m)= ");
		double L_v2=calculateVectorLength(arr_v2, "v2(n)= ");
		double L_v3=calculateVectorLength(arr_v3, "v3(k)= ");
		
		
		// в твоем случае будет відаваться только один вектор с максимальной длиной
		// а надо відать все такие вектора
		// Видати вектор з max довжиною серед векторів v1, v2, v3 (видати всі таки вектори).
		// переделать!
		double max = Math.max(L_v3, Math.max(L_v1,L_v2));
		if (max == L_v1)
			System.out.println("Vektor c max dlinoi v1(m): "+L_v1);
	    if (max == L_v2)
			System.out.println("Vektor c max dlinoi v2(n): "+L_v2);
		if (max == L_v3)
			System.out.println("Vektor c max dlinoi v3(k): "+L_v3);
		
	
	}

}
