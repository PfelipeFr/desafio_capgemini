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
			System.out.println("Voc� preisa inserir mais: "+ plus + " caracteres");
		}
		else {
			b = n.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%^&*()-+])(?=\\S+$).{6,}$");
				if (b == true) {
					System.out.println("Sua senha atende aos requisitos.");
				}
				else {
					System.out.println("Sua senha precisa ter ao menos:\n"+"-Cont�m no m�nimo 1 digito;\r\n"
							+ "-No m�nimo 1 letra em min�sculo;\r\n"
							+ "-No m�nimo 1 letra em mai�sculo;\r\n"
							+ "-No m�nimo 1 caractere especial. Os caracteres especiais s�o: !@#$%^&*()-+");
				}
		}
		
		 
		

	}

}
