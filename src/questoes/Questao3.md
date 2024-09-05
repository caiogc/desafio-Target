# Desafio Target

Autor: Caio Guilherme Costa Carvalho


## Questão 3
**Observe o trecho de código abaixo: int INDICE = 12, SOMA = 0, K = 1; enquanto K < INDICE faça { K = K + 1; SOMA = SOMA + K; } imprimir(SOMA);**
**Ao final do processamento, qual será o valor da variável SOMA?**

    INDICE = 12, SOMA = 0, K = 1;
    
    enquanto K < INDICE faça {
        K = K + 1;
        SOMA = SOMA + K;
    }
    imprimir(SOMA);

[quando K = 1]: K = 1 + 1 = 2, SOMA = 0 + 2 = 2
[quando K = 2]: K = 2 + 1 = 3, SOMA = 2 + 3 = 5
[quando K = 3]: K = 3 + 1 = 4, SOMA = 5 + 4 = 9
[quando K = 4]: K = 4 + 1 = 5, SOMA = 9 + 5 = 14
[quando K = 5]: K = 5 + 1 = 6, SOMA = 14 + 6 = 20
[quando K = 6]: K = 6 + 1 = 7, SOMA = 20 + 7 = 27
[quando K = 7]: K = 7 + 1 = 8, SOMA = 27 + 8 = 35
[quando K = 8]: K = 8 + 1 = 9, SOMA = 35 + 9 = 44
[quando K = 9]: K = 9 + 1 = 10, SOMA = 44 + 10 = 54
[quando K = 10]: K = 10 + 1 = 11, SOMA = 54 + 11 = 65
[quando K = 11]: K = 11 + 1 = 12, SOMA = 65 + 12 = 77

**SOMA será 77**.	

[**VER OUTRAS QUESTÕES**](https://github.com/caiogc/desafio-Target#quest%C3%B5es)