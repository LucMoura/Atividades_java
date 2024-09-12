package Media_aluno;

import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Aluno lucas = new Aluno();
		
		String nome;
		double nota;
		int matricula;
		
		System.out.println("Digite o nome do aluno: ");
		nome = input.next();
		lucas.setNome(nome);
		
		System.out.println("Insira a matricula");
		matricula = input.nextInt();
		lucas.setMatricula(matricula);
		
		System.out.println("Insira uma nota");
		nota = input.nextDouble();
		lucas.adicionarNota(nota);
		
		boolean veri = (nota >= 0 && nota <= 10);
		
		while (veri) {
			System.out.println("Digite um número menor que 0 ou maior que 10 para parar");
			System.out.println("Insira uma nota");
			nota = input.nextDouble();
			lucas.adicionarNota(nota);
		}
		
		lucas.calcularMedia();
		System.out.println(lucas.verificarSituacao());
		
		
	}
}
