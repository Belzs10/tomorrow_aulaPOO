public class Celular {
    private String marca;
    private String modelo;
    private int nivelBateria;

    // Construtor
    public Celular(String marca, String modelo, int nivelBateria) {
        this.marca = marca;
        this.modelo = modelo;
        this.nivelBateria = nivelBateria;
    }

    // Método para usar o celular (reduz o nível da bateria em 10%)
    public void usarCelular() {
        if (nivelBateria > 0) {
            nivelBateria -= 10;
            if (nivelBateria < 0) {
                nivelBateria = 0;
            }
            System.out.println("Você usou o celular. Nível de bateria: " + nivelBateria + "%");
        }
        if (nivelBateria == 0) {
            System.out.println("Bateria esgotada! Por favor, carregue o celular.");
        }
    }

    // Método para carregar o celular (aumenta o nível da bateria em 10%)
    public void carregarCelular() {
        if (nivelBateria < 100) {
            nivelBateria += 10;
            if (nivelBateria > 100) {
                nivelBateria = 100;
            }
            System.out.println("Carregando celular. Nível de bateria: " + nivelBateria + "%");
        } else {
            System.out.println("Bateria cheia! Nível de bateria: 100%");
        }
    }
}
