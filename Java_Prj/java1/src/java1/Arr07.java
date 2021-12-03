package java1;

public class Arr07 
{

	public static void main(String[] args) 
	{
		int[][] iArr1 = {{10,20,30},{40,50,60}};
		for(int i=0;i<iArr1.length;i++)
		{
			for(int j=0;j<iArr1[i].length;j++)
				System.out.print(iArr1[i][j]+" ");
			System.out.println("");
		}
	}

}
