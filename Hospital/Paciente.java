package Hospital;

import java.util.ArrayList;
import java.util.List;

public class Paciente extends Pessoa {
    private String condicao;
    private List<String> examesRealizados;

    public Paciente(String nome, int idade, String condicao) {
        super(nome, idade);
        this.condicao = condicao;
        this.examesRealizados = new ArrayList<>();
    }

    public void adicionarExame(String exame) {
        examesRealizados.add(exame);
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Condição: " + condicao);
        System.out.println("Exames realizados:");
        for (String exame : examesRealizados) {
            System.out.println("- " + exame);
        }
    }
}