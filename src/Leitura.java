import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("digite seu filme favorito:");
        String filme = leitura.nextLine();
        System.out.println("qual o ano de lançamento?");
        int anoDeLancamento = leitura.nextInt();
        System.out.println("qual a sua avaliação?");
        double avaliacao = leitura.nextDouble();

        String mensagem = """
                filme: %s
                ano de lançamento: %d
                avaliação: %f
                """.formatted(filme, anoDeLancamento, avaliacao);
        System.out.println(mensagem);




    }
}
