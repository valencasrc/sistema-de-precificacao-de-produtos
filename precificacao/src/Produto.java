public class Produto {
    //Variável estática
    static double custoEmbalagem;

    //Variáveis de instância
    double precoCusto;
    double precoVenda;

    double calcularCustosTotais(){
        return this.precoCusto + Produto.custoEmbalagem;
    }

    void alterarPrecoCusto(double precoCusto){
        this.precoCusto = precoCusto;
    }

    static void alterarCustoEmbalagem(double custoEmbalagem){
        Produto.custoEmbalagem = custoEmbalagem;
    }

    static void imprimirCustoEmbalagem(){
        System.out.printf("Custo com embalagem: %.2f%n", custoEmbalagem);
    }

}
