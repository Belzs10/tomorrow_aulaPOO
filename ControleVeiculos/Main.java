package ControleVeiculos;

public class Main {
    public static void main(String[] args) {
        // Criando um carro autônomo com 10% de bateria
        CarroAutonomo carro = new CarroAutonomo(10);

        // Tentando pilotar o carro
        try {
            carro.pilotar();
        } catch (BateriaBaixaException e) {
            System.out.println(e.getMessage());
        }

        // Recarregando o carro
        carro.recarregar(50);
        try {
            carro.pilotar();
        } catch (BateriaBaixaException e) {
            System.out.println(e.getMessage());
        }

        // Criando um drone com 20% de bateria
        Drone drone = new Drone(20);

        // Tentando pilotar o drone
        try {
            drone.pilotar();
        } catch (BateriaBaixaException e) {
            System.out.println(e.getMessage());
        }
    }
}
