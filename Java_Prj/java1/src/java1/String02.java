package java1;

import java.io.IOException;

public class String02 {

	public static void main(String[] args) throws IOException{
		byte[] bytes = new byte[100];
		
		System.out.print("�Է�: ");
		int readByteNo = System.in.read(bytes);
		System.out.println();
		System.out.println(readByteNo);

		String str = new String(bytes, 0, readByteNo-2);
		System.out.println(str);
	}

}
