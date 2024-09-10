public class Computador {
    private String tipo;
    private String marca;
    private int memoriaRAM;
    private int armazenamento;

    public Computador(String tipo, String marca, int memoriaRAM, int armazenamento) {
        this.tipo = tipo;
        this.marca = marca;
        this.memoriaRAM = memoriaRAM;
        this.armazenamento = armazenamento;
    }

    public void exibirTipoComputador() {
        System.out.println("Tipo do computador: " + tipo);
    }

    public void exibirConfiguracoes() {
        System.out.println("Marca: " + marca + ", Memória RAM: " + memoriaRAM + "GB, Armazenamento: "
                + armazenamento + "GB");
    }
}
