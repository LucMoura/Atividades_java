package Funcionário;

public class Desenvolvedor extends Funcionario {
	@Override
	public double calcular_bonificacao() {
		return getSalario()*1.15;
	}

}
