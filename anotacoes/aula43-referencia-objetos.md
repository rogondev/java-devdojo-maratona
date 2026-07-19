# Aula 43 - Referência de Objetos

## 📝 O Conceito Central
*Aqui o curso inicia o comportamento das variáveis do tipo Reference. A melhor analogia que eu encontrei foi a do
"controle remoto", que armazena o endereço de memória que o objeto está alocado na memória Heap.*
---

## 🧠 Como Funciona por Trás dos Panos?
Quando utilizamos carro1 = carro2;, carro1 não aponta mais para os atributos originais e passa a aportar exatamente
para o mesmo endereço que carro2" **O que acontece na Stack:**
- **O que acontece na Heap:**

---

## 💻 Código de Exemplo
```java
### 1. Classe de Domínio

public class Carro{
    public String nome;
    public String modelo;
    public int ano;
}

### 2. Classe de Execução e Teste


public class CarroTest02{
    public static void main(String[] args){
        Carro carro1 = new Carro();
        carro1.nome = "Fusca";
        carro1.modelo = "Bala";
        carro1.ano = 1975;

        Carro carro2 = new Carro();
        carro2.nome = "Mustang";
        carro2.modelo = "GT500";
        carro2.ano = 1968;

        System.out.println("--- ANTES DA TROCA ---");
        System.out.println("Carro 1: " + carro1.nome); // Fusca
        System.out.println("Carro 2: " + carro2.nome); // Mustang

        // Copiando a referência de carro2 para carro1
        carro1 = carro2;
        // O objeto "Fusca Bala" foi perdido na memória Heap neste exato momento!

        System.out.println("\n--- DEPOIS DA TROCA (carro1 = carro2) ---");
        System.out.println("Carro 1: " + carro1.nome); // Mustang
        System.out.println("Carro 2: " + carro2.nome); // Mustang
    }
}