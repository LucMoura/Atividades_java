package Xadrez;
import java.util.*;
public class main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Digite a linha e a coluna da peça");
		int coluna = input.nextInt(), linha = input.nextInt();
		
		boolean veri = (coluna > 0 && coluna < 9 && linha > 0 && linha < 9);
		if (veri) {
			if ((linha + coluna)% 2 == 0) {
				System.out.println("1");
			}else {
				System.out.println("0");
			}
		}else {
			System.out.println("Tabuleiro fora do convencional");
		}
		
		
	}
}
