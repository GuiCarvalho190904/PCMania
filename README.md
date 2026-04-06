# PCMania
Trabalho POO

Guilherme Carvalho de Araújo
9795
GET
Gemini

Vamos lá eu utilizei o Gemini para me auxiliar a fazer o exercício, para deixar claro que o intuito seria também aprender quero deixar anotado abaixo o que entendi sobre cada classe:

Algo que a IA não soube me ajudar:
Prompt: Eu estou fazendo a linha do meu computador mostrarPCconfigs pq ele diz: no usage?
O gemini não soube me ajudar com essa situação por exemplo, não entendi pq ficou como no usage, tentei seguir as dicas dele e não deu certo

HardwareBasico/SistemaOperacional/MemóriaUSB:
- A função dessas 3 classes fariam basicamente a mesma coisa pois elas são private como pede no enunciado para ninguém mexer no código e mudar a capacidade de Core i3 para tipo Core i7.
- Eu utilizei um Getter por causa de ser private, sendo assim a Main vai poder usar o getNome() e getCapacidade() onde busca as informações das classes.
- Além de ser importante ter o construtor nos códigos onde não acabo tendo que utilizar um objeto vazio. Tanto que eu fiquei me perguntando qual era a importância desse This e bem ele só pega o valor na Main para ser atribuído na classe
- Lembrando que a Composição serve para definir que 2 dessas classes obrigatoriamente devem vir montadas com o PC diferente da Agregação que seria como um Bônus se quer ou não quer que venha junto. 

Computador:
- Aqui vai ser onde coloco as 3 funções que comentei acima uma seria obrigatória ter SistemaOperacional, preciso fazer 3 arrays do HardwareBasico (vai armazenar espaços na memória do PC) e a agregação do USB. Aqui vai ser a onde vou mostrar as informações do meu PC, nome e preço.
Utilizando um pouco sobre o Gemini pude aprender mais sobre programação onde foi integrado um ? e : no for-each e o que esses dois fazem ela usa um Operador Ternário (um if/else resumido em uma linha) e eu achei interessante aplicar essa forma que foi passado pois é algo bem mais simples de integrar que eu não conhecia.

Cliente:
- O código cliente ele entra na loja para poder fazer a compra dos PCs a cada promoção que ele gostar coloca no carrinho. Como sabemos o cliente vai ter seu nome e CPF como qualquer outra pessoa onde poderia ser sua profissão ao invés do CPF e sem problemas.
-Eu coloquei um limite de até 10 compras no total pois achei mais simples de colocar o código assim, mas nada impede que poderia comprar quantos quiser até dizer chega, lembrando que a cada compra que fizer vai na onde esta null percorrendo desde o inicio e assim que preencher o espaço vazio ele da um break para não passar e ir ao próximo, até que eu faça a próxima compra.
- Por ultimo tenho uma linha total += pc.getPreco() onde ele vai somando o preço de cada PC para me informar o valor final.

Main:
- Nela coloco os dados das informações das promoções, preço e nome do cliente
- Criei um while onde defino quantas promoções estou comprando e até poder interromper ao digitar 0 e por fim mostro o total da compra.

Dentre todos os códigos que eu precisei fazer tive mais dúvidas em se fazer o Computador em sacar que precisava fazer 3 arrays, eu estava pensando em fazer HardwareBasico1,2,3 mas não fazia sentido além de implementar o USB como uma agregação. 

Pesquei um pouco no stackoverflow para para entender alguns códigos estou enviando abaixo:
https://stackoverflow.com/questions/49426913/how-does-the-ternary-operator-work

https://stackoverflow.com/questions/885937/what-is-the-difference-between-association-aggregation-and-composition
