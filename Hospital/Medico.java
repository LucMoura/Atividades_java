package Hospital;

import java.util.ArrayList;
import java.util.List;

public class Medico extends Pessoa {
    private String funcao;
    private List<Paciente> historicoPacientes = new ArrayList <> ();

    public Medico(String nome, int idade, String funcao) {
        super(nome, idade);
        this.funcao = funcao;
        this.historicoPacientes = new ArrayList<>();
    }

    public void adicionarPaciente(Paciente paciente) {
        historicoPacientes.add(paciente);
    }

    public void removerPaciente(Paciente paciente) {
        historicoPacientes.remove(paciente);
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Função: " + funcao);
        System.out.println("Histórico de pacientes atendidos:");
        for (Paciente paciente : historicoPacientes) {
            System.out.println("- " + paciente.getNome());
        }
    }
}