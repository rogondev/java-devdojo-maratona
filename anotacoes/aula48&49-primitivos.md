# Aula 48&49 - Métodos - Parâmetro Tipo Referência

## 📝 O Conceito Central
**O parâmetro do método é uma NOVA variável.**
**O parâmetro do método é uma NOVA variável.**
**O parâmetro do método é uma NOVA variável.**
**O parâmetro do método é uma NOVA variável.**
A variável primitiva do método nasce e morre exatamente naquele instante em que o método e chamado. A variável original nunca e alterada na chamada do método


---

## 🧠 Como Funciona?
Quando você envia uma variável de tipo primitivo (int, double, float, char, etc.) como argumento para um método, 
a JVM nunca envia o endereço ou a referência real daquela variável na memória. Em vez disso, ela realiza uma 
cópia exata dos bits (do valor) e injeta essa cópia isolada dentro das variáveis locais do método (os parâmetros).

Qualquer modificação, reatribuição ou cálculo matemático feito sobre os parâmetros dentro do método não causará nenhum impacto ou alteração na variável original que estava na classe de teste. Ao término do método, as variáveis cópias morrem no escopo local, enquanto as originais permanecem intactas.

---

## 💻 Código de Exemplo
```java
// Cole aqui o trecho de código mais importante que resume o aprendizado
public class Exemplo {
    // ...
}