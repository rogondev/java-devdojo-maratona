# Aula 46&47 - Return

## 📝 O Conceito Central
Existem métodos puramente executores com void e métodos com capacidade de retorno, que é quando **o método devolve um valor para quem o chamou**.
Pode ser outro método, ou não.
---

## 🧠 Como Funciona?
Ao acionar um método com retorno na classe de teste, a instrução da chamada passa a representar o próprio valor devolvido.
Você possui duas formas principais de lidar com essa informação na memória:
* Armazenando em uma Variável
* Consumo Direto (Sem Variável)
---

## 💻 Código de Exemplo
```java
public double divideDoisNumeros(double num1, double num2){
        if (num2 == 0) {
            return 0;
        }
        return num1 / num2;
    }