package java1;

public class String03 {

	public static void main(String[] args) {
		String str1 = "Welcome to KoreaEducation";
		System.out.println(str1);
		System.out.println(str1.toLowerCase());
		System.out.println(str1.toUpperCase());
		
		String str2 = "   Ja va   ";
		System.out.println(str2.trim());
		String str3 = String.valueOf(10);
		String str4 = String.valueOf(10.5);
		String str5 = String.valueOf(false);
		
		String str6 = "��� �� ���� �ٳ���";
		String[] strArr = str6.split(" ");
		for(String fruit : strArr) {System.out.println(fruit);}
		
		System.out.println(str1.replace("e", "z"));
		System.out.println(str1.replace("Korea", "KR"));
		
		System.out.println(str1.length());
		System.out.println(str1.indexOf("Edu"));
		System.out.println(str1.indexOf("Education"));
		System.out.println(str1.indexOf("KR"));
		
		if(str1.indexOf("KR")== -1) {
			System.out.println("KR �� ������ ���");
		}
		else { System.out.println("KR�� ���õ� ���"); }
		
		if(str1.indexOf("Edu")== -1) {
			System.out.println("������ ������ ���");
		}
		else { System.out.println("������ ���õ� ���"); }
		
		String str7 = "Welcome to KREducation";
		System.out.println(str7.substring(3,13));
		
		String ssn = "700101-1230123";
		char sex = ssn.charAt(7);
		switch (sex) {
			case '1':
			case '3':
				System.out.println("���� �Դϴ�.");
				break;
			case '2':
			case '4':
				System.out.println("���� �Դϴ�.");
				break;
		}
	}

}
