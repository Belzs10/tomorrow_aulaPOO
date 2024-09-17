package Funcionario;

public class Main {
    public static void main(String[] args) {
        Funcionario[] funcionarios = new Funcionario[2];

        funcionarios[0] = new FuncionarioHora("Carlinhos", 160, 50); // 160 horas, R$50 por hora
        funcionarios[1] = new FuncionarioMensal("Ana", 5000.00);  // Salário mensal de R$5000

        // Calculando e exibindo o salário de cada funcionário
        for (Funcionario funcionario : funcionarios) {
            System.out.println("Funcionário: " + funcionario.nome + " | Salário: R$ " + funcionario.calcularSalario());
        }
    }
}

