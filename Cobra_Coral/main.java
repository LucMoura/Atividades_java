package Cobra_Coral;
import java.util.*;
public class main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Digite a sequencia das cores: ");
		int num_1 = input.nextInt(),num_2 = input.nextInt(),num_3 = input.nextInt(),num_4 = input.nextInt();
		
		boolean veri = (num_1 < 10 && num_1 > 0 && num_2 < 10 && num_2 > 0 && num_3 < 10 && num_3 > 0 && num_4 < 10 && num_4 > 0);
		if (veri) {
			if (num_2 == num_4) {
				System.out.println("V");
			}else {
				System.out.println("F");
			}
		}
		else {
			System.out.println("Código inválido");
		}
	}
}
