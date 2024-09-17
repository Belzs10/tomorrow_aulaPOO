package Funcionario;

public class FuncionarioHora extends Funcionario{
    private double horasTrabalhadas;
    private double valorHora;

    public FuncionarioHora(String nome, double horasTrabalhadas, double valorHora) {
        super(nome);
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorHora = valorHora;
    }


    @Override
    public double calcularSalario() {
        return horasTrabalhadas * valorHora;
    }
}
