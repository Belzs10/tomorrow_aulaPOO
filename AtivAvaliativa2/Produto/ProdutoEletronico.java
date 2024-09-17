package Produto;

public class ProdutoEletronico extends Produto{


    public ProdutoEletronico(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public double calcularPrecoFinal() {
        double desconto = 0.10;  // 10% de desconto
        return preco - (preco * desconto);
    }
}
