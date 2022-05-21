
import java.util.Scanner;
public class Lab51 {
	
	public static int readArrayLength(String v)
	{
		System.out.print("Dlina massiva " + v);
		Scanner console = new Scanner(System.in);
		int dlina = console.nextInt();
		//console.close();
		return dlina;
	}

	public static void main(String[] args) {
			
			System.out.println("Vvedite vhodnie massivi: ");
			MyVector arr_v1 = new MyVector("v1");
			arr_v1.read(readArrayLength("v1(m): "));
			MyVector arr_v2 = new MyVector("v2");
			arr_v2.read(readArrayLength("v2(n): "));
			MyVector arr_v3 = new MyVector("v3");
			arr_v3.read(readArrayLength("v3(k): "));
			
			arr_v1.show();
			arr_v2.show();
			arr_v3.show();
			
			double L_v1=arr_v1.calculateLength();
			double L_v2=arr_v2.calculateLength();
			double L_v3=arr_v3.calculateLength();
			
			double max = Math.max(L_v3, Math.max(L_v1,L_v2));
			if (max == L_v1)
				System.out.println("Vektor c max dlinoi v1(m): "+L_v1);
		    if (max == L_v2)
				System.out.println("Vektor c max dlinoi v2(n): "+L_v2);
			if (max == L_v3)
				System.out.println("Vektor c max dlinoi v3(k): "+L_v3);

	}

}
