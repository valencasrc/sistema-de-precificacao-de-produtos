# sistema-de-precificacao-de-produtos

Projeto Java: Sistema de Precificação de Produtos
Este projeto em Java implementa um sistema para calcular o preço de venda de produtos com base no preço de custo, margem de lucro e custo de embalagem.

O projeto é composto pelas seguintes classes:

Matematica: Esta classe fornece uma função estática para calcular o acréscimo de um percentual a um valor.
Produto: Esta classe representa um produto com os atributos precoCusto, precoVenda e custoEmbalagem. Ela também possui métodos para calcular o custo total do produto, alterar o preço de custo e imprimir o custo da embalagem.
ServicoDePrecificacao: Esta classe fornece um serviço para definir o preço de venda de um produto com base no preço de custo e margem de lucro.
Funcionalidades
O sistema de precificação de produtos oferece as seguintes funcionalidades:

Calcular o custo total de um produto, incluindo o preço de custo e o custo da embalagem.
Alterar o preço de custo de um produto.
Definir o preço de venda de um produto com base no preço de custo e margem de lucro.
Imprimir o custo da embalagem de um produto.
Como Usar
Para usar o sistema de precificação de produtos, você pode criar um objeto da classe Produto e usar os métodos da classe ServicoDePrecificacao para definir o preço de venda do produto.

Exemplo de Uso

Produto produto = new Produto();
produto.precoCusto = 100;

ServicoDePrecificacao servicoDePrecificacao = new ServicoDePrecificacao();
servicoDePrecificacao.definirPrecoVenda(produto, 20);

System.out.println("Preço de venda: " + produto.precoVenda);

# Sistema de Precificação de Produtos

Este projeto em Java implementa um sistema para calcular o preço de venda de produtos com base no preço de custo, margem de lucro e custo de embalagem.

## Funcionalidades

* Calcular o custo total de um produto, incluindo o preço de custo e o custo da embalagem.
* Alterar o preço de custo de um produto.
* Definir o preço de venda de um produto com base no preço de custo e margem de lucro.
* Imprimir o custo da embalagem de um produto.

## Como Usar

Para usar o sistema de precificação de produtos, você pode criar um objeto da classe `Produto` e usar os métodos da classe `ServicoDePrecificacao` para definir o preço de venda do produto. 

## Exemplo de Uso

```java
Produto produto = new Produto();
produto.precoCusto = 100;

ServicoDePrecificacao servicoDePrecificacao = new ServicoDePrecificacao();
servicoDePrecificacao.definirPrecoVenda(produto, 20);

System.out.println("Preço de venda: " + produto.precoVenda);
