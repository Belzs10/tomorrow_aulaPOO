package Forma;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Criando uma lista de formas
        ArrayList<Forma> formas = new ArrayList<>();

        Forma retangulo = new Retangulo(5, 10);  // largura 5, altura 10
        Forma circulo = new Circulo(7);          // raio 7

        // Adicionando as formas à lista
        formas.add(retangulo);
        formas.add(circulo);

        for (Forma forma : formas) {
            System.out.println("Área da forma: " + forma.calcularArea());
        }
    }
}
