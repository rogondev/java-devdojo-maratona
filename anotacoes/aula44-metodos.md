# Aula 44 - Métodos

## 📝 O Conceito Central
*"Enquanto a classe atribuía uma característica, o método me parece atribuir uma função, um comportamento, uma ação."*
*Por isso ao invés do "=" utilizado para atribuir, o método utiliza {} que contém meio que uma ordem, uma coordenada.*
*O objeto passa a ganhar um comportamento, portanto tudo que estiver dentro dos {} será executado quando o metodo for chamado*
*O método devolve um valor para quem o chamou, quando utilziado o return. Métodos que não devolvem nada possuem void, o que nao obrigatoriamente o metodo não possa imprimir*

---

## 🧠 Como Funciona?
*Quando a JVM encontra uma chamada de método no código, o fluxo do programa se comporta da seguinte maneira:*
- **1. A linha atual na classe de teste é pausada.**
- **2. O ponteiro de execução "salta" para dentro do objeto referenciado na memória Heap.**
- **3. As instruções internas do método da classe de domínio são executadas linha por linha.**
- **4. Ao encontrar o fim do método, a JVM "retorna" exatamente para a linha seguinte de onde a chamada ocorreu na classe de teste, dando continuidade ao programa.**

---

## 💻 Código de Exemplo
```java
public void somaDoisNumeros() {
        System.out.println(10 + 10);
    }

    public void subtraiDoisNumeros() {
        System.out.println(22 - 2);
    }