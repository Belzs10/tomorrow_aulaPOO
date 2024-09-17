package Funcionario;

public abstract class Funcionario {
    public String nome;

    public Funcionario(String nome) {
        this.nome = nome;
    }

    public abstract double calcularSalario();
}
