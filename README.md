# Agenda Telefônica em Java

Este projeto é uma implementação simples de uma agenda telefônica em Java, que permite adicionar, consultar e remover contatos. O objetivo é demonstrar conceitos de Programação Orientada a Objetos (POO) e como trabalhar com listas em Java.

## Funcionalidades

- Adicionar Contato: Permite adicionar um novo contato à agenda.
- Consultar Contato: Permite consultar um contato pelo nome.
- Remover Contato: Permite remover um contato pelo nome.
- Listar Contatos: Permite listar todos os contatos da agenda.

## Estrutura do Projeto

O projeto consiste em três classes principais:

1. **Contato**: Representa um contato com atributos de nome, telefone e email.
2. **Agenda**: Gerencia uma lista de contatos, fornecendo métodos para adicionar, consultar e remover contatos.
3. **Principal**: Contém o método `main` para interagir com o usuário através do console.

## Como Executar

1. **Clone o repositório:**

    ```bash
    git clone https://github.com/seu-usuario/nome-do-repositorio.git
    ```

2. **Navegue até o diretório do projeto:**

    ```bash
    cd nome-do-repositorio
    ```

3. **Compile as classes Java:**

    ```bash
    javac *.java
    ```

4. **Execute o programa:**

    ```bash
    java Principal
    ```

## Exemplo de Uso

1. Ao executar o programa, você verá o seguinte menu:

    ```
    1. Adicionar Contato
    2. Consultar Contato
    3. Remover Contato
    4. Sair
    Escolha uma opção:
    ```

2. Escolha uma opção digitando o número correspondente e pressione Enter.
3. Siga as instruções para adicionar, consultar ou remover contatos.

## Estrutura do Código

### Classe Contato

```java
public class Contato {
    private String nome;
    private String telefone;
    private String email;

    public Contato(String nome, String telefone, String email) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }

    // Getters e Setters

    @Override
    public String toString() {
        return "Nome: " + nome + ", Telefone: " + telefone + ", Email: " + email;
    }
}
