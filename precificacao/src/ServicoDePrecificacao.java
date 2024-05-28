public class ServicoDePrecificacao {

    void definirPrecoVenda(Produto produto, double percentualMargemLucro){
        //poderia ter calculos muito mais complexos aqui

        double precoVendaCalculado = Matematica.calcularAcrescimo(produto.precoCusto, percentualMargemLucro);

        precoVendaCalculado += Produto.custoEmbalagem;

        produto.precoVenda = precoVendaCalculado;
    }

}
