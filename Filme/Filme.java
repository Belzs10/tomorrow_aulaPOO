public class Filme {
    private String titulo;
    private int duracaoEmMinutos;
    private String genero;

    public Filme(String titulo, int duracaoEmMinutos, String genero) {
        this.titulo = titulo;
        this.duracaoEmMinutos = duracaoEmMinutos;
        this.genero = genero;
    }

    public void exibirInformacoes() {
        System.out.println("Título: " + titulo);
        System.out.println("Duração: " + duracaoEmMinutos + " minutos");
        System.out.println("Gênero: " + genero);
    }
    public void calcularDuracaoHoras() {
        int horas = duracaoEmMinutos / 60;
        int minutos = duracaoEmMinutos % 60;
        System.out.println("Duração: " + horas + " horas e " + minutos + " minutos");
    }

    /*int horas = duracaoEmMinutos / 60;
    Essa linha divide a duração total do filme (em minutos) por 60 para calcular o número de horas. Como estamos usando uma variável do tipo int, o resultado será um número inteiro, ou seja, a parte inteira da divisão (o número de horas completas).
    Exemplo: Se o filme tem 195 minutos, a divisão 195 / 60 resulta em 3 horas.

    int minutos = duracaoEmMinutos % 60;
    Aqui, usamos o operador de resto (%), que retorna o que sobra da divisão. Isso nos dá os minutos restantes depois de calcular as horas.
    Exemplo: 195 % 60 resulta em 15, pois após contar 3 horas (180 minutos), sobram 15 minutos.
    System.out.println("Duração: " + horas + " horas e " + minutos + " minutos");

    Esta linha imprime a duração do filme no formato "X horas e Y minutos", concatenando as variáveis horas e minutos com o texto apropriado.
    No exemplo, o filme de 195 minutos será exibido como "3 horas e 15 minutos".*/
}
