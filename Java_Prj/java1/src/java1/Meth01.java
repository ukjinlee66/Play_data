package java1;

public class Meth01 {
	// Method 구조 1 : 입력값(O), 반환값(O)
		static int Sum1(int x,int y) { 
			int ans = x+y; 
			return ans; 
		}
		// Method 구조 2 : 입력값(O), 반환값(X)
		static void Sum2(int x,int y) { 
			int ans = x+y; 
			System.out.println(ans);
			//return ans; 
		}
		// Method 구조 3 : 입력값(X), 반환값(O)
		static int Sum3() { 
			int ans = 2000+1000; 
			return ans; 
		}
		// Method 구조 4 : 입력값(X), 반환값(X)
		static void Sum4() { 
			int ans = 20000+10000;
			System.out.println(ans);
			//return ans; 
		}

		public static void main(String[] args) {
			
			int a1 = Sum1(20,10); 
			System.out.println(a1);
			
			Sum2(200, 100);
			
			int a3 = Sum3();
			System.out.println(a3);
			
			Sum4();

		}

}
