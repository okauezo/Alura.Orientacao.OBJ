public class Main {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.nome = "O poderoso chefão";
        meuFilme.anoLancamento = 1988;
        meuFilme.duracaoEmMinutos = 178;
        meuFilme.somaDasAvaliacoes = 8.9;
        meuFilme.incluidoNoPlano = true;
        meuFilme.exibirFichaTecnica();
        meuFilme.avalia((double)8.0F);
        meuFilme.avalia((double)8.0F);
        meuFilme.avalia((double)5.0F);
        System.out.println("Nota: " + meuFilme.somaDasAvaliacoes);
        System.out.println("Total de Notas adicionadas: " + meuFilme.totalDeAvaliacoes);
        System.out.println("Soma entre elas: " + meuFilme.pegaMedia());
    }
}
