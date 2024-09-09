public class Main {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("12345", 1000.00);

        // Exibe o saldo inicial
        System.out.println("Saldo inicial: R$" + conta.getSaldo());

        // Realiza um depósito
        conta.depositar(500.00);
        System.out.println("Saldo após depósito: R$" + conta.getSaldo());

        // Tenta realizar um saque
        conta.sacar(300.00);
        System.out.println("Saldo após saque: R$" + conta.getSaldo());

        // Tenta realizar um saque com valor maior que o saldo
        conta.sacar(1500.00);
        System.out.println("Saldo final: R$" + conta.getSaldo());
    }

}
