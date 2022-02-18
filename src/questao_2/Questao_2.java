package questao_2;

import java.util.Scanner;

public class Questao_2 {

	public static void main(String[] args) {
		String n;
		boolean b;
		Scanner ler = new Scanner(System.in);
		System.out.printf("Informe uma senha:\n");
		n = ler.next();
		ler.close();
		
		if (n.length() < 6) {
			int plus;
			plus = 6 - n.length();
			System.out.println("Você preisa inserir mais: "+ plus + " caracteres");
		}
		else {
			b = n.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%^&*()-+])(?=\\S+$).{6,}$");
				if (b == true) {
					System.out.println("Sua senha atende aos requisitos.");
				}
				else {
					System.out.println("Sua senha precisa ter ao menos:\n"+"-Contém no mínimo 1 digito;\r\n"
							+ "-No mínimo 1 letra em minúsculo;\r\n"
							+ "-No mínimo 1 letra em maiúsculo;\r\n"
							+ "-No mínimo 1 caractere especial. Os caracteres especiais são: !@#$%^&*()-+");
				}
		}
		
		 
		

	}

}
