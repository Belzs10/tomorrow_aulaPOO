package ControleVeiculos;

public class Drone extends Veiculo implements Pilotavel {
    public Drone(int nivelBateria) {
        super(nivelBateria);
    }

    @Override
    public void pilotar() throws BateriaBaixaException {
        if (nivelBateria < 15) {
            throw new BateriaBaixaException("Bateria baixa! Não é possível pilotar o drone.");
        }
        System.out.println("Drone em movimento.");
    }
}
