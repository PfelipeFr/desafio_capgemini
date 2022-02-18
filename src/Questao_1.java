import java.util.Scanner;

public class Questao_1 {

	public static void main(String[] args) {
		int n;
		String[] myArr;
		Scanner ler = new Scanner(System.in);
		System.out.printf("Informe um número:\n");
		n = ler.nextInt();
		myArr = new String[n];
		 
		
		for (int i = 1; i <= n; i++) { 
			myArr[n-i] = " ";
		}
		for (int j = n ; j > 0; j--) {
			myArr[j - 1] = "*";
			for (int x = 0; x < n; x++) {
				if (x == n - 1) {
					System.out.println(myArr[x]);
				}
				else {
				System.out.print(myArr[x]);
				}
			}
		}
		
	}

}
