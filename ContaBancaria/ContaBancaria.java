public class ContaBancaria {
    private String numConta;
    private double saldo;

    public ContaBancaria(String numConta, double saldo) {
        this.numConta = numConta;
        this.saldo = this.saldo;
    }
    // Método para depositar
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
        } else {
            System.out.println("Saque inválido. Verifique o saldo disponível.");
        }
    }

    public double getSaldo() {
        return this.saldo;
    }
}
