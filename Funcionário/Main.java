package Funcionário;

public class Main {
	public static void main (String[] args) {
		Funcionario Lucas = new Funcionario();
		Funcionario Lorwan = new Gerente();
		Funcionario Irinea = new Desenvolvedor();
		
		Lucas.setSalario(1200);
		Lorwan.setSalario(2000);
		Irinea.setSalario(4000);
		
		System.out.println(Lucas.calcular_bonificacao());
		System.out.println(Lorwan.calcular_bonificacao());
		System.out.println(Irinea.calcular_bonificacao());
	}
}
