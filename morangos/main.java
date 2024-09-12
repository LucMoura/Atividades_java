package morangos;
import java.util.*;
public class main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int larg_1, comp_1, larg_2, comp_2;
		
		System.out.println("Digite a largura do primeiro terreno: ");
		larg_1 = input.nextInt();
		
		System.out.println("Digite o comprimento do primeiro terreno: ");
		comp_1 = input.nextInt();
		
		System.out.println("Digite a largura do segundo terreno: ");
		larg_2 = input.nextInt();
		
		System.out.println("Digite o comprimento do segundo terreno: ");
		comp_2 = input.nextInt();
		
		boolean cond = (larg_1 >= 1 && larg_1 <= 100 && comp_1 >= 1 && comp_1 <= 100 && larg_2 >= 1 && larg_2 <= 100 && comp_2 >= 1 && larg_2 <= 100);
		
		if (cond) {
			if ((larg_1 * comp_1) > (larg_2 * comp_2)) {
				System.out.println("O maior terreno é o primeiro");
			}else if ((larg_1 * comp_1) < (larg_2 * comp_2)) {
				System.out.println("O maior terreno é o segundo");
			}else {
				System.out.println("Os terrenos são iguais");
			}
		}else {
			System.out.println("Valor de terreno impossível");
		}
		
	}
}
