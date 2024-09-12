package Endereco;

public class Main {
	public static void main(String[] args) {
		Endereco endereco = new Endereco("Rua Professora de Nair Siqueira", 355, "Aracaju");
		Pessoa pessoa = new Pessoa("Lucas", endereco);
		
		System.out.println("Endereço completo: " + pessoa.getEnderecoCompleto());
	}
}
