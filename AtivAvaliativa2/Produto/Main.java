package Produto;

public class Main {
    public static void main(String[] args) {
        Produto produtoEletronico = new ProdutoEletronico("Smartphone", 2000.00);
        Produto produtoAlimenticio = new ProdutoAlimenticio("Maçã", 5.00);

        // Exibindo o preço final de cada produto
        System.out.println("Produto: " + produtoEletronico.nome + " | Preço: " + produtoEletronico.preco + " | Preço final: R$ " + produtoEletronico.calcularPrecoFinal());
        System.out.println("Produto: " + produtoAlimenticio.nome + " | Preço: " + produtoAlimenticio.preco + " | Preço final: R$ " + produtoAlimenticio.calcularPrecoFinal());
    }
}
