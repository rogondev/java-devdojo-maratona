# Aula 52 - Métodos - Varargs (Variable Arguments)

## 📝 O Conceito Central
O varags permite que um método aceite zero ou múltiplos argumentos de um mesmo tipo, separados por vírgula,
sem que o desenvolvedor precise instanciar explicitamente um Array na chamada do método.
---

## 🧠 Como Funciona?
*O Varargs deve ser o último parâmetro do método.
*Não é permitido ter dois Varargs no mesmo método: (int... a, String... b).
*Os três pontos ... vêm logo após o tipo, e não antes: (int numeros...).
---

## 💻 Código de Exemplo
```java
// Chamada tradicional (com o Array tradicional):
calc.somaArray(new int[]{1, 2, 3, 4, 5});

// Chamada com Varargs (muito mais limpa):
calc.somaVarArgs(1, 2, 3, 4, 5);