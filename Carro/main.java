package Carro;

public class main {
	public static void main (String[] Args) {
		Carro chevette = new Carro();
		chevette.setModelo("Chevette");
		chevette.setAno(1989);
		chevette.setMarca("Chevrolet");
		
		System.out.println(chevette.descCarro());
		
	}
}
	