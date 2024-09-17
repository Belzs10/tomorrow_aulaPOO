package Produto;

public class ProdutoAlimenticio extends Produto{


    public ProdutoAlimenticio(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public double calcularPrecoFinal() {
        double desconto = 0.05;  // 5% de desconto
        return preco - (preco * desconto);
    }
}
