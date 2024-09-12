package Media_aluno;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
    private String nome;
    private int matricula;
    private List<Double> notas = new ArrayList <> ();



	public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public List<Double> getNotas() {
        return notas;
    }

    public void setNotas(List<Double> notas) {
        this.notas = notas;
    }


    public void adicionarNota(double nota) {
        this.notas.add(nota);
    }

    public double calcularMedia() {
        if (notas.isEmpty()) {
            return 0.0;
        }

        double soma = 0.0;
        for (double nota : notas) {
            soma += nota;
        }
        return soma / notas.size();
    }

    public String verificarSituacao() {
        double media = calcularMedia();
        if (media >= 7.0) {
            return "Aprovado";
        } else {
            return "Reprovado";
        }
    }
}
