# Palestra Venkat Subramaniam Devoxx 2017
Link: https://www.youtube.com/watch?v=15X0qFtBqiQ
Link c�digo original: http://agiledeveloper.com/presentations/functional_programming_in_java_8.zip


*  goto � programa��o estruturada
![ExemploProgramacaoEstrutura](./imagens/ExemploProgramcaoEstruturada.png)
![ExemploProgramacaoEstrutura Bytecode](./imagens/ExemploProgramcaoEstruturadaBytecode.png)
* atribui��o � programa��o funcional


* Podemos passar objetos para fun��es
* Podemos criar objetos com fun��es
* Podemos retornar objetos de fun��es


* Fun��es de ordem superior
* Podemos passar fun��es para fun��es
* Podemos criar fun��es atrav�s de fun��es
* Podemos retornar fun��es de fun��es 


* Fun��es precisam ser puras
    * Fun��es puras n�o podem ter efeitos colaterais
        1. n�o podem mudar nada
        2. n�o dependem de nada que pode mudar


* M�todo � uma fun��o que pertence � uma classes ou � um objeto
    * Uma fun��o possui 4 caracter�sticas:
        1. nome
        2. tipo de retorno
        3. lista de par�metros
        4. corpo
![ExemploFuncao](./imagens/ExemploFuncao.png)


* Lambda expression
    * Caracter�sticas: 
        1. an�nima
        2. tipo de retorno inferido
        3. lista de par�metros
        4. corpo
![ExemploLambda](./imagens/ExemploLambda.png)


Imperativo | Declarativo
---------- | -----------
como | o qu�
mut�vel | tranforma
efeito col�teral | puro
passa objetos | passa fun��es tamb�m
dif�cil de compor | composi��o funcional


* Exemplo de viola��o de programa��o declarativa (imutabilidade)
![ExemploViolacaoProgramacaoDeclarativa](./imagens/ExemploViolacaoProgramacaoDeclarativa.png)


* Exemplo de programa��o funcional usando paralelismo
[Exemplo](./src/ExemploParalelismo.java)