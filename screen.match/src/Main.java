void main() {
    Filme meuFilme = new Filme();
    meuFilme.nome = "O poderoso chefão";
    meuFilme.anoLancamento = 1988;
    meuFilme.duracaoEmMinutos = 178;
    meuFilme.incluidoNoPlano = true;
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
}
