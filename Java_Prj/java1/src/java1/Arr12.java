package java1;

public class Arr12 
{

	public static void main(String[] args) 
	{
		int[] iArr1 = {10,20,30};
		int[] iArr2 = {10,20,30};
		int[] iArr3 = iArr1;
		iArr1[1] = 2000;
		for(int i:iArr1) { System.out.print(i + " ");}
		System.out.println(" ");
		for(int i:iArr2) { System.out.print(i + " ");}
		System.out.println(" ");
		for(int i:iArr3) { System.out.print(i + " ");}
		System.out.println(" ");
//		for(int i=0;i<sArr1.length;i++)
//		{
//			for(int j=0;j<sArr1[i].length;j++)
//				System.out.print(sArr1[i][j]+" ");
//			System.out.println("");
//		}
		String[] sArr1 = {"김","방","배"};
		String[] sArr2 = {"김","방","배"};
		String[] sArr3 = {"김","방","배"};
		
		sArr1[1] ="포도";
		for(String i:sArr1) {System.out.print(i + " ");}
		System.out.println(" ");
		for(String i:sArr2) {System.out.print(i + " ");}
		System.out.println(" ");
		for(String i:sArr2) {System.out.print(i + " ");}
		System.out.println(" ");
	}
}
