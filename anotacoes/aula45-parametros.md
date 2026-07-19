# Aula 45 - Metodos - Parâmetro

## 📝 O Conceito Central
**O parâmetro do método é uma NOVA variável.**
**O parâmetro do método é uma NOVA variável.**
**O parâmetro do método é uma NOVA variável.**
**O parâmetro do método é uma NOVA variável.**


Um parâmetro é uma variável declarada na assinatura de um método (ou função) que recebe um valor quando o método é chamado
---

## 🧠 Como Funciona?
O Java trabalha apenas com passagem por valor. Isso significa que a JVM sempre tira uma foto (cópia) do dado enviado e joga dentro do Stack Frame do método.

A forma como essa cópia funciona depende do tipo do parâmetro:

### 1. Tipos Primitivos (`int`, `double`, `boolean`...)
* A JVM copia o valor real diretamente para a gaveta do método.
* Se você passa um `int x = 10;`, a JVM cria uma cópia exata do número 10.
* O método altera essa cópia à vontade.
* A variável original do lado de fora permanece intocada.

### 2. Tipos de Objeto (`String`, `List`, classes criadas por você)
* A JVM copia o endereço de memória (a referência) que aponta para o depósito (Heap).
* Se você passa um objeto `Cliente`, a JVM não duplica o cliente inteiro.
* Ela copia o "cartão de visitas" que diz onde o cliente está no depósito.
* O método ganha o seu próprio cartão de visitas (cópia do endereço).

> **Consequência:** Como ambos os cartões apontam para o mesmo cliente no depósito, se o método alterar o nome do cliente, a mudança reflete do lado de fora.

---

## 💻 Código de Exemplo
```java

