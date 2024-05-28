public class Principal {

    public static void main(String[] args) {
       Produto.custoEmbalagem = 100;

       Produto novoProduto = new Produto();
       //produto.precoCusto = 100;
        novoProduto.alterarPrecoCusto(80);


        ServicoDePrecificacao servicoDePrecificacao = new ServicoDePrecificacao();

        servicoDePrecificacao.definirPrecoVenda(novoProduto, 20);

        System.out.printf("Preço de venda: %.2f", novoProduto.precoCusto);
        System.out.printf("Preço de venda: %.2f", novoProduto.precoVenda);

    }

}
