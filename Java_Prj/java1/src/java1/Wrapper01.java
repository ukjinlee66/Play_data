package java1;

public class Wrapper01 
{
	public static void main(String[] args) 
	{
		int i1 = 10; // ���� : Stack
		Integer i2 = new Integer(20); 
			// ������ : Heap(data) -> Stack(�ּ�);  
		int i3 = i2;     // Unboxing
		Integer i4 = i1; // Boxing
		
		//Boxing
		Integer obj1 = new Integer(100);
		Integer obj2 = new Integer("200");
		Integer obj3 = Integer.valueOf("300");
		
		//Unboxing
		int value1 = obj1.intValue();
		int value2 = obj2.intValue();
		int value3 = obj3.intValue();
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
	}
}
