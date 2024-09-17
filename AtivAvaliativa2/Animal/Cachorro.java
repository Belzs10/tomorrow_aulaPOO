package Animal;

public class Cachorro extends Animal{
    public String tipo;

    @Override
    public void fazerSom() {
        System.out.println("O cachorro faz au-au.");
    }
}
