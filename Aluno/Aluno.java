public class Aluno {
    private String nome;
    private double atv1Nota;
    private double atv2Nota;

    public Aluno(String nome, double atv1Nota, double atv2Nota) {
        this.nome = nome;
        this.atv1Nota = atv1Nota;
        this.atv2Nota = atv2Nota;
    }

    public void calcularMedia() {
        double media = (atv1Nota + atv2Nota) / 2;
        System.out.println("A média do aluno " + nome + " é: " + media);
    }

    public void verificarAprovacao() {
        double media = (atv1Nota + atv2Nota) / 2;
        if (media >= 6.0) {
            System.out.println("O aluno " + nome + " está aprovado.");
        } else {
            System.out.println("O aluno " + nome + " está reprovado.");
        }
    }
}
