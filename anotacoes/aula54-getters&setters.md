# Aula 54 - Modificadores de Acesso, Encapsulamento e Getters/Setters

## 📝 O Conceito Central
Para ser um bom programador, precisamos seguir alguns princípios, como o princípio da **alta coesão** e 
o do **baixo acoplamento**.
*No princípio da alta coesão a classe possui uma única responsabilidade no sistema.
*No princípio do baixo acoplamento as classes se relacionam por uma camada de métodos para se preencherem.

---

## 🧠 Como Funciona?
Você declara um atributo como private, garante que ele só pode ser lido ou alterado pelo próprio
objeto. Nenhuma outra classe externa consegue enxergar ou modificar esse atributo diretamente.Para permitir
que outras classes interaja com atributos privados de forma controlada, utilizamos métodos que seguem 
convenções de nomenclatura no Java.

* A. Método Setter (set)

* B. Método Getter (get)

---

## 💻 Código de Exemplo
```java
public class Pessoa{
    // 1. Atributos PRIVADOS (Protegidos contra acesso direto)
    private String nome;
    private int idade;

    // 2. Método SETTER com Regra de Proteção (Baixo Acoplamento)
    public void setIdade(int idade){
        if (idade < 0) {
            System.out.println("Erro: Idade inválida!");
            return; // Interrompe a execução sem alterar a memória
        }
        this.idade = idade; // Atribui apenas se for um valor válido
    }

    // 3. Método GETTER para leitura segura
    public int getIdade(){
        return this.idade;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }
}