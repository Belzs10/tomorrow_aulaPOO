package ControleVeiculos;

class CarroAutonomo extends Veiculo implements Pilotavel, Recarregavel {

    public CarroAutonomo(int nivelBateria) {
        super(nivelBateria);
    }

    @Override
    public void pilotar() throws BateriaBaixaException {
        if (nivelBateria < 15){
            throw new BateriaBaixaException("Bateria baixa! Não é possível pilotar o carro.");
        }
        System.out.println("Carro Autônomo em movimento.");
    }

    @Override
    public void recarregar(int quantidade) {
        nivelBateria += quantidade;
        if  (nivelBateria > 100) {
            nivelBateria = 100;
        }
        System.out.println("Carro recarregado. Nível de bateria: " + nivelBateria + "%");
    }
}
