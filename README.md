# Estrutura Condicional em Java: `switch case`

Este repositório apresenta exemplos práticos de como utilizar a estrutura de controle `switch case` na linguagem Java. Ela é ideal para simplificar o código quando temos uma única variável que pode assumir múltiplos valores específicos.

---

## 🚀 Como Funciona?

O `switch` recebe uma variável e testa seu valor contra uma lista de casos (`case`). Quando encontra uma correspondência, executa o bloco de código associado até encontrar a palavra-chave `break`.

### ⚠️ Regras Importantes:
* **O papel do `break`:** Se você esquecer o `break` ao final de um `case`, o Java continuará executando os códigos dos próximos casos em sequência (efeito *fall-through*), mesmo que eles não correspondam ao valor.
* **O papel do `default`:** É o caso padrão. Ele roda se o valor da variável não se encaixar em nenhum dos `case` especificados. É o equivalente ao `else`.
* **Tipos permitidos:** O `switch` aceita tipos primitivos como `int`, `char`, `byte`, `short`, além de `String` e `enums`.

---

## 💻 Exemplo de Código

O exemplo abaixo simula um menu de atendimento eletrônico:

```java
public class MenuAtendimento {
    public static void main(String[] args) {
        int opcao = 2;

        switch (opcao) {
            case 1:
                System.out.println("Carregando o seu saldo...");
                break;
            case 2:
                System.out.println("Gerando o seu extrato em PDF...");
                break;
            case 3:
                System.out.println("Encaminhando para um atendente humano.");
                break;
            default:
                System.out.println("Opção inválida. Digite um número de 1 a 3.");
                break;
        }
    }
}
