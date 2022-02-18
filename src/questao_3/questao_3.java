package questao_3;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
  
public class questao_3 {
    public static void main(String[] args) {
    	String n;
    	
    	
    	Scanner ler = new Scanner(System.in);
		System.out.printf("Informe o anagrama:\n");
		n = ler.next();
		ler.close();
		
		analisaAnagrama(n);// recebendo a string a ser analisada como parametro.
    }
  
    static void analisaAnagrama(String s){
        HashMap<String, Integer> anagramas = new HashMap<>();
        int t =s.length();
  
        for(int i = 0; i < t; i++){// O laço for está sendo usado para colocar cada letra do objeto do tipo String detro do array.
            for(int j = i; j < t; j++){
                char[] valC = s.substring(i, j+1).toCharArray();
                Arrays.sort(valC);
                String val = new String(valC);//Transforma o valor em uma String.
                if (anagramas.containsKey(val)) // Compara com os valores armazenados, caso seja verdadeiro saberemos que é um anagrama ,
                	//ele incrementa o valor armazenado isso vai nos ajudar na contagem mais tarde. 
                    anagramas.put(val, anagramas.get(val)+1);
                else 
                    anagramas.put(val, 1);
            }
        }
        int contaPares = 0;
        for(String key: anagramas.keySet()){// o laço for each será usado para percorrer cada chave e pegar seu valor. 
            int n = anagramas.get(key);
            contaPares += (n * (n-1))/2;// aqui saberemos o numero de pares 
        }
        System.out.println("Possui: " +contaPares +" anagramas.");
    }
}
