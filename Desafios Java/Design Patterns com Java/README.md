# Desafio DIO — Design Patterns com Java: Dos Clássicos (GoF) ao Spring Framework

Projeto didático de uma pequena loja, criado a partir do desafio de padrões de projeto. O fluxo de criação de pedidos mostra três padrões em um caso de uso próprio.

## Padrões aplicados

- **Singleton:** `RegistroPedidos` usa inicialização lazy pelo padrão Holder e uma coleção segura para acesso concorrente.
- **Strategy:** `EstrategiaPagamento` permite variar o pagamento sem mudar a fachada; há implementações para PIX e cartão.
- **Facade:** `FacadePedidos` oferece uma operação simples para validar os dados, cobrar e registrar o pedido.

## Executar

Requisito: JDK 17 ou superior. Na raiz do projeto, compile e execute:

```powershell
javac -d out (Get-ChildItem -Recurse src/main/java -Filter *.java | ForEach-Object FullName)
java -cp out br.com.dio.pedidos.Principal
```

O programa cria um pedido com PIX e outro com cartão, imprime as confirmações e mostra o total de vendas.

## Estrutura

```text
src/main/java/br/com/dio/pedidos/
├── Principal.java
├── infra/       # fachada e registro compartilhado
├── pagamento/   # estratégia e formas de pagamento
└── pedido/      # modelo de pedido
```

## Evoluções possíveis

- Adicionar novas estratégias de pagamento, como boleto ou carteira digital.
- Persistir os pedidos em banco de dados e expor uma API REST com Spring.
- Cobrir validações e regras com testes automatizados.

## Referências do laboratório

- [Java puro — lab-padroes-projeto-java](https://github.com/digitalinnovationone/lab-padroes-projeto-java)
- [Spring — lab-padroes-projeto-spring](https://github.com/digitalinnovationone/lab-padroes-projeto-spring)

Os materiais do ZIP foram usados como referência para Singleton, Strategy e Facade; este repositório contém uma implementação independente para pedidos e pagamentos.
