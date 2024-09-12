package Carro;

public class Carro {
	private int Ano;
	private String Modelo;
	private String Marca;
	
	public int getAno() {
		return Ano;
	}
	public void setAno(int ano) {
		Ano = ano;
	}
	public String getModelo() {
		return Modelo;
	}
	public void setModelo(String modelo) {
		Modelo = modelo;
	}
	public String getMarca() {
		return Marca;
	}
	public void setMarca(String marca) {
		Marca = marca;
	}
	
	public String descCarro() {
		return "Modelo: " + Modelo + " | " + "Ano: " + Ano + " | " +"Marca: " + Marca;
	}
}
