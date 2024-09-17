package Animal;

public class TesteAnimal {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();

        cachorro.nome = "Carlitos";
        cachorro.idade = 9;
        cachorro.tipo = "Malamute";

        System.out.println("Nome: " + cachorro.nome);
        System.out.println("Nome: " + cachorro.idade);
        System.out.println("Nome: " + cachorro.tipo);
        cachorro.fazerSom();
    }
}
