package br.com.alura.screenmatch.modelos;

public class Main {
    public static void main(String[] StrangThings) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("O Poderoso Chefão");
        meuFilme.setAnoLancamento(1988);
        meuFilme.setDuracaoEmMinutos(178);
        meuFilme.setIncluidoNoPlano(true);
        meuFilme.exibirFichaTecnica();
        meuFilme.avalia((double) 8.0F);
        meuFilme.avalia((double) 8.0F);
        meuFilme.avalia((double) 5.0F);
        //System.out.println("Nota: " + meuFilme.somaDasAvaliacoes);
        IO.println("Total de Avaliações: " + meuFilme.getTotalDeAvaliacoes());
        IO.println("Soma entre elas: " + meuFilme.pegaMedia());
        //meuFilme.somaDasAvaliacoes = 10;
        //meuFilme.somaDasAvaliacoes = 1;
        IO.println(meuFilme.pegaMedia());

        System.out.println();

        Serie strangthings = new Serie();
        strangthings.setNome("Strang Things");
        strangthings.setAnoLancamento(2016);
        strangthings.exibirFichaTecnica();
        strangthings.avalia(8.8);
        strangthings.setTemporadas(5);
        strangthings.setEpisodiosPorTemporada(9);
        strangthings.setMinutosPorEpisodio(55);
        System.out.println("Duração da Serie: " + strangthings.getDuracaoEmMinutos());
    }
}
