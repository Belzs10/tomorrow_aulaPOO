package ControleVeiculos;

class Veiculo {
    protected int nivelBateria; // nível da bateria em porcentagem

    public Veiculo(int nivelBateria) {
    }

    public void Veiculo(int nivelBateria) {
        this.nivelBateria = nivelBateria;
    }

    public int getNivelBateria() {
        return nivelBateria;
    }
}
