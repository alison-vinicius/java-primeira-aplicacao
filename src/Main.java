//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("esse é o scrren match");
        System.out.println("Filme: Top Gun: Maverick");

        int anoDeLancamento = 2022;
        System.out.println("ano de lançamento:" + anoDeLancamento);
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;
        double media = (9.8 + 6.3 + 8.0)/3;
        System.out.println(media);

        String sinopse;
        sinopse = """
            Filme Top Gun
            Filme de aventura com galã dos anos 90
            Muito bom!
            Ano de lançamento 
            
        """ + anoDeLancamento;

        System.out.println(sinopse);

        int classficacao;
        classficacao = (int) (media/2);
        System.out.println(classficacao);


    }
}