package Produto;

public abstract class Produto {
    public String nome;
    public double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }
    public abstract double calcularPrecoFinal();
}


