package Senhas;

import java.util.*;
public class main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int chute = -1;
		int tentativas = 0;
		while(chute != 2018) {
			System.out.println("Chute um número");
			chute = input.nextInt();
			tentativas++;
			
		}
		System.out.println("Acertou !!!\nVocê demorou "+ (tentativas-1) + " vezes para acertar o número.");
		
		input.close();
		
	}
}
