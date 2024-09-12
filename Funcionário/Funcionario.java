package Funcionário;

public class Funcionario {
	private String Nome;
	private double Salario;
	
	public double calcular_bonificacao() {
		return Salario*1.10;
	}
	
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public double getSalario() {
		return Salario;
	}
	public void setSalario(double salario) {
		Salario = salario;
	}
}
