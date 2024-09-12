package Funcionário;

public class Gerente extends Funcionario {

	@Override
	public double calcular_bonificacao() {
		return getSalario()*1.20;
	}
	
}
