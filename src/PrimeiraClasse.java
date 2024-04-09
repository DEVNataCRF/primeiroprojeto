public class PrimeiraClasse {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: Até o Último Homem");

        int ano = 2017;
        System.out.println("Ano de lançamento: " + ano);
        boolean incluidoNoPlano = true;
        double notaDoFilme = 10;
        double media = (9.8 + 6.3 + 10.0) / 3;
        System.out.println(media);
        String sinopse;
        sinopse = """
                Filme: Até o Último Homem
                Filme de Guerra em que o cara salva geral com o poder de Deus
                Muito bom!
                ANo de Lançamento
                """ + ano;
        int classificacao = (int) (media /2);
        System.out.println(classificacao);

    }
}


