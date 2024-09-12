package Endereco;

public class Endereco {
	private String Rua;
	private int Numero;
	private String Cidade;
	
	
	public Endereco(String rua, int numero, String cidade) {
		super();
		Rua = rua;
		Numero = numero;
		Cidade = cidade;
	}
	public String getRua() {
		return Rua;
	}
	public void setRua(String rua) {
		Rua = rua;
	}
	public int getNumero() {
		return Numero;
	}
	public void setNumero(int numero) {
		Numero = numero;
	}
	public String getCidade() {
		return Cidade;
	}
	public void setCidade(String cidade) {
		Cidade = cidade;
	}
	

	public String getEnderecoCompleto() {
		return "Endereco [Rua=" + Rua + ", Numero=" + Numero + ", Cidade=" + Cidade + "]";
	}
}
