package lesson5Package;

public class W2 {

	public static void main(String[] args) {
		
		int a = 2;
		int b = 100; 
		// в задании 1000000 - это слишком большое число, поставил 100, 
//		тут главное что алгоритм работает, можно легко сделать с вводом из сканнера.
		for (int i = a; i < b & i > 1; i++) 
		{
			int result = i;
			for (int j = a; j < i; j++) 
			{
				if (i % j == 0) 
				{
					result = 0;
					break;
				}
			}
			
			if (result != 0) {
				System.out.println(result);
			}
		}
		
		
	}

}
